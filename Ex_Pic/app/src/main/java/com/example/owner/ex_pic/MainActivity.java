package com.example.owner.ex_pic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView text1,text2;
    CheckBox chkagree;
    RadioGroup rgroup1;
    RadioButton co1,co2,co3;
    Button b_ok;
    ImageView img_co;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("커피 사진 보기!_!");

        text1=(TextView)findViewById(R.id.text1);
        chkagree= (CheckBox)findViewById(R.id.checkbox);
        rgroup1=(RadioGroup)findViewById(R.id.rgroup1);
        co1 =(RadioButton)findViewById(R.id.co1);
        co2 =(RadioButton)findViewById(R.id.co2);
        co3 =(RadioButton)findViewById(R.id.co3);
        b_ok=(Button)findViewById(R.id.b_ok);
        img_co=(ImageView)findViewById(R.id.img_co);


        chkagree.setOnCheckedChangeListener(new );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
