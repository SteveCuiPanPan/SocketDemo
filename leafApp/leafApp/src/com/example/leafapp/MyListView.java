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
        map.put("title", "����ľ");
        map.put("img", R.drawable.data0);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data1);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "��������");
        map.put("img", R.drawable.data2);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����Ҷ");
        map.put("img", R.drawable.data3);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�����");
        map.put("img", R.drawable.data4);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "��ɽӣ");
        map.put("img", R.drawable.data5);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data6);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�໨����");
        map.put("img", R.drawable.data7);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "��Ҷ");
        map.put("img", R.drawable.data8);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "������");
        map.put("img", R.drawable.data9);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�ϻ�");
        map.put("img", R.drawable.data10);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�ں���");
        map.put("img", R.drawable.data11);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data12);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "������");
        map.put("img", R.drawable.data13);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "��Ұӣ");
        map.put("img", R.drawable.data14);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "��ɣ");
        map.put("img", R.drawable.data15);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "��������");
        map.put("img", R.drawable.data16);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�ư�");
        map.put("img", R.drawable.data17);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "�ƽ���");
        map.put("img", R.drawable.data18);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "�Һ���");
        map.put("img", R.drawable.data19);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "��צ��");
        map.put("img", R.drawable.data20);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "��ͷľ��");
        map.put("img", R.drawable.data21);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "���");
        map.put("img", R.drawable.data22);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data23);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "������");
        map.put("img", R.drawable.data24);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data25);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����ɼ");
        map.put("img", R.drawable.data26);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ƥɽ����");
        map.put("img", R.drawable.data27);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ƻ��");
        map.put("img", R.drawable.data28);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����Ҷ");
        map.put("img", R.drawable.data29);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "�ձ���ӣ");
        map.put("img", R.drawable.data30);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "��ëɽ����");
        map.put("img", R.drawable.data31);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "������");
        map.put("img", R.drawable.data32);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɣ��");
        map.put("img", R.drawable.data33);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɽ����");
        map.put("img", R.drawable.data34);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɽ��");
        map.put("img", R.drawable.data35);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɽ��");
        map.put("img", R.drawable.data36);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɽ�");
        map.put("img", R.drawable.data37);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "ɽ����");
        map.put("img", R.drawable.data38);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "�����");
        map.put("img", R.drawable.data39);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "˨Ƥ��");
        map.put("img", R.drawable.data40);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "�޻���");
        map.put("img", R.drawable.data41);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "�ǻ�ľ��");
        map.put("img", R.drawable.data42);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����ľ");
        map.put("img", R.drawable.data43);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ұ����");
        map.put("img", R.drawable.data44);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "Ұ�㺣��");
        map.put("img", R.drawable.data45);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "��ë�");
        map.put("img", R.drawable.data46);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data47);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data48);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "����");
        map.put("img", R.drawable.data49);
        list.add(map);
        
        map = new HashMap<String, Object>();
        map.put("title", "���廨");
        map.put("img", R.drawable.data50);
        list.add(map);
        return list;
    }

}
