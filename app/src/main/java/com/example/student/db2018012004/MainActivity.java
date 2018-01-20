package com.example.student.db2018012004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        tv = findViewById(R.id.textView);
    }
    public void click1(View v)
    {
        String str = "";
        if (chk1.isChecked())
        {
            str = str + "漢堡";
        }
        if (chk2.isChecked())
        {
            str = str + "可樂";
        }
        tv.setText(str);

    }
}
