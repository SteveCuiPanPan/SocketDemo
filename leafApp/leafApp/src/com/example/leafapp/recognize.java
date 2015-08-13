package com.example.leafapp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.utils.SocketClientUtil;
//import com.example.leafapp.R;
//import com.example.leafapp.recognize;
public class recognize extends Activity implements OnClickListener{
	private static final int TAKE_PICTURE = 0;
	private static final int CHOOSE_PICTURE = 1;

	private static final int SCALE = 4;//缩小的倍数
	private ImageView iv_image = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recognizeleaf);

		iv_image = (ImageView) this.findViewById(R.id.img);

		Button btn=(Button) findViewById(R.id.btn);
		btn.setOnClickListener(this);

		Button btn2=(Button) findViewById(R.id.btn2);
		btn2.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {
		switch(arg0.getId()){
		case R.id.btn:
			showPicturePicker(recognize.this);
			break;
		case R.id.btn2:

			try {

				StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());

				sendDataBySocket();

				receiveDataFromSocket();	

			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		}

	}

	/**
	 * 发送socket数据
	 */
	public void sendDataBySocket(){

		iv_image.setDrawingCacheEnabled(true);
		Bitmap bitmap = iv_image.getDrawingCache();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();  
		//读取图片到ByteArrayOutputStream                      
		bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);

		iv_image.setDrawingCacheEnabled(false);
		byte[] bytes = baos.toByteArray();

		SocketClientUtil.sendData(bytes);
	}

	/**
	 * 接收socket数据
	 */
	public void receiveDataFromSocket(){
		StringBuffer result=new StringBuffer();
		ByteArrayOutputStream outPut = new ByteArrayOutputStream();  
		
		byte[] data=SocketClientUtil.receiveData(result);
		Bitmap bmp = BitmapFactory.decodeByteArray(data, 0, data.length);    
		bmp.compress(CompressFormat.PNG, 100, outPut);    
		iv_image.setImageBitmap(bmp);

		Toast.makeText(getBaseContext(), result.toString(), Toast.LENGTH_LONG).show();
	}


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == RESULT_OK) {
			switch (requestCode) {
			case TAKE_PICTURE:
				//将保存在本地的图片取出并缩小后显示在界面上 
				Bitmap bitmap = BitmapFactory.decodeFile(Environment.getExternalStorageDirectory()+"/image.jpg");
				Bitmap newBitmap = ImageTools.zoomBitmap(bitmap, bitmap.getWidth() / SCALE, bitmap.getHeight() / SCALE);
				//由于Bitmap内存占用较大，这里需要回收内存，否则会报out of memory异常
				bitmap.recycle();

				//将处理过的图片显示在界面上，并保存到本地
				iv_image.setImageBitmap(newBitmap);
				ImageTools.savePhotoToSDCard(newBitmap, Environment.getExternalStorageDirectory().getAbsolutePath(), String.valueOf(System.currentTimeMillis()));
				break;

			case CHOOSE_PICTURE:
				ContentResolver resolver = getContentResolver();
				//照片的原始资源地址
				Uri originalUri = data.getData(); 
				try {
					//使用ContentProvider通过URI获取原始图片 
					Bitmap photo = MediaStore.Images.Media.getBitmap(resolver, originalUri);
					if (photo != null) {
						//为防止原始图片过大导致内存溢出，这里先缩小原图显示，然后释放原始Bitmap占用的内存 
						Bitmap smallBitmap = ImageTools.zoomBitmap(photo, photo.getWidth() /2, photo.getHeight() /2);
						//释放原始图片占用的内存，防止out of memory异常发生
						photo.recycle();
						iv_image.setImageBitmap(smallBitmap);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}  
				break;

			default:
				break;
			}
		}
	}

	public void showPicturePicker(Context context){
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("获取叶片");
		builder.setNegativeButton("取消", null);
		builder.setItems(new String[]{"拍照","相册"}, new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
				case TAKE_PICTURE:
					Intent openCameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
					Uri imageUri = Uri.fromFile(new File(Environment.getExternalStorageDirectory(),"image.jpg"));
					//指定照片保存路径（SD卡），image.jpg为一个临时文件，每次拍照后这个图片都会被替换
					openCameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
					startActivityForResult(openCameraIntent, TAKE_PICTURE);
					break;

				case CHOOSE_PICTURE:
					Intent openAlbumIntent = new Intent(Intent.ACTION_GET_CONTENT);
					openAlbumIntent.setType("image/*");
					startActivityForResult(openAlbumIntent, CHOOSE_PICTURE);
					break;

				default:
					break;
				}
			}
		});
		builder.create().show();
	}

}
