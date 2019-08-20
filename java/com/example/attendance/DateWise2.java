package com.example.attendance;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class DateWise2 extends AppCompatActivity {
    databaseHelper2 db;
    DatePicker dateObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_wise2);
        db=new databaseHelper2(this);
    }
    void getData(View view)
    {
        dateObj=(DatePicker)findViewById(R.id.date);
        String date;
        int day=dateObj.getDayOfMonth();
        int month=dateObj.getMonth()+1;
        int year=dateObj.getYear();
        date=day+"/"+month+"/"+year;
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            if(date.equals(res.getString(0))) {
                buffer.append("date :" + res.getString(0) + "\n");
                buffer.append("one :" + res.getString(1) + "\n");
                buffer.append("two :" + res.getString(2) + "\n");
                buffer.append("three :" + res.getString(3) + "\n");
                buffer.append("four :" + res.getString(4) + "\n");
                buffer.append("five :" + res.getString(5) + "\n");
                buffer.append("six :" + res.getString(6) + "\n");
                buffer.append("seven :" + res.getString(7) + "\n");
                buffer.append("eight :" + res.getString(8) + "\n");
                buffer.append("nine :" + res.getString(9) + "\n");
                buffer.append("ten :" + res.getString(10) + "\n");
                buffer.append("eleven :" + res.getString(11) + "\n");
                buffer.append("twelve :" + res.getString(12) + "\n");
                buffer.append("thirteen :" + res.getString(13) + "\n");
                buffer.append("fourteen :" + res.getString(14) + "\n");
                buffer.append("fifteen :" + res.getString(15) + "\n");
                buffer.append("sixteen :" + res.getString(16) + "\n");
                buffer.append("seventeen :" + res.getString(17) + "\n");
                buffer.append("eighteen :" + res.getString(18) + "\n");
                buffer.append("nineteen :" + res.getString(19) + "\n");
                buffer.append("twenty :" + res.getString(20) + "\n");
                buffer.append("twentyone :" + res.getString(21) + "\n");
                buffer.append("twentytwo :" + res.getString(22) + "\n");
                buffer.append("twentythree :" + res.getString(23) + "\n");
                buffer.append("twentyfour :" + res.getString(24) + "\n");
                buffer.append("twentyfive :" + res.getString(25) + "\n");
                buffer.append("twentysix :" + res.getString(26) + "\n");
                buffer.append("twentyseven :" + res.getString(27) + "\n");
                buffer.append("twentyeight :" + res.getString(28) + "\n");
                buffer.append("twentynine :" + res.getString(29) + "\n");
                buffer.append("thirty :" + res.getString(30) + "\n");
                buffer.append("thirtyone :" + res.getString(31) + "\n");
                buffer.append("thirtytwo :" + res.getString(32) + "\n");
                buffer.append("thirtythree :" + res.getString(33) + "\n");
                buffer.append("thirtyfour :" + res.getString(34) + "\n");
                buffer.append("thirtyfive :" + res.getString(35) + "\n");
                buffer.append("thirtysix :" + res.getString(36) + "\n");
                buffer.append("thirtyseven :" + res.getString(37) + "\n");
                buffer.append("thirtyeight :" + res.getString(38) + "\n");
                buffer.append("thirtynine :" + res.getString(39) + "\n");
                buffer.append("fourty :" + res.getString(40) + "\n");
                buffer.append("fourtyone :" + res.getString(41) + "\n");
                buffer.append("fourtytwo :" + res.getString(42) + "\n");
                buffer.append("fourtythree :" + res.getString(43) + "\n");
                buffer.append("fourtyfour :" + res.getString(44) + "\n");
                buffer.append("fourtyfive :" + res.getString(45) + "\n");
                buffer.append("fourtysix :" + res.getString(46) + "\n");
                buffer.append("fourtyseven :" + res.getString(47) + "\n");
                buffer.append("fourtyeight :" + res.getString(48) + "\n");
                buffer.append("fourtynine :" + res.getString(49) + "\n");
                buffer.append("fifty :" + res.getString(50) + "\n");
                buffer.append("fiftyone :" + res.getString(51) + "\n");
                buffer.append("fiftytwo :" + res.getString(52) + "\n");
                buffer.append("fiftythree :" + res.getString(53) + "\n");
                buffer.append("fiftyfour :" + res.getString(54) + "\n");
                buffer.append("fiftyfive :" + res.getString(55) + "\n");
                buffer.append("fiftysix :" + res.getString(56) + "\n");
                buffer.append("fiftyseven :" + res.getString(57) + "\n");
                buffer.append("fiftyeight :" + res.getString(58) + "\n");
                buffer.append("fiftynine :" + res.getString(59) + "\n");
                buffer.append("sixty :" + res.getString(60) + "\n\n");
                showMessage("data", buffer.toString());
                return;
            }
        }
        showMessage("Error","No data found");
    }
    public void showMessage(String title, String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
