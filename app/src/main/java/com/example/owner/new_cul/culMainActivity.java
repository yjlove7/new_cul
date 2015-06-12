package com.example.owner.new_cul;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class culMainActivity extends ActionBarActivity {

    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,
            button_8,button_9,button_sub,button_add,button_mul,button_divide, button_clear,button_equal,button_back;
    EditText text1;
    String string;
    String temp;
    int length;
    int yunsan;
    float sum=0;
    Boolean on=false;
    Boolean clean=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cul_main);
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_add = (Button) findViewById(R.id.button_add);
        button_mul = (Button) findViewById(R.id.button_mul);
        button_divide = (Button) findViewById(R.id.button_devide);
        button_clear = (Button) findViewById(R.id.button_clear);
        button_equal = (Button) findViewById(R.id.button_equal);
        button_back = (Button) findViewById(R.id.button_back);

        button_1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function("9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                if(on!=true) function("0");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function2("+");
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function2("-");
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function2("×");
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                function2("÷");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                string=text1.getText().toString();
                length=string.length();
                String last=string.substring(length-1,length);
                int j=0;
                int k=0;
                int point;
                int pointTemp;
                Boolean first = true;



                for(int i=0;i<length;i++)
                {
                    point=string.codePointAt(i);
                    if(point==215||point==247||point==43||point==45)
                    {
                        if(first==true)
                        {
                            sum=sum+Integer.parseInt(string.substring(0,i));
                            first=false;
                        }

                        if(first==false)
                        {
                            if(point==43)
                            {
                                for(j=i+1;j<length;j++)
                                {
                                    pointTemp=string.codePointAt(j);
                                    if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
                                }

                                sum=sum+Integer.parseInt(string.substring(i+1,j));
                            }

                            else if(point==45)
                            {
                                for(j=i+1;j<length;j++)
                                {
                                    pointTemp=string.codePointAt(j);
                                    if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
                                }

                                sum=sum-Integer.parseInt(string.substring(i+1,j));
                            }

                            else if(point==215)
                            {
                                for(j=i+1;j<length;j++)
                                {
                                    pointTemp=string.codePointAt(j);
                                    if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
                                }

                                sum=sum*Integer.parseInt(string.substring(i+1,j));
                            }

                            else if(point==247)
                            {
                                for(j=i+1;j<length;j++)
                                {
                                    pointTemp=string.codePointAt(j);
                                    if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
                                }

                                sum=sum/Integer.parseInt(string.substring(i+1,j));
                            }
                        }

                    }


                }
//				곱하기=215 나누기=247 더하기 =43 빼기=45


                text1.setText(""+sum);
                sum=0;
                clean=true;
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if(clean==true){
                    text1.setText("");
                    clean=false;
                }
                else if(!text1.getText().toString().equals("")){
                    text1.setText(text1.getText().toString().substring(0, text1.getText().toString().length()-1));
                    if(on==true) on=false;
                }
            }
        });
    }


    void function(String a){
        string=text1.getText().toString();
        length=text1.getText().toString().length();



        if(string.equals("")||string.equals("0")){
            text1.setText(""+a);
            on=false;
        }
        else if(clean==true){
            text1.setText(""+a);
            clean=false;
        }
        else{
            text1.setText(string+a);
            on=false;
        }
    }

    void function2(String a){
        string=text1.getText().toString();
        if(clean==true)
        {
            text1.setText("");
            clean=false;

        }
        else if(on==false){
            text1.setText(string+a);
            on=true;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cul_main, menu);
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
