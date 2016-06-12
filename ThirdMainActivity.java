package com.example.bus_database;

//import com.example.intent.R;

import java.util.ArrayList;

//import com.example.mylistview.MainActivity;
//import com.example.mylistview.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ThirdMainActivity extends Activity implements OnItemClickListener {
//TextView t;
ListView time;
ArrayList<String> time_list;
ListAdapter time_adap;
String time_value,place_value;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third_main);
		//t = (TextView)findViewById(R.id.textView1);
		Intent i = getIntent();
		place_value = i.getStringExtra("place");
		//t.setText(value);
        time = (ListView)findViewById(R.id.listView1);
        
        time_list = new ArrayList<String>();
        time_list.add("7am-8am");
        time_list.add("8am-9am");
        time_list.add("9am-10am");
        time_list.add("10am-11am");
        time_list.add("11am-12pm");
        time_list.add("12pm-1pm");
        time_list.add("1pm-2pm");
        time_list.add("2pm-3pm");
        time_list.add("3pm-4pm");
        time_list.add("4pm-5pm");
        time_list.add("5pm-6pm");
        time_list.add("7pm-8pm");
        time_list.add("8pm-10pm");
        
        time_adap = new ArrayAdapter<String>(ThirdMainActivity.this,android.R.layout.simple_list_item_1,time_list);
        
        time.setAdapter(time_adap);
        time.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third_main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		time_value = time.getItemAtPosition(arg2).toString();
		Intent j = new Intent(ThirdMainActivity.this,ForthMainActivity.class);
		j.putExtra("time_value",time_value);
		j.putExtra("place_value",place_value);
		startActivity(j);
	}

}
