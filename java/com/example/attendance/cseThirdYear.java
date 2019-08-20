package com.example.attendance;

import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class cseThirdYear extends AppCompatActivity {
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
    DatePicker dateObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_third_year);
        db=new databaseHelper3(this);
    }
    void viewAll(View view)
    {
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
            buffer.append("date :"+res.getString(0)+"\n");
            buffer.append("one :"+res.getString(1)+"\n");
            buffer.append("two :"+res.getString(2)+"\n");
            buffer.append("three :"+res.getString(3)+"\n");
            buffer.append("four :"+res.getString(4)+"\n");
            buffer.append("five :"+res.getString(5)+"\n");
            buffer.append("six :"+res.getString(6)+"\n");
            buffer.append("seven :"+res.getString(7)+"\n");
            buffer.append("eight :"+res.getString(8)+"\n");
            buffer.append("nine :"+res.getString(9)+"\n");
            buffer.append("ten :"+res.getString(10)+"\n");
            buffer.append("eleven :"+res.getString(11)+"\n");
            buffer.append("twelve :"+res.getString(12)+"\n");
            buffer.append("thirteen :"+res.getString(13)+"\n");
            buffer.append("fourteen :"+res.getString(14)+"\n");
            buffer.append("fifteen :"+res.getString(15)+"\n");
            buffer.append("sixteen :"+res.getString(16)+"\n");
            buffer.append("seventeen :"+res.getString(17)+"\n");
            buffer.append("eighteen :"+res.getString(18)+"\n");
            buffer.append("nineteen :"+res.getString(19)+"\n");
            buffer.append("twenty :"+res.getString(20)+"\n");
            buffer.append("twentyone :"+res.getString(21)+"\n");
            buffer.append("twentytwo :"+res.getString(22)+"\n");
            buffer.append("twentythree :"+res.getString(23)+"\n");
            buffer.append("twentyfour :"+res.getString(24)+"\n");
            buffer.append("twentyfive :"+res.getString(25)+"\n");
            buffer.append("twentysix :"+res.getString(26)+"\n");
            buffer.append("twentyseven :"+res.getString(27)+"\n");
            buffer.append("twentyeight :"+res.getString(28)+"\n");
            buffer.append("twentynine :"+res.getString(29)+"\n");
            buffer.append("thirty :"+res.getString(30)+"\n");
            buffer.append("thirtyone :"+res.getString(31)+"\n");
            buffer.append("thirtytwo :"+res.getString(32)+"\n");
            buffer.append("thirtythree :"+res.getString(33)+"\n");
            buffer.append("thirtyfour :"+res.getString(34)+"\n");
            buffer.append("thirtyfive :"+res.getString(35)+"\n");
            buffer.append("thirtysix :"+res.getString(36)+"\n");
            buffer.append("thirtyseven :"+res.getString(37)+"\n");
            buffer.append("thirtyeight :"+res.getString(38)+"\n");
            buffer.append("thirtynine :"+res.getString(39)+"\n");
            buffer.append("fourty :"+res.getString(40)+"\n");
            buffer.append("fourtyone :"+res.getString(41)+"\n");
            buffer.append("fourtytwo :"+res.getString(42)+"\n");
            buffer.append("fourtythree :"+res.getString(43)+"\n");
            buffer.append("fourtyfour :"+res.getString(44)+"\n");
            buffer.append("fourtyfive :"+res.getString(45)+"\n");
            buffer.append("fourtysix :"+res.getString(46)+"\n");
            buffer.append("fourtyseven :"+res.getString(47)+"\n");
            buffer.append("fourtyeight :"+res.getString(48)+"\n");
            buffer.append("fourtynine :"+res.getString(49)+"\n");
            buffer.append("fifty :"+res.getString(50)+"\n");
            buffer.append("fiftyone :"+res.getString(51)+"\n");
            buffer.append("fiftytwo :"+res.getString(52)+"\n");
            buffer.append("fiftythree :"+res.getString(53)+"\n");
            buffer.append("fiftyfour :"+res.getString(54)+"\n");
            buffer.append("fiftyfive :"+res.getString(55)+"\n");
            buffer.append("fiftysix :"+res.getString(56)+"\n");
            buffer.append("fiftyseven :"+res.getString(57)+"\n");
            buffer.append("fiftyeight :"+res.getString(58)+"\n");
            buffer.append("fiftynine :"+res.getString(59)+"\n");
            buffer.append("sixty :"+res.getString(60)+"\n\n");
        }
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
    void insert(View view)
    {
        roll1Obj=(Button)findViewById(R.id.roll1);
        roll2Obj=(Button)findViewById(R.id.roll2);
        roll3Obj=(Button)findViewById(R.id.roll3);
        roll4Obj=(Button)findViewById(R.id.roll4);
        roll5Obj=(Button)findViewById(R.id.roll5);
        roll6Obj=(Button)findViewById(R.id.roll6);
        roll7Obj=(Button)findViewById(R.id.roll7);
        roll8Obj=(Button)findViewById(R.id.roll8);
        roll9Obj=(Button)findViewById(R.id.roll9);
        roll10Obj=(Button)findViewById(R.id.roll10);
        roll11Obj=(Button)findViewById(R.id.roll11);
        roll12Obj=(Button)findViewById(R.id.roll12);
        roll13Obj=(Button)findViewById(R.id.roll13);
        roll14Obj=(Button)findViewById(R.id.roll14);
        roll15Obj=(Button)findViewById(R.id.roll15);
        roll16Obj=(Button)findViewById(R.id.roll16);
        roll17Obj=(Button)findViewById(R.id.roll17);
        roll18Obj=(Button)findViewById(R.id.roll18);
        roll19Obj=(Button)findViewById(R.id.roll19);
        roll20Obj=(Button)findViewById(R.id.roll20);
        roll21Obj=(Button)findViewById(R.id.roll21);
        roll22Obj=(Button)findViewById(R.id.roll22);
        roll23Obj=(Button)findViewById(R.id.roll23);
        roll24Obj=(Button)findViewById(R.id.roll24);
        roll25Obj=(Button)findViewById(R.id.roll25);
        roll26Obj=(Button)findViewById(R.id.roll26);
        roll27Obj=(Button)findViewById(R.id.roll27);
        roll28Obj=(Button)findViewById(R.id.roll28);
        roll29Obj=(Button)findViewById(R.id.roll29);
        roll30Obj=(Button)findViewById(R.id.roll30);
        roll31Obj=(Button)findViewById(R.id.roll31);
        roll32Obj=(Button)findViewById(R.id.roll32);
        roll33Obj=(Button)findViewById(R.id.roll33);
        roll34Obj=(Button)findViewById(R.id.roll34);
        roll35Obj=(Button)findViewById(R.id.roll35);
        roll36Obj=(Button)findViewById(R.id.roll36);
        roll37Obj=(Button)findViewById(R.id.roll37);
        roll38Obj=(Button)findViewById(R.id.roll38);
        roll39Obj=(Button)findViewById(R.id.roll39);
        roll40Obj=(Button)findViewById(R.id.roll40);
        roll41Obj=(Button)findViewById(R.id.roll41);
        roll42Obj=(Button)findViewById(R.id.roll42);
        roll43Obj=(Button)findViewById(R.id.roll43);
        roll44Obj=(Button)findViewById(R.id.roll44);
        roll45Obj=(Button)findViewById(R.id.roll45);
        roll46Obj=(Button)findViewById(R.id.roll46);
        roll47Obj=(Button)findViewById(R.id.roll47);
        roll48Obj=(Button)findViewById(R.id.roll48);
        roll49Obj=(Button)findViewById(R.id.roll49);
        roll50Obj=(Button)findViewById(R.id.roll50);
        roll51Obj=(Button)findViewById(R.id.roll51);
        roll52Obj=(Button)findViewById(R.id.roll52);
        roll53Obj=(Button)findViewById(R.id.roll53);
        roll54Obj=(Button)findViewById(R.id.roll54);
        roll55Obj=(Button)findViewById(R.id.roll55);
        roll56Obj=(Button)findViewById(R.id.roll56);
        roll57Obj=(Button)findViewById(R.id.roll57);
        roll58Obj=(Button)findViewById(R.id.roll58);
        roll59Obj=(Button)findViewById(R.id.roll59);
        roll60Obj=(Button)findViewById(R.id.roll60);
        dateObj=(DatePicker)findViewById(R.id.date);
        String date, one, two, three, four, five, six, seven, eight, nine, ten;
        String eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty;
        String twentyone, twentytwo, twentythree, twentyfour, twentyfive, twentysix, twentyseven, twentyeight, twentynine, thirty;
        String thirtyone, thirtytwo, thirtythree, thirtyfour, thirtyfive, thirtysix, thirtyseven, thirtyeight, thirtynine, fourty;
        String fourtyone,fourtytwo, fourtythree,fourtyfour, fourtyfive, fourtysix, fourtyseven, fourtyeight, fourtynine, fifty;
        String fiftyone, fiftytwo, fiftythree, fiftyfour, fiftyfive, fiftysix, fiftyseven,fiftyeight,fiftynine,sixty;
        //DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        //date=dateFormat.format(dateObj);
        int day=dateObj.getDayOfMonth();
        int month=dateObj.getMonth()+1;
        int year=dateObj.getYear();
        date=day+"/"+month+"/"+year;
        if(roll1Obj.isFocusable())
        {
            one="1";
        }
        else
        {
            one="0";
        }
        if(roll2Obj.isFocusable())
        {
            two="1";
        }
        else
        {
            two="0";
        }
        if(roll3Obj.isFocusable())
        {
            three="1";
        }
        else
        {
            three="0";
        }
        if(roll4Obj.isFocusable())
        {
            four="1";
        }
        else
        {
            four="0";
        }
        if(roll5Obj.isFocusable())
        {
            five="1";
        }
        else
        {
            five="0";
        }
        if(roll6Obj.isFocusable())
        {
            six="1";
        }
        else
        {
            six="0";
        }
        if(roll7Obj.isFocusable())
        {
            seven="1";
        }
        else
        {
            seven="0";
        }
        if(roll8Obj.isFocusable())
        {
            eight="1";
        }
        else
        {
            eight="0";
        }
        if(roll9Obj.isFocusable())
        {
            nine="1";
        }
        else
        {
            nine="0";
        }
        if(roll10Obj.isFocusable())
        {
            ten="1";
        }
        else
        {
            ten="0";
        }
        if(roll11Obj.isFocusable())
        {
            eleven="1";
        }
        else
        {
            eleven="0";
        }
        if(roll12Obj.isFocusable())
        {
            twelve="1";
        }
        else
        {
            twelve="0";
        }
        if(roll13Obj.isFocusable())
        {
            thirteen="1";
        }
        else
        {
            thirteen="0";
        }
        if(roll14Obj.isFocusable())
        {
            fourteen="1";
        }
        else
        {
            fourteen="0";
        }
        if(roll15Obj.isFocusable())
        {
            fifteen="1";
        }
        else
        {
            fifteen="0";
        }
        if(roll16Obj.isFocusable())
        {
            sixteen="1";
        }
        else
        {
            sixteen="0";
        }
        if(roll17Obj.isFocusable())
        {
            seventeen="1";
        }
        else
        {
            seventeen="0";
        }
        if(roll18Obj.isFocusable())
        {
            eighteen="1";
        }
        else
        {
            eighteen="0";
        }
        if(roll19Obj.isFocusable())
        {
            nineteen="1";
        }
        else
        {
            nineteen="0";
        }
        if(roll20Obj.isFocusable())
        {
            twenty="1";
        }
        else
        {
            twenty="0";
        }
        if(roll21Obj.isFocusable())
        {
            twentyone="1";
        }
        else
        {
            twentyone="0";
        }
        if(roll22Obj.isFocusable())
        {
            twentytwo="1";
        }
        else
        {
            twentytwo="0";
        }
        if(roll23Obj.isFocusable())
        {
            twentythree="1";
        }
        else
        {
            twentythree="0";
        }
        if(roll24Obj.isFocusable())
        {
            twentyfour="1";
        }
        else
        {
            twentyfour="0";
        }
        if(roll25Obj.isFocusable())
        {
            twentyfive="1";
        }
        else
        {
            twentyfive="0";
        }
        if(roll26Obj.isFocusable())
        {
            twentysix="1";
        }
        else
        {
            twentysix="0";
        }
        if(roll27Obj.isFocusable())
        {
            twentyseven="1";
        }
        else
        {
            twentyseven="0";
        }
        if(roll28Obj.isFocusable())
        {
            twentyeight="1";
        }
        else
        {
            twentyeight="0";
        }
        if(roll29Obj.isFocusable())
        {
            twentynine="1";
        }
        else
        {
            twentynine="0";
        }
        if(roll30Obj.isFocusable())
        {
            thirty="1";
        }
        else
        {
            thirty="0";
        }
        if(roll31Obj.isFocusable())
        {
            thirtyone="1";
        }
        else
        {
            thirtyone="0";
        }
        if(roll32Obj.isFocusable())
        {
            thirtytwo="1";
        }
        else
        {
            thirtytwo="0";
        }
        if(roll33Obj.isFocusable())
        {
            thirtythree="1";
        }
        else
        {
            thirtythree="0";
        }
        if(roll34Obj.isFocusable())
        {
            thirtyfour="1";
        }
        else
        {
            thirtyfour="0";
        }
        if(roll35Obj.isFocusable())
        {
            thirtyfive="1";
        }
        else
        {
            thirtyfive="0";
        }
        if(roll36Obj.isFocusable())
        {
            thirtysix="1";
        }
        else
        {
            thirtysix="0";
        }
        if(roll37Obj.isFocusable())
        {
            thirtyseven="1";
        }
        else
        {
            thirtyseven="0";
        }
        if(roll38Obj.isFocusable())
        {
            thirtyeight="1";
        }
        else
        {
            thirtyeight="0";
        }
        if(roll39Obj.isFocusable())
        {
            thirtynine="1";
        }
        else
        {
            thirtynine="0";
        }
        if(roll40Obj.isFocusable())
        {
            fourty="1";
        }
        else
        {
            fourty="0";
        }
        if(roll41Obj.isFocusable())
        {
            fourtyone="1";
        }
        else
        {
            fourtyone="0";
        }
        if(roll42Obj.isFocusable())
        {
            fourtytwo="1";
        }
        else
        {
            fourtytwo="0";
        }
        if(roll43Obj.isFocusable())
        {
            fourtythree="1";
        }
        else
        {
            fourtythree="0";
        }
        if(roll44Obj.isFocusable())
        {
            fourtyfour="1";
        }
        else
        {
            fourtyfour="0";
        }
        if(roll45Obj.isFocusable())
        {
            fourtyfive="1";
        }
        else
        {
            fourtyfive="0";
        }
        if(roll46Obj.isFocusable())
        {
            fourtysix="1";
        }
        else
        {
            fourtysix="0";
        }
        if(roll47Obj.isFocusable())
        {
            fourtyseven="1";
        }
        else
        {
            fourtyseven="0";
        }
        if(roll48Obj.isFocusable())
        {
            fourtyeight="1";
        }
        else
        {
            fourtyeight="0";
        }
        if(roll49Obj.isFocusable())
        {
            fourtynine="1";
        }
        else
        {
            fourtynine="0";
        }
        if(roll50Obj.isFocusable())
        {
            fifty="1";
        }
        else
        {
            fifty="0";
        }
        if(roll51Obj.isFocusable())
        {
            fiftyone="1";
        }
        else
        {
            fiftyone="0";
        }
        if(roll52Obj.isFocusable())
        {
            fiftytwo="1";
        }
        else
        {
            fiftytwo="0";
        }
        if(roll53Obj.isFocusable())
        {
            fiftythree="1";
        }
        else
        {
            fiftythree="0";
        }
        if(roll54Obj.isFocusable())
        {
            fiftyfour="1";
        }
        else
        {
            fiftyfour="0";
        }
        if(roll55Obj.isFocusable())
        {
            fiftyfive="1";
        }
        else
        {
            fiftyfive="0";
        }
        if(roll56Obj.isFocusable())
        {
            fiftysix="1";
        }
        else
        {
            fiftysix="0";
        }
        if(roll57Obj.isFocusable())
        {
            fiftyseven="1";
        }
        else
        {
            fiftyseven="0";
        }
        if(roll58Obj.isFocusable())
        {
            fiftyeight="1";
        }
        else
        {
            fiftyeight="0";
        }
        if(roll59Obj.isFocusable())
        {
            fiftynine="1";
        }
        else
        {
            fiftynine="0";
        }
        if(roll60Obj.isFocusable())
        {
            sixty="1";
        }
        else
        {
            sixty="0";
        }
        boolean check = db.insertData2(date,one, two, three, four, five, six, seven, eight, nine, ten,eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty,twentyone, twentytwo, twentythree, twentyfour, twentyfive, twentysix, twentyseven, twentyeight, twentynine, thirty,thirtyone, thirtytwo, thirtythree, thirtyfour, thirtyfive, thirtysix, thirtyseven, thirtyeight, thirtynine, fourty,fourtyone,fourtytwo, fourtythree,fourtyfour, fourtyfive, fourtysix, fourtyseven, fourtyeight, fourtynine, fifty,fiftyone, fiftytwo, fiftythree, fiftyfour, fiftyfive, fiftysix, fiftyseven,fiftyeight,fiftynine,sixty);

        if(check)
        {
            Toast.makeText(cseThirdYear.this,"Data inserted",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(cseThirdYear.this,"Data not inserted",Toast.LENGTH_LONG).show();
        }
    }
    void roll1(View view)
    {
        Button roll1Obj=(Button)findViewById(R.id.roll1);
        if(roll1Obj.isFocusable()) {
            roll1Obj.setBackgroundColor(Color.RED);
            roll1Obj.setFocusable(false);
        }
        else
        {
            roll1Obj.setBackgroundColor(Color.GREEN);
            roll1Obj.setFocusable(true);
        }
    }
    void roll2(View view)
    {
        Button roll2Obj=(Button)findViewById(R.id.roll2);
        if(roll2Obj.isFocusable()) {
            roll2Obj.setBackgroundColor(Color.RED);
            roll2Obj.setFocusable(false);
        }
        else
        {
            roll2Obj.setBackgroundColor(Color.GREEN);
            roll2Obj.setFocusable(true);
        }
    }
    void roll3(View view)
    {
        Button roll3Obj=(Button)findViewById(R.id.roll3);
        if(roll3Obj.isFocusable()) {
            roll3Obj.setBackgroundColor(Color.RED);
            roll3Obj.setFocusable(false);
        }
        else
        {
            roll3Obj.setBackgroundColor(Color.GREEN);
            roll3Obj.setFocusable(true);
        }
    }
    void roll4(View view)
    {
        Button roll4Obj=(Button)findViewById(R.id.roll4);
        if(roll4Obj.isFocusable()) {
            roll4Obj.setBackgroundColor(Color.RED);
            roll4Obj.setFocusable(false);
        }
        else
        {
            roll4Obj.setBackgroundColor(Color.GREEN);
            roll4Obj.setFocusable(true);
        }
    }
    void roll5(View view)
    {
        Button roll5Obj=(Button)findViewById(R.id.roll5);
        if(roll5Obj.isFocusable()) {
            roll5Obj.setBackgroundColor(Color.RED);
            roll5Obj.setFocusable(false);
        }
        else
        {
            roll5Obj.setBackgroundColor(Color.GREEN);
            roll5Obj.setFocusable(true);
        }
    }
    void roll6(View view)
    {
        Button roll6Obj=(Button)findViewById(R.id.roll6);
        if(roll6Obj.isFocusable()) {
            roll6Obj.setBackgroundColor(Color.RED);
            roll6Obj.setFocusable(false);
        }
        else
        {
            roll6Obj.setBackgroundColor(Color.GREEN);
            roll6Obj.setFocusable(true);
        }
    }
    void roll7(View view)
    {
        Button roll7Obj=(Button)findViewById(R.id.roll7);
        if(roll7Obj.isFocusable()) {
            roll7Obj.setBackgroundColor(Color.RED);
            roll7Obj.setFocusable(false);
        }
        else
        {
            roll7Obj.setBackgroundColor(Color.GREEN);
            roll7Obj.setFocusable(true);
        }
    }
    void roll8(View view)
    {
        Button roll8Obj=(Button)findViewById(R.id.roll8);
        if(roll8Obj.isFocusable()) {
            roll8Obj.setBackgroundColor(Color.RED);
            roll8Obj.setFocusable(false);
        }
        else
        {
            roll8Obj.setBackgroundColor(Color.GREEN);
            roll8Obj.setFocusable(true);
        }
    }
    void roll9(View view)
    {
        Button roll9Obj=(Button)findViewById(R.id.roll9);
        if(roll9Obj.isFocusable()) {
            roll9Obj.setBackgroundColor(Color.RED);
            roll9Obj.setFocusable(false);
        }
        else
        {
            roll9Obj.setBackgroundColor(Color.GREEN);
            roll9Obj.setFocusable(true);
        }
    }
    void roll10(View view)
    {
        Button roll10Obj=(Button)findViewById(R.id.roll10);
        if(roll10Obj.isFocusable()) {
            roll10Obj.setBackgroundColor(Color.RED);
            roll10Obj.setFocusable(false);
        }
        else
        {
            roll10Obj.setBackgroundColor(Color.GREEN);
            roll10Obj.setFocusable(true);
        }
    }
    void roll11(View view)
    {
        Button roll11Obj=(Button)findViewById(R.id.roll11);
        if(roll11Obj.isFocusable()) {
            roll11Obj.setBackgroundColor(Color.RED);
            roll11Obj.setFocusable(false);
        }
        else
        {
            roll11Obj.setBackgroundColor(Color.GREEN);
            roll11Obj.setFocusable(true);
        }
    }
    void roll12(View view)
    {
        Button roll12Obj=(Button)findViewById(R.id.roll12);
        if(roll12Obj.isFocusable()) {
            roll12Obj.setBackgroundColor(Color.RED);
            roll12Obj.setFocusable(false);
        }
        else
        {
            roll12Obj.setBackgroundColor(Color.GREEN);
            roll12Obj.setFocusable(true);
        }
    }
    void roll13(View view)
    {
        Button roll13Obj=(Button)findViewById(R.id.roll13);
        if(roll13Obj.isFocusable()) {
            roll13Obj.setBackgroundColor(Color.RED);
            roll13Obj.setFocusable(false);
        }
        else
        {
            roll13Obj.setBackgroundColor(Color.GREEN);
            roll13Obj.setFocusable(true);
        }
    }
    void roll14(View view)
    {
        Button roll14Obj=(Button)findViewById(R.id.roll14);
        if(roll14Obj.isFocusable()) {
            roll14Obj.setBackgroundColor(Color.RED);
            roll14Obj.setFocusable(false);
        }
        else
        {
            roll14Obj.setBackgroundColor(Color.GREEN);
            roll14Obj.setFocusable(true);
        }
    }
    void roll15(View view)
    {
        Button roll15Obj=(Button)findViewById(R.id.roll15);
        if(roll15Obj.isFocusable()) {
            roll15Obj.setBackgroundColor(Color.RED);
            roll15Obj.setFocusable(false);
        }
        else
        {
            roll15Obj.setBackgroundColor(Color.GREEN);
            roll15Obj.setFocusable(true);
        }
    }
    void roll16(View view)
    {
        Button roll16Obj=(Button)findViewById(R.id.roll16);
        if(roll16Obj.isFocusable()) {
            roll16Obj.setBackgroundColor(Color.RED);
            roll16Obj.setFocusable(false);
        }
        else
        {
            roll16Obj.setBackgroundColor(Color.GREEN);
            roll16Obj.setFocusable(true);
        }
    }
    void roll17(View view)
    {
        Button roll17Obj=(Button)findViewById(R.id.roll17);
        if(roll17Obj.isFocusable()) {
            roll17Obj.setBackgroundColor(Color.RED);
            roll17Obj.setFocusable(false);
        }
        else
        {
            roll17Obj.setBackgroundColor(Color.GREEN);
            roll17Obj.setFocusable(true);
        }
    }
    void roll18(View view)
    {
        Button roll18Obj=(Button)findViewById(R.id.roll18);
        if(roll18Obj.isFocusable()) {
            roll18Obj.setBackgroundColor(Color.RED);
            roll18Obj.setFocusable(false);
        }
        else
        {
            roll18Obj.setBackgroundColor(Color.GREEN);
            roll18Obj.setFocusable(true);
        }
    }
    void roll19(View view)
    {
        Button roll19Obj=(Button)findViewById(R.id.roll19);
        if(roll19Obj.isFocusable()) {
            roll19Obj.setBackgroundColor(Color.RED);
            roll19Obj.setFocusable(false);
        }
        else
        {
            roll19Obj.setBackgroundColor(Color.GREEN);
            roll19Obj.setFocusable(true);
        }
    }
    void roll20(View view)
    {
        Button roll20Obj=(Button)findViewById(R.id.roll20);
        if(roll20Obj.isFocusable()) {
            roll20Obj.setBackgroundColor(Color.RED);
            roll20Obj.setFocusable(false);
        }
        else
        {
            roll20Obj.setBackgroundColor(Color.GREEN);
            roll20Obj.setFocusable(true);
        }
    }
    void roll21(View view)
    {
        Button roll21Obj=(Button)findViewById(R.id.roll21);
        if(roll21Obj.isFocusable()) {
            roll21Obj.setBackgroundColor(Color.RED);
            roll21Obj.setFocusable(false);
        }
        else
        {
            roll21Obj.setBackgroundColor(Color.GREEN);
            roll21Obj.setFocusable(true);
        }
    }
    void roll22(View view)
    {
        Button roll22Obj=(Button)findViewById(R.id.roll22);
        if(roll22Obj.isFocusable()) {
            roll22Obj.setBackgroundColor(Color.RED);
            roll22Obj.setFocusable(false);
        }
        else
        {
            roll22Obj.setBackgroundColor(Color.GREEN);
            roll22Obj.setFocusable(true);
        }
    }
    void roll23(View view)
    {
        Button roll23Obj=(Button)findViewById(R.id.roll23);
        if(roll23Obj.isFocusable()) {
            roll23Obj.setBackgroundColor(Color.RED);
            roll23Obj.setFocusable(false);
        }
        else
        {
            roll23Obj.setBackgroundColor(Color.GREEN);
            roll23Obj.setFocusable(true);
        }
    }
    void roll24(View view)
    {
        Button roll24Obj=(Button)findViewById(R.id.roll24);
        if(roll24Obj.isFocusable()) {
            roll24Obj.setBackgroundColor(Color.RED);
            roll24Obj.setFocusable(false);
        }
        else
        {
            roll24Obj.setBackgroundColor(Color.GREEN);
            roll24Obj.setFocusable(true);
        }
    }
    void roll25(View view)
    {
        Button roll25Obj=(Button)findViewById(R.id.roll25);
        if(roll25Obj.isFocusable()) {
            roll25Obj.setBackgroundColor(Color.RED);
            roll25Obj.setFocusable(false);
        }
        else
        {
            roll25Obj.setBackgroundColor(Color.GREEN);
            roll25Obj.setFocusable(true);
        }
    }
    void roll26(View view)
    {
        Button roll26Obj=(Button)findViewById(R.id.roll26);
        if(roll26Obj.isFocusable()) {
            roll26Obj.setBackgroundColor(Color.RED);
            roll26Obj.setFocusable(false);
        }
        else
        {
            roll26Obj.setBackgroundColor(Color.GREEN);
            roll26Obj.setFocusable(true);
        }
    }
    void roll27(View view)
    {
        Button roll27Obj=(Button)findViewById(R.id.roll27);
        if(roll27Obj.isFocusable()) {
            roll27Obj.setBackgroundColor(Color.RED);
            roll27Obj.setFocusable(false);
        }
        else
        {
            roll27Obj.setBackgroundColor(Color.GREEN);
            roll27Obj.setFocusable(true);
        }
    }
    void roll28(View view)
    {
        Button roll28Obj=(Button)findViewById(R.id.roll28);
        if(roll28Obj.isFocusable()) {
            roll28Obj.setBackgroundColor(Color.RED);
            roll28Obj.setFocusable(false);
        }
        else
        {
            roll28Obj.setBackgroundColor(Color.GREEN);
            roll28Obj.setFocusable(true);
        }
    }
    void roll29(View view)
    {
        Button roll29Obj=(Button)findViewById(R.id.roll29);
        if(roll29Obj.isFocusable()) {
            roll29Obj.setBackgroundColor(Color.RED);
            roll29Obj.setFocusable(false);
        }
        else
        {
            roll29Obj.setBackgroundColor(Color.GREEN);
            roll29Obj.setFocusable(true);
        }
    }
    void roll30(View view)
    {
        Button roll30Obj=(Button)findViewById(R.id.roll30);
        if(roll30Obj.isFocusable()) {
            roll30Obj.setBackgroundColor(Color.RED);
            roll30Obj.setFocusable(false);
        }
        else
        {
            roll30Obj.setBackgroundColor(Color.GREEN);
            roll30Obj.setFocusable(true);
        }
    }
    void roll31(View view)
    {
        Button roll31Obj=(Button)findViewById(R.id.roll31);
        if(roll31Obj.isFocusable()) {
            roll31Obj.setBackgroundColor(Color.RED);
            roll31Obj.setFocusable(false);
        }
        else
        {
            roll31Obj.setBackgroundColor(Color.GREEN);
            roll31Obj.setFocusable(true);
        }
    }
    void roll32(View view)
    {
        Button roll32Obj=(Button)findViewById(R.id.roll32);
        if(roll32Obj.isFocusable()) {
            roll32Obj.setBackgroundColor(Color.RED);
            roll32Obj.setFocusable(false);
        }
        else
        {
            roll32Obj.setBackgroundColor(Color.GREEN);
            roll32Obj.setFocusable(true);
        }
    }
    void roll33(View view)
    {
        Button roll33Obj=(Button)findViewById(R.id.roll33);
        if(roll33Obj.isFocusable()) {
            roll33Obj.setBackgroundColor(Color.RED);
            roll33Obj.setFocusable(false);
        }
        else
        {
            roll33Obj.setBackgroundColor(Color.GREEN);
            roll33Obj.setFocusable(true);
        }
    }
    void roll34(View view)
    {
        Button roll34Obj=(Button)findViewById(R.id.roll34);
        if(roll34Obj.isFocusable()) {
            roll34Obj.setBackgroundColor(Color.RED);
            roll34Obj.setFocusable(false);
        }
        else
        {
            roll34Obj.setBackgroundColor(Color.GREEN);
            roll34Obj.setFocusable(true);
        }
    }
    void roll35(View view)
    {
        Button roll35Obj=(Button)findViewById(R.id.roll35);
        if(roll35Obj.isFocusable()) {
            roll35Obj.setBackgroundColor(Color.RED);
            roll35Obj.setFocusable(false);
        }
        else
        {
            roll35Obj.setBackgroundColor(Color.GREEN);
            roll35Obj.setFocusable(true);
        }
    }
    void roll36(View view)
    {
        Button roll36Obj=(Button)findViewById(R.id.roll36);
        if(roll36Obj.isFocusable()) {
            roll36Obj.setBackgroundColor(Color.RED);
            roll36Obj.setFocusable(false);
        }
        else
        {
            roll36Obj.setBackgroundColor(Color.GREEN);
            roll36Obj.setFocusable(true);
        }
    }
    void roll37(View view)
    {
        Button roll37Obj=(Button)findViewById(R.id.roll37);
        if(roll37Obj.isFocusable()) {
            roll37Obj.setBackgroundColor(Color.RED);
            roll37Obj.setFocusable(false);
        }
        else
        {
            roll37Obj.setBackgroundColor(Color.GREEN);
            roll37Obj.setFocusable(true);
        }
    }
    void roll38(View view)
    {
        Button roll38Obj=(Button)findViewById(R.id.roll38);
        if(roll38Obj.isFocusable()) {
            roll38Obj.setBackgroundColor(Color.RED);
            roll38Obj.setFocusable(false);
        }
        else
        {
            roll38Obj.setBackgroundColor(Color.GREEN);
            roll38Obj.setFocusable(true);
        }
    }
    void roll39(View view)
    {
        Button roll39Obj=(Button)findViewById(R.id.roll39);
        if(roll39Obj.isFocusable()) {
            roll39Obj.setBackgroundColor(Color.RED);
            roll39Obj.setFocusable(false);
        }
        else
        {
            roll39Obj.setBackgroundColor(Color.GREEN);
            roll39Obj.setFocusable(true);
        }
    }
    void roll40(View view)
    {
        Button roll40Obj=(Button)findViewById(R.id.roll40);
        if(roll40Obj.isFocusable()) {
            roll40Obj.setBackgroundColor(Color.RED);
            roll40Obj.setFocusable(false);
        }
        else
        {
            roll40Obj.setBackgroundColor(Color.GREEN);
            roll40Obj.setFocusable(true);
        }
    }
    void roll41(View view)
    {
        Button roll41Obj=(Button)findViewById(R.id.roll41);
        if(roll41Obj.isFocusable()) {
            roll41Obj.setBackgroundColor(Color.RED);
            roll41Obj.setFocusable(false);
        }
        else
        {
            roll41Obj.setBackgroundColor(Color.GREEN);
            roll41Obj.setFocusable(true);
        }
    }
    void roll42(View view)
    {
        Button roll42Obj=(Button)findViewById(R.id.roll42);
        if(roll42Obj.isFocusable()) {
            roll42Obj.setBackgroundColor(Color.RED);
            roll42Obj.setFocusable(false);
        }
        else
        {
            roll42Obj.setBackgroundColor(Color.GREEN);
            roll42Obj.setFocusable(true);
        }
    }
    void roll43(View view)
    {
        Button roll43Obj=(Button)findViewById(R.id.roll43);
        if(roll43Obj.isFocusable()) {
            roll43Obj.setBackgroundColor(Color.RED);
            roll43Obj.setFocusable(false);
        }
        else
        {
            roll43Obj.setBackgroundColor(Color.GREEN);
            roll43Obj.setFocusable(true);
        }
    }
    void roll44(View view)
    {
        Button roll44Obj=(Button)findViewById(R.id.roll44);
        if(roll44Obj.isFocusable()) {
            roll44Obj.setBackgroundColor(Color.RED);
            roll44Obj.setFocusable(false);
        }
        else
        {
            roll44Obj.setBackgroundColor(Color.GREEN);
            roll44Obj.setFocusable(true);
        }
    }
    void roll45(View view)
    {
        Button roll45Obj=(Button)findViewById(R.id.roll45);
        if(roll45Obj.isFocusable()) {
            roll45Obj.setBackgroundColor(Color.RED);
            roll45Obj.setFocusable(false);
        }
        else
        {
            roll45Obj.setBackgroundColor(Color.GREEN);
            roll45Obj.setFocusable(true);
        }
    }
    void roll46(View view)
    {
        Button roll46Obj=(Button)findViewById(R.id.roll46);
        if(roll46Obj.isFocusable()) {
            roll46Obj.setBackgroundColor(Color.RED);
            roll46Obj.setFocusable(false);
        }
        else
        {
            roll46Obj.setBackgroundColor(Color.GREEN);
            roll46Obj.setFocusable(true);
        }
    }
    void roll47(View view)
    {
        Button roll47Obj=(Button)findViewById(R.id.roll47);
        if(roll47Obj.isFocusable()) {
            roll47Obj.setBackgroundColor(Color.RED);
            roll47Obj.setFocusable(false);
        }
        else
        {
            roll47Obj.setBackgroundColor(Color.GREEN);
            roll47Obj.setFocusable(true);
        }
    }
    void roll48(View view)
    {
        Button roll48Obj=(Button)findViewById(R.id.roll48);
        if(roll48Obj.isFocusable()) {
            roll48Obj.setBackgroundColor(Color.RED);
            roll48Obj.setFocusable(false);
        }
        else
        {
            roll48Obj.setBackgroundColor(Color.GREEN);
            roll48Obj.setFocusable(true);
        }
    }
    void roll49(View view)
    {
        Button roll49Obj=(Button)findViewById(R.id.roll49);
        if(roll49Obj.isFocusable()) {
            roll49Obj.setBackgroundColor(Color.RED);
            roll49Obj.setFocusable(false);
        }
        else
        {
            roll49Obj.setBackgroundColor(Color.GREEN);
            roll49Obj.setFocusable(true);
        }
    }
    void roll50(View view)
    {
        Button roll50Obj=(Button)findViewById(R.id.roll50);
        if(roll50Obj.isFocusable()) {
            roll50Obj.setBackgroundColor(Color.RED);
            roll50Obj.setFocusable(false);
        }
        else
        {
            roll50Obj.setBackgroundColor(Color.GREEN);
            roll50Obj.setFocusable(true);
        }
    }
    void roll51(View view)
    {
        Button roll51Obj=(Button)findViewById(R.id.roll51);
        if(roll51Obj.isFocusable()) {
            roll51Obj.setBackgroundColor(Color.RED);
            roll51Obj.setFocusable(false);
        }
        else
        {
            roll51Obj.setBackgroundColor(Color.GREEN);
            roll51Obj.setFocusable(true);
        }
    }
    void roll52(View view)
    {
        Button roll52Obj=(Button)findViewById(R.id.roll52);
        if(roll52Obj.isFocusable()) {
            roll52Obj.setBackgroundColor(Color.RED);
            roll52Obj.setFocusable(false);
        }
        else
        {
            roll52Obj.setBackgroundColor(Color.GREEN);
            roll52Obj.setFocusable(true);
        }
    }
    void roll53(View view)
    {
        Button roll53Obj=(Button)findViewById(R.id.roll53);
        if(roll53Obj.isFocusable()) {
            roll53Obj.setBackgroundColor(Color.RED);
            roll53Obj.setFocusable(false);
        }
        else
        {
            roll53Obj.setBackgroundColor(Color.GREEN);
            roll53Obj.setFocusable(true);
        }
    }
    void roll54(View view)
    {
        Button roll54Obj=(Button)findViewById(R.id.roll54);
        if(roll54Obj.isFocusable()) {
            roll54Obj.setBackgroundColor(Color.RED);
            roll54Obj.setFocusable(false);
        }
        else
        {
            roll54Obj.setBackgroundColor(Color.GREEN);
            roll54Obj.setFocusable(true);
        }
    }
    void roll55(View view)
    {
        Button roll55Obj=(Button)findViewById(R.id.roll55);
        if(roll55Obj.isFocusable()) {
            roll55Obj.setBackgroundColor(Color.RED);
            roll55Obj.setFocusable(false);
        }
        else
        {
            roll55Obj.setBackgroundColor(Color.GREEN);
            roll55Obj.setFocusable(true);
        }
    }
    void roll56(View view)
    {
        Button roll56Obj=(Button)findViewById(R.id.roll56);
        if(roll56Obj.isFocusable()) {
            roll56Obj.setBackgroundColor(Color.RED);
            roll56Obj.setFocusable(false);
        }
        else
        {
            roll56Obj.setBackgroundColor(Color.GREEN);
            roll56Obj.setFocusable(true);
        }
    }
    void roll57(View view)
    {
        Button roll57Obj=(Button)findViewById(R.id.roll57);
        if(roll57Obj.isFocusable()) {
            roll57Obj.setBackgroundColor(Color.RED);
            roll57Obj.setFocusable(false);
        }
        else
        {
            roll57Obj.setBackgroundColor(Color.GREEN);
            roll57Obj.setFocusable(true);
        }
    }
    void roll58(View view)
    {
        Button roll58Obj=(Button)findViewById(R.id.roll58);
        if(roll58Obj.isFocusable()) {
            roll58Obj.setBackgroundColor(Color.RED);
            roll58Obj.setFocusable(false);
        }
        else
        {
            roll58Obj.setBackgroundColor(Color.GREEN);
            roll58Obj.setFocusable(true);
        }
    }
    void roll59(View view)
    {
        Button roll59Obj=(Button)findViewById(R.id.roll59);
        if(roll59Obj.isFocusable()) {
            roll59Obj.setBackgroundColor(Color.RED);
            roll59Obj.setFocusable(false);
        }
        else
        {
            roll59Obj.setBackgroundColor(Color.GREEN);
            roll59Obj.setFocusable(true);
        }
    }
    void roll60(View view)
    {
        Button roll60Obj=(Button)findViewById(R.id.roll60);
        if(roll60Obj.isFocusable()) {
            roll60Obj.setBackgroundColor(Color.RED);
            roll60Obj.setFocusable(false);
        }
        else
        {
            roll60Obj.setBackgroundColor(Color.GREEN);
            roll60Obj.setFocusable(true);
        }
    }
}
