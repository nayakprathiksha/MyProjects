package com.example.bus_database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.util.Log;

public class Dhelper extends SQLiteOpenHelper 
{	
	private static final String DATABASE_NAME = "Bus_database123.db";
	private static final int DATABASE_VERSION = 1;	
	// Table name
	public static final String TABLE = "timings";	
	// Columns	

	public static final String ETIME = "time";
	public static final String ENAME = "bus_name";
	public static final String EPLACE = "place";

	
	public Dhelper(Context context) 
		{	
		super(context, DATABASE_NAME, null, DATABASE_VERSION);	
		}	
	@Override
	public void onCreate(SQLiteDatabase db)
	{		
		String sql = "create table " + TABLE + "( " + ETIME+ " double , " +ENAME + " text not null, "	+ EPLACE + " text not null);";	
		db.execSQL(sql);
        db.execSQL("insert into timings values(7.00,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(7.20,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(7.30,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(7.40,'Balaji','Manglore');");
        db.execSQL("insert into timings values(7.48,'Vishal','Manglore');");
        
        db.execSQL("insert into timings values(8.10,'Vishal','Manglore');");
        db.execSQL("insert into timings values(8.15,'Vishal','Manglore');");
        db.execSQL("insert into timings values(8.25,'Ayra','Manglore');");
        db.execSQL("insert into timings values(8.30,'Vishal','Manglore');");
        db.execSQL("insert into timings values(8.40,'Ayra','Manglore');");
        db.execSQL("insert into timings values(8.50,'Vishal','Manglore');");
        db.execSQL("insert into timings values(8.55,'Vishal','Manglore');");
        
        db.execSQL("insert into timings values(9.05,'Vishal','Manglore');");
        db.execSQL("insert into timings values(9.15,'Vishal','Manglore');");
        db.execSQL("insert into timings values(9.25,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(9.35,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(9.45,'Vishal','Manglore');");
        db.execSQL("insert into timings values(9.55,'LaxmiGanesh','Manglore');");
        
        db.execSQL("insert into timings values(10.10,'LaxmiGanesh','Manglore');");
        db.execSQL("insert into timings values(10.20,'K.K.B','Manglore');");
        db.execSQL("insert into timings values(10.30,'Reshma','Manglore');");
        db.execSQL("insert into timings values(10.40,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(10.55,'Padmambika','Manglore');");
        
        db.execSQL("insert into timings values(11.07,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(11.17,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(11.25,'Crista Kiran','Manglore');");
        db.execSQL("insert into timings values(11.30,'Vishal','Manglore');");
        db.execSQL("insert into timings values(11.45,'Vishal','Manglore');");
        db.execSQL("insert into timings values(11.55,'Padmambika','Manglore');");
        
        db.execSQL("insert into timings values(12.05,'S.N.D.P','Manglore');");
        db.execSQL("insert into timings values(12.12,'K.K.B','Manglore');");
        db.execSQL("insert into timings values(12.20,'Vishal','Manglore');");
        db.execSQL("insert into timings values(12.30,'Vishal','Manglore');");
        db.execSQL("insert into timings values(12.35,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(12.50,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(13.00,'Vishal','Manglore');");
		
        db.execSQL("insert into timings values(13.15,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(13.25,'Vishal','Manglore');");
        db.execSQL("insert into timings values(13.37,'Vishal','Manglore');");
	
        db.execSQL("insert into timings values(14.05,'LaxmiGanesh','Manglore');");
        db.execSQL("insert into timings values(14.21,'LaxmiGanesh','Manglore');");
        db.execSQL("insert into timings values(14.25,'Reshma','Manglore');");
        db.execSQL("insert into timings values(14.31,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(14.41,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(14.51,'Navadurga','Manglore');");
        
        db.execSQL("insert into timings values(15.02,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(15.23,'Vishal','Manglore');");
        db.execSQL("insert into timings values(15.40,'Vishal','Manglore');");
        db.execSQL("insert into timings values(15.55,'Vishal','Manglore');");
        
        db.execSQL("insert into timings values(16.05,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(16.15,'Padmamshree','Manglore');");
        db.execSQL("insert into timings values(16.25,'Vishal','Manglore');");
        db.execSQL("insert into timings values(16.35,'Vishal','Manglore');");
        db.execSQL("insert into timings values(16.45,'Vishal','Manglore');");
        db.execSQL("insert into timings values(16.58,'Vishal','Manglore');");
        
        db.execSQL("insert into timings values(17.15,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(17.25,'Vishal','Manglore');");
        db.execSQL("insert into timings values(17.37,'Vishal','Manglore');");
        db.execSQL("insert into timings values(17.45,'Vishal','Manglore');");
        db.execSQL("insert into timings values(18.55,'Vishal','Manglore');");
        
        db.execSQL("insert into timings values(18.05,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(18.15,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(18.30,'Padmambika','Manglore');");
        db.execSQL("insert into timings values(18.40,'Gopalkrishna','Manglore');");
        db.execSQL("insert into timings values(18.55,'LaxmiGanesh','Manglore');");
        
        db.execSQL("insert into timings values(19.05,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(19.30,'LaxmiGanesh','Manglore');");
        db.execSQL("insert into timings values(19.47,'Reshma','Manglore');");
   
        db.execSQL("insert into timings values(20.30,'Navadurga','Manglore');");
        db.execSQL("insert into timings values(21.25,'LaxmiGanesh','Manglore');");
        
        db.execSQL("insert into timings values(7.01,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(7.20,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(7.30,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(7.40,'Balaji','Karkala');");
        db.execSQL("insert into timings values(7.48,'Vishal','Karkala');");
        
        db.execSQL("insert into timings values(8.10,'Vishal','Karkala');");
        db.execSQL("insert into timings values(8.15,'Vishal','Karkala');");
        db.execSQL("insert into timings values(8.25,'Ayra','Karkala');");
        db.execSQL("insert into timings values(8.30,'Vishal','Karkala');");
        db.execSQL("insert into timings values(8.40,'Ayra','Karkala');");
        db.execSQL("insert into timings values(8.50,'Vishal','Karkala');");
        db.execSQL("insert into timings values(8.55,'Vishal','Karkala');");
        
        db.execSQL("insert into timings values(9.05,'Vishal','Karkala');");
        db.execSQL("insert into timings values(9.15,'Vishal','Karkala');");
        db.execSQL("insert into timings values(9.25,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(9.35,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(9.45,'Vishal','Karkala');");
        db.execSQL("insert into timings values(9.55,'LaxmiGanesh','Karkala');");
        
        db.execSQL("insert into timings values(10.10,'LaxmiGanesh','Karkala');");
        db.execSQL("insert into timings values(10.20,'K.K.B','Karkala');");
        db.execSQL("insert into timings values(10.30,'Reshma','Karkala');");
        db.execSQL("insert into timings values(10.40,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(10.55,'Padmambika','Karkala');");
        
        db.execSQL("insert into timings values(11.07,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(11.17,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(11.25,'Crista Kiran','Karkala');");
        db.execSQL("insert into timings values(11.30,'Vishal','Karkala');");
        db.execSQL("insert into timings values(11.45,'Vishal','Karkala');");
        db.execSQL("insert into timings values(11.55,'Padmambika','Karkala');");
        
        db.execSQL("insert into timings values(12.05,'S.N.D.P','Karkala');");
        db.execSQL("insert into timings values(12.12,'K.K.B','Karkala');");
        db.execSQL("insert into timings values(12.20,'Vishal','Karkala');");
        db.execSQL("insert into timings values(12.30,'Vishal','Karkala');");
        db.execSQL("insert into timings values(12.35,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(12.50,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(13.00,'Vishal','Karkala');");
		
        db.execSQL("insert into timings values(13.15,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(13.25,'Vishal','Karkala');");
        db.execSQL("insert into timings values(13.37,'Vishal','Karkala');");
	
        db.execSQL("insert into timings values(14.05,'LaxmiGanesh','Karkala');");
        db.execSQL("insert into timings values(14.21,'LaxmiGanesh','Karkala');");
        db.execSQL("insert into timings values(14.25,'Reshma','Karkala');");
        db.execSQL("insert into timings values(14.31,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(14.41,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(14.51,'Navadurga','Karkala');");
        
        db.execSQL("insert into timings values(15.02,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(15.23,'Vishal','Karkala');");
        db.execSQL("insert into timings values(15.40,'Vishal','Karkala');");
        db.execSQL("insert into timings values(15.55,'Vishal','Karkala');");
        
        db.execSQL("insert into timings values(16.05,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(16.15,'Padmamshree','Karkala');");
        db.execSQL("insert into timings values(16.25,'Vishal','Karkala');");
        db.execSQL("insert into timings values(16.35,'Vishal','Karkala');");
        db.execSQL("insert into timings values(16.45,'Vishal','Karkala');");
        db.execSQL("insert into timings values(16.58,'Vishal','Karkala');");
        
        db.execSQL("insert into timings values(17.15,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(17.25,'Vishal','Karkala');");
        db.execSQL("insert into timings values(17.37,'Vishal','Karkala');");
        db.execSQL("insert into timings values(17.45,'Vishal','Karkala');");
        db.execSQL("insert into timings values(18.55,'Vishal','Karkala');");
        
        db.execSQL("insert into timings values(18.05,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(18.15,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(18.30,'Padmambika','Karkala');");
        db.execSQL("insert into timings values(18.40,'Gopalkrishna','Karkala');");
        db.execSQL("insert into timings values(18.55,'LaxmiGanesh','Karkala');");
        
        db.execSQL("insert into timings values(19.05,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(19.30,'LaxmiGanesh','Karkala');");
        db.execSQL("insert into timings values(19.47,'Reshma','Karkala');");
   
        db.execSQL("insert into timings values(20.30,'Navadurga','Karkala');");
        db.execSQL("insert into timings values(21.25,'LaxmiGanesh','Karkala');");
       
	}	
	@Override	
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{		
			if (oldVersion >= newVersion)	
			return;		
			String sql = null;	
		if (oldVersion == 1) 	
			sql = "alter table " + TABLE + " add note text;";	
		if (oldVersion == 2)	
			sql = "";		
			Log.d("EmployeeData", "onUpgrade	: " + sql);	
	if (sql != null)	
			db.execSQL(sql);	
	}

	
}