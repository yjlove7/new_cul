package com.example.owner.work_ex;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    EditText edit1,edit2;
    Button b_add,b_sub,b_mul,b_div;
    TextView result;
    String num1,num2;
    Integer f_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("계산계산하기");

        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        b_add=(Button)findViewById(R.id.b_add);
        b_sub=(Button)findViewById(R.id.b_sub);
        b_div=(Button)findViewById(R.id.b_div);
        b_mul=(Button)findViewById(R.id.b_mul);

        result=(TextView)findViewById(R.id.result);

            b_add.setOnTouchListener(new View.OnTouchListener()

            {
                public boolean onTouch (View arg0, MotionEvent event){

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                f_result = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText("계산 결과 :" + f_result.toString());
                return false;
            }
            }

            );
            b_sub.setOnTouchListener(new View.OnTouchListener()

            {
                public boolean onTouch (View arg0, MotionEvent event){

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                f_result = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText("계산 결과 :" + f_result.toString());
                return false;
            }
            }

            );
            b_mul.setOnTouchListener(new View.OnTouchListener()

            {
                public boolean onTouch (View arg0, MotionEvent event){

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                f_result = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText("계산 결과 :" + f_result.toString());
                return false;
            }
            }

            );

            b_div.setOnTouchListener(new View.OnTouchListener()

            {
                public boolean onTouch (View arg0, MotionEvent event){

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                f_result = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText("계산 결과 :" + f_result.toString());
                return false;
            }
            }

            );
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
