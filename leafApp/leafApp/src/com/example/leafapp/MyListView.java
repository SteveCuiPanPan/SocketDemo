package com.example.leafapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class MyListView  extends ListActivity
{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.browse,
                new String[]{"title","img"},
                new int[]{R.id.title,R.id.img});
        setListAdapter(adapter);
    }
 
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
 
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "°×ÏğÄ¾");
        map.put("img", R.drawable.data0);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "°×ÓÜ");
        map.put("img", R.drawable.data1);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "±±¾©¶¡Ïã");
        map.put("img", R.drawable.data2);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "´¹ÁøÒ¶");
        map.put("img", R.drawable.data3);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "´ó³İÑî");
        map.put("img", R.drawable.data4);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "´óÉ½Ó£");
        map.put("img", R.drawable.data5);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "¶ÅÖÙ");
        map.put("img", R.drawable.data6);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "¶à»¨º£ÌÄ");
        map.put("img", R.drawable.data7);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "·ãÒ¶");
        map.put("img", R.drawable.data8);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "¹ãÓñÀ¼");
        map.put("img", R.drawable.data9);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "ºÏ»¶");
        map.put("img", R.drawable.data10);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "ºÚºËÌÒ");
        map.put("img", R.drawable.data11);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ºÚèİ");
        map.put("img", R.drawable.data12);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "ºÚÏğ½ºÊ÷");
        map.put("img", R.drawable.data13);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ºÚÒ°Ó£");
        map.put("img", R.drawable.data14);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "ºìÉ£");
        map.put("img", R.drawable.data15);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ºş±±º£ÌÄ");
        map.put("img", R.drawable.data16);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "»Æ°Ø");
        map.put("img", R.drawable.data17);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "»Æ½ğÊ÷");
        map.put("img", R.drawable.data18);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "»ÒºúÌÒ");
        map.put("img", R.drawable.data19);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "¼¦×¦éÊ");
        map.put("img", R.drawable.data20);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "¼âÍ·Ä¾À¼");
        map.put("img", R.drawable.data21);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "é·Ê÷");
        map.put("img", R.drawable.data22);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÀÆÓÜ");
        map.put("img", R.drawable.data23);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Á÷ËÕÊ÷");
        map.put("img", R.drawable.data24);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "èïÊ÷");
        map.put("img", R.drawable.data25);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÂäÓğÉ¼");
        map.put("img", R.drawable.data26);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Æ¤É½ºËÌÒ");
        map.put("img", R.drawable.data27);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Æ»¹û");
        map.put("img", R.drawable.data28);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÆĞÌáÒ¶");
        map.put("img", R.drawable.data29);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÈÕ±¾ÔçÓ£");
        map.put("img", R.drawable.data30);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÈáÃ«É½ºËÌÒ");
        map.put("img", R.drawable.data31);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Èı½ÇÑî");
        map.put("img", R.drawable.data32);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É£Ê÷");
        map.put("img", R.drawable.data33);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É½¾£×Ó");
        map.put("img", R.drawable.data34);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É½èİ");
        map.put("img", R.drawable.data35);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É½Ñî");
        map.put("img", R.drawable.data36);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É½é«");
        map.put("img", R.drawable.data37);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "É½ÜïİÇ");
        map.put("img", R.drawable.data38);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ê÷ÌÆé¦");
        map.put("img", R.drawable.data39);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ë¨Æ¤éÊ");
        map.put("img", R.drawable.data40);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÎŞ»¨¹û");
        map.put("img", R.drawable.data41);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ĞÇ»¨Ä¾À¼");
        map.put("img", R.drawable.data42);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ĞüÁåÄ¾");
        map.put("img", R.drawable.data43);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ò°ÜÔÀò");
        map.put("img", R.drawable.data44);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ò°Ïãº£ÌÄ");
        map.put("img", R.drawable.data45);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÒøÃ«é²");
        map.put("img", R.drawable.data46);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÒøĞÓ");
        map.put("img", R.drawable.data47);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÓÜéÙ");
        map.put("img", R.drawable.data48);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÓñÀ¼");
        map.put("img", R.drawable.data49);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ÓñÁå»¨");
        map.put("img", R.drawable.data50);
        list.add(map);
        return list;
    }

}
