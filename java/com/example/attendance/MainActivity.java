package com.example.attendance;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    dataBaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new dataBaseHelper(this);
    }
    void cse1Year(View view)
    {
        Intent intent=new Intent(this,cseFirstYearBtw.class);
        startActivity(intent);
    }
    void cse2Year(View view)
    {
        Intent intent=new Intent(this,cseSecondYearBtw.class);
        startActivity(intent);
    }
    void cse3Year(View view)
    {
        Intent intent=new Intent(this,cseThirdYearBtw.class);
        startActivity(intent);
    }
    void cse4Year(View view)
    {
        Intent intent=new Intent(this,cseFourthYearBtw.class);
        startActivity(intent);
    }
}
