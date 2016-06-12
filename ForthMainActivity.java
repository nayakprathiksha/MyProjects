package com.example.bus_database;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import android.widget.Toast;

public class ForthMainActivity extends Activity {
String place_name;
String time_value;
TextView info;
Dhelper helper;
SQLiteDatabase db2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forth_main);
		helper=new Dhelper(this);
		db2 = helper.getWritableDatabase();
		info=(TextView)findViewById(R.id.textView1);
		info.setText("");
		Intent k = getIntent();
		time_value = k.getStringExtra("time_value");
		place_name = k.getStringExtra("place_value");
		Toast.makeText(getApplicationContext(),time_value+":"+place_name,Toast.LENGTH_SHORT).show();
		if(time_value.equalsIgnoreCase("7am-8am"))
	        {
	        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
				//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
				Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=7 and time<=8;", null);
				if (allrows.moveToFirst()) {
	                do
	                {
	                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
	                } while (allrows.moveToNext());
	            }
	            allrows.close();
	            db2.close();
	          
	        }
		if(time_value.equalsIgnoreCase("8am-9am"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=8 and time<=9;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }
		if(time_value.equalsIgnoreCase("9am-10am"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=9 and time<=10;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }
		if(time_value.equalsIgnoreCase("10am-11am"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=10 and time<=11;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }
		if(time_value.equalsIgnoreCase("11am-12pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=11 and time<=12;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }
		if(time_value.equalsIgnoreCase("12pm-1pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=12 and time<=13;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("1pm-2pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=13 and time<=14;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("2pm-3pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=14 and time<=15;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("3pm-4pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=15 and time<=16;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("4pm-5pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=16 and time<=17;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("5pm-6pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=17 and time<=18;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("6pm-7pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=18 and time<=19;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();
          
        }if(time_value.equalsIgnoreCase("7pm-8pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=19 and time<=20;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();     
        }
        if(time_value.equalsIgnoreCase("8pm-10pm"))
        {
        	Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
			//Cursor allrows = db2.rawQuery("SELECT * FROM timings where time between 8 and 9;", null);
			Cursor allrows = db2.rawQuery("select * from timings where place='"+place_name+"'and time>=20 and time<=22;", null);
			if (allrows.moveToFirst()) {
                do
                {
                   info.append(allrows.getDouble(0)+" "+allrows.getString(1)+" "+allrows.getString(2)+"\n");
                } while (allrows.moveToNext());
            }
            allrows.close();
            db2.close();     
        }
	}
}