package com.example.xieyan.myhotdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.xy.lib.Test;


public class RobustActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robust);
        TextView textView = (TextView) findViewById(R.id.txt_title);
        textView.setText(Test.getTeString());
    }


    public String getString(){
        String str = "";
        for (int i=0;i<20;i++){
            str= str+i+"1323234234353";
        }
        return  str;
    }
    public String getStr(){
        int i = 0;
        i++;
        return  i+"";
    }

}
