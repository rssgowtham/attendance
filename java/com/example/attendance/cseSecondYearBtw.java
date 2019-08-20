package com.example.attendance;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cseSecondYearBtw extends AppCompatActivity {
    databaseHelper2 db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_second_year_btw);
        db=new databaseHelper2(this);
    }
    void takeAttendance(View view)
    {
        Intent intent=new Intent(this,cseSecondYear.class);
        startActivity(intent);
    }
    void studentData(View view)
    {
        Intent intent=new Intent(this,Student2.class);
        startActivity(intent);
    }
    void dateWiseData(View view)
    {
        Intent intent=new Intent(this,DateWise2.class);
        startActivity(intent);
    }
    double getTotal(int i)
    {
        Cursor res=db.getAll2();
        double total=0;
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(i));
        }
        return total;
    }
    void lessThan75(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        double limit=res.getCount()*0.75;
        int temp=0;
        for(int i=1;i<=60;i++)
        {
            double total=getTotal(i);
            if(total<limit)
            {
                temp=1;
                buffer.append(""+i+"\n");
            }
        }
        if(temp!=0)
        {
            showMessage("data",buffer.toString());
        }
        else
        {
            showMessage("Error","No data found");
        }
    }
    void greaterThan75(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        double limit=res.getCount()*0.75;
        int temp=0;
        for(int i=1;i<=60;i++)
        {
            double total=getTotal(i);
            if(total>=limit)
            {
                temp=1;
                buffer.append(""+i+"\n");
            }
        }
        if(temp!=0)
        {
            showMessage("data",buffer.toString());
        }
        else
        {
            showMessage("Error","No data found");
        }
    }
    void bestAttended(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        int temp=0;
        double preTotal=0;
        for(int i=1;i<=60;i++)
        {
            double total=getTotal(i);
            if(preTotal<total)
            {
                preTotal=total;
            }
        }
        for(int i=1;i<=60;i++)
        {
            if(getTotal(i)==preTotal)
            {
                temp=1;
                buffer.append(""+i+"\n");
            }
        }
        if(temp!=0)
        {
            showMessage("data",buffer.toString());
        }
        else
        {
            showMessage("Error","No data found");
        }
    }
    public void showMessage(String title, String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    void clearData(View view)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Are You Sure");
        builder.setMessage("All the second year data will be deleted");
        DialogInterface.OnClickListener listener=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int deleted=db.clearData2();
                if(deleted>0)
                {
                    Toast.makeText(cseSecondYearBtw.this,"Data deleted",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(cseSecondYearBtw.this,"Data not deleted",Toast.LENGTH_LONG).show();
                }
            }
        };
        builder.setNegativeButton("cancel",null);
        builder.setPositiveButton("OK",listener);
        builder.show();
    }
}
