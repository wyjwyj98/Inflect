package com.example.lenovo.inflect;

import android.app. Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


//界面1
public class MainActivity extends  Activity {
    private TextView textView;
    private ImageView imageView2;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private ImageView imageView;
    private TextView textView8;
    private ImageView imageView3;
    private ImageView imageView1;
    private TextView textView9;
    private ImageView imageView4;
    private ImageView imageView5;
    private TextView textView10;
    private ImageView imageView6;
    private ImageView imageView7;
    private TextView textView11;
    private ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//调用布局文件xml的方法
        textView= (TextView)findViewById(R.id.textView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        textView1= (TextView) findViewById(R.id.textView1);
        textView2= (TextView) findViewById(R.id.textView2);
        textView3= (TextView) findViewById(R.id.textView3);
        textView4= (TextView) findViewById(R.id.textView4);
        textView5= (TextView) findViewById(R.id.textView5);
        textView6= (TextView) findViewById(R.id.textView6);
        textView7= (TextView) findViewById(R.id.textView7);
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.secreet);
        textView8= (TextView) findViewById(R.id.textView8);
        imageView3= (ImageView) findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.right);
        imageView1= (ImageView) findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.happy);
        textView9= (TextView) findViewById(R.id.textView9);
        imageView4= (ImageView) findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.right);
        imageView5= (ImageView) findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.put);
        textView10= (TextView) findViewById(R.id.textView10);
        imageView6= (ImageView) findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.right);
        imageView7= (ImageView) findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.set);
        textView11= (TextView) findViewById(R.id.textView11);
        imageView8= (ImageView) findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.right);
    }

    /*    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        textView1= (TextView) findViewById(R.id.textView1);
        textView2= (TextView) findViewById(R.id.textView2);
        textView3= (TextView) findViewById(R.id.textView3);
        textView4= (TextView) findViewById(R.id.textView4);
        textView5= (TextView) findViewById(R.id.textView5);
        textView6= (TextView) findViewById(R.id.textView6);
        textView7= (TextView) findViewById(R.id.textView7);
        imageView= (ImageView) findViewById(R.id.imageView);
        textView8= (TextView) findViewById(R.id.textView8);
        imageView4= (ImageView) findViewById(R.id.imageView4);
        imageView5= (ImageView) findViewById(R.id.imageView5);
        textView9= (TextView) findViewById(R.id.textView9);
        imageView6= (ImageView) findViewById(R.id.imageView6);
        imageView7= (ImageView) findViewById(R.id.imageView7);
        textView10= (TextView) findViewById(R.id.textView10);
        imageView8= (ImageView) findViewById(R.id.imageView8);
        imageView9= (ImageView)findViewById(R.id.imageView9);
        textView11= (TextView) findViewById(R.id.textView11);
        imageView10= (ImageView)findViewById(R.id.imageView10);
    }*/

    }

