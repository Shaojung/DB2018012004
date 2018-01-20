package com.example.student.db2018012004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2;
    TextView tv;
    RadioGroup rg;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 = findViewById(R.id.checkBox);
        chk2 = findViewById(R.id.checkBox2);
        tv = findViewById(R.id.textView);
        rg = findViewById(R.id.radioGroup);
        pb = findViewById(R.id.progressBar);
    }
    public void click1(View v)
    {
        StringBuilder sb = new StringBuilder("你買了");

        if (chk1.isChecked())
        {
            sb.append("漢堡");
        }
        if (chk2.isChecked())
        {
            sb.append("可樂");
        }

        switch(rg.getCheckedRadioButtonId())
        {
            case R.id.radioButton:
                sb.append("內用");
                break;
            case R.id.radioButton2:
                sb.append("外帶");
                break;
        }

        tv.setText(sb.toString());

    }
    public void click2(View v)
    {
        pb.setVisibility(View.VISIBLE);
    }
    public void click3(View v)
    {
        pb.setVisibility(View.INVISIBLE);
    }

}
