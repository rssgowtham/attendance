package com.example.attendance;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student3 extends AppCompatActivity {
    databaseHelper3 db;
    Button roll1Obj;
    Button roll2Obj;
    Button roll3Obj;
    Button roll4Obj;
    Button roll5Obj;
    Button roll6Obj;
    Button roll7Obj;
    Button roll8Obj;
    Button roll9Obj;
    Button roll10Obj;
    Button roll11Obj;
    Button roll12Obj;
    Button roll13Obj;
    Button roll14Obj;
    Button roll15Obj;
    Button roll16Obj;
    Button roll17Obj;
    Button roll18Obj;
    Button roll19Obj;
    Button roll20Obj;
    Button roll21Obj;
    Button roll22Obj;
    Button roll23Obj;
    Button roll24Obj;
    Button roll25Obj;
    Button roll26Obj;
    Button roll27Obj;
    Button roll28Obj;
    Button roll29Obj;
    Button roll30Obj;
    Button roll31Obj;
    Button roll32Obj;
    Button roll33Obj;
    Button roll34Obj;
    Button roll35Obj;
    Button roll36Obj;
    Button roll37Obj;
    Button roll38Obj;
    Button roll39Obj;
    Button roll40Obj;
    Button roll41Obj;
    Button roll42Obj;
    Button roll43Obj;
    Button roll44Obj;
    Button roll45Obj;
    Button roll46Obj;
    Button roll47Obj;
    Button roll48Obj;
    Button roll49Obj;
    Button roll50Obj;
    Button roll51Obj;
    Button roll52Obj;
    Button roll53Obj;
    Button roll54Obj;
    Button roll55Obj;
    Button roll56Obj;
    Button roll57Obj;
    Button roll58Obj;
    Button roll59Obj;
    Button roll60Obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student3);

        db=new databaseHelper3(this);
    }

    void roll1(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(1));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(1)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll2(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(2));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(2)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll3(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(3));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(3)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll4(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(4));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(4)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll5(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(5));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(5)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll6(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(6));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(6)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll7(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(7));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(7)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll8(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(8));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(8)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll9(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(9));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(9)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll10(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(10));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(10)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll11(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(11));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(11)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll12(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(12));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(12)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll13(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(13));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(13)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll14(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(14));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(14)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll15(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(15));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(15)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll16(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(16));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(16)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll17(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(17));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(17)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll18(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(18));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(18)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll19(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(19));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(19)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll20(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(20));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(20)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll21(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(21));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(21)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll22(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(22));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(22)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll23(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(23));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(23)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll24(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(24));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(24)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll25(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(25));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(25)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll26(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(26));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(26)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll27(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(27));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(27)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll28(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(28));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(28)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll29(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(29));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(29)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll30(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(30));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(30)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll31(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(31));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(31)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll32(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(32));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(32)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll33(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(33));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(33)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll34(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(34));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(34)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll35(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(35));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(35)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll36(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(36));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(36)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll37(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(37));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(37)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll38(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(38));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(38)+"\n\n");
            showMessage("data",buffer.toString());
        }
        buffer.append("total : "+total);
    }
    void roll39(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(39));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(39)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll40(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(40));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(40)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll41(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(41));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(41)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll42(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(42));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(42)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll43(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(43));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(43)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll44(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(44));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(44)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll45(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(45));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(45)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll46(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(46));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(46)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll47(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(47));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(47)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll48(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(48));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(48)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll49(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(49));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(49)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll50(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(50));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(50)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll51(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(51));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(51)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll52(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(52));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(52)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll53(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(53));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(53)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll54(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(54));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(54)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll55(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(55));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(55)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll56(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(56));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(56)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll57(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(57));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(57)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll58(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(58));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(58)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll59(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(59));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(59)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
    }
    void roll60(View view)
    {
        Cursor res=db.getAll2();
        if(res.getCount()==0)
        {
            //show message
            showMessage("Error","No data found");
            return;
        }
        int total=0;
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext())
        {
            total=total+Integer.parseInt(res.getString(60));
            buffer.append(res.getString(0)+"\t\t\t");
            buffer.append(res.getString(60)+"\n\n");
        }
        buffer.append("total : "+total);
        showMessage("data",buffer.toString());
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
