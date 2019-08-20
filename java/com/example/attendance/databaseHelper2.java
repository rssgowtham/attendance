package com.example.attendance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper2 extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "student2.db";

    public databaseHelper2(Context context) {
        super(context, "student2.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table csesecondyear(date TEXT PRIMARY KEY,one TEXT,two TEXT,three TEXT,four TEXT,five TEXT,six TEXT,seven TEXT,eight TEXT,nine TEXT,ten TEXT," +
                "eleven TEXT,twelve TEXT,thirteen TEXT,fourteen TEXT,fifteen TEXT,sixteen TEXT,seventeen TEXT,eighteen TEXT,nineteen TEXT,twenty TEXT," +
                "twentyone TEXT,twentytwo TEXT,twentythree TEXT,twentyfour TEXT,twentyfive TEXT,twentysix TEXT,twentyseven TEXT,twentyeight TEXT,twentynine TEXT,thirty Text," +
                "thirtyone TEXT,thirtytwo TEXT,thirtythree TEXT,thirtyfour TEXT,thirtyfive TEXT,thirtysix TEXT,thirtyseven TEXT,thirtyeight TEXT,thirtynine TEXT,fourty TEXT," +
                "fourtyone TEXT,fourtytwo TEXT,fourtythree TEXT,fourtyfour TEXT,fourtyfive TEXT,fourtysix TEXT,fourtyseven TEXT,fourtyeight TEXT,fourtynine TEXT,fifty TEXT," +
                "fiftyone TEXT,fiftytwo TEXT,fiftythree TEXT,fiftyfour TEXT,fiftyfive TEXT,fiftysix TEXT,fiftyseven TEXT,fiftyeight TEXT,fiftynine TEXT,sixty TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS csefirstyear");
        db.execSQL("DROP TABLE IF EXISTS csesecondyear");
        db.execSQL("DROP TABLE IF EXISTS csethirdyear");
        db.execSQL("DROP TABLE IF EXISTS csefourthyear");
        onCreate(db);
    }
    public int clearData2()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete("csesecondyear",null,null);
    }
    public boolean insertData2(String date,String one,String two,String three,String four,String five,String six,String seven,String eight,String nine,String ten,
                               String eleven,String twelve,String thirteen,String fourteen,String fifteen,String sixteen,String seventeen,String eighteen,String nineteen,String twenty,
                               String twentyone,String twentytwo,String twentythree,String twentyfour,String twentyfive,String twentysix,String twentyseven,String twentyeight,String twentynine,String thirty,
                               String thirtyone,String thirtytwo,String thirtythree,String thirtyfour,String thirtyfive,String thirtysix,String thirtyseven,String thirtyeight,String thirtynine,String fourty,
                               String fourtyone,String fourtytwo,String fourtythree,String fourtyfour,String fourtyfive,String fourtysix,String fourtyseven,String fourtyeight,String fourtynine,String fifty,
                               String fiftyone,String fiftytwo,String fiftythree,String fiftyfour,String fiftyfive,String fiftysix,String fiftyseven,String fiftyeight,String fiftynine,String sixty)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("date",date);
        contentValues.put("one",one);
        contentValues.put("two",two);
        contentValues.put("three",three);
        contentValues.put("four",four);
        contentValues.put("five",five);
        contentValues.put("six",six);
        contentValues.put("seven",seven);
        contentValues.put("eight",eight);
        contentValues.put("nine",nine);
        contentValues.put("ten",ten);
        contentValues.put("eleven",eleven);
        contentValues.put("twelve",twelve);
        contentValues.put("thirteen",thirteen);
        contentValues.put("fourteen",fourteen);
        contentValues.put("fifteen",fifteen);
        contentValues.put("sixteen",sixteen);
        contentValues.put("seventeen",seventeen);
        contentValues.put("eighteen",eighteen);
        contentValues.put("nineteen",nineteen);
        contentValues.put("twenty",twenty);
        contentValues.put("twentyone",twentyone);
        contentValues.put("twentytwo",twentytwo);
        contentValues.put("twentythree",twentythree);
        contentValues.put("twentyfour",twentyfour);
        contentValues.put("twentyfive",twentyfive);
        contentValues.put("twentysix",twentysix);
        contentValues.put("twentyseven",twentyseven);
        contentValues.put("twentyeight",twentyeight);
        contentValues.put("twentynine",twentynine);
        contentValues.put("thirty",thirty);
        contentValues.put("thirtyone",thirtyone);
        contentValues.put("thirtytwo",thirtytwo);
        contentValues.put("thirtythree",thirtythree);
        contentValues.put("thirtyfour",thirtyfour);
        contentValues.put("thirtyfive",thirtyfive);
        contentValues.put("thirtysix",thirtysix);
        contentValues.put("thirtyseven",thirtyseven);
        contentValues.put("thirtyeight",thirtyeight);
        contentValues.put("thirtynine",thirtynine);
        contentValues.put("fourty",fourty);
        contentValues.put("fourtyone",fourtyone);
        contentValues.put("fourtytwo",fourtytwo);
        contentValues.put("fourtythree",fourtythree);
        contentValues.put("fourtyfour",fourtyfour);
        contentValues.put("fourtyfive",fourtyfive);
        contentValues.put("fourtysix",fourtysix);
        contentValues.put("fourtyseven",fourtyseven);
        contentValues.put("fourtyeight",fourtyeight);
        contentValues.put("fourtynine",fourtynine);
        contentValues.put("fifty",fifty);
        contentValues.put("fiftyone",fiftyone);
        contentValues.put("fiftytwo",fiftytwo);
        contentValues.put("fiftythree",fiftythree);
        contentValues.put("fiftyfour",fiftyfour);
        contentValues.put("fiftyfive",fiftyfive);
        contentValues.put("fiftysix",fiftysix);
        contentValues.put("fiftyseven",fiftyseven);
        contentValues.put("fiftyeight",fiftyeight);
        contentValues.put("fiftynine",fiftynine);
        contentValues.put("sixty",sixty);
        long check = db.insert("csesecondyear",null,contentValues);
        if(check!=-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Cursor getAll2()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from csesecondyear",null);
        return res;
    }
}
