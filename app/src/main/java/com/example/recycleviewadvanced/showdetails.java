package com.example.recycleviewadvanced;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class showdetails extends AppCompatActivity {
ArrayList<TextView> views;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails);

        TextView t1=findViewById(R.id.textView);
        TextView t2=findViewById(R.id.textView2);
        TextView t3=findViewById(R.id.textView3);
        TextView t4=findViewById(R.id.textView4);
        Intent intent = getIntent();
        VolumeInfo mes = (VolumeInfo) intent.getSerializableExtra("sentvalues");

        t1.setText(mes.getTitle());
        t2.setText(mes.getAuthors());
        t3.setText(mes.getDescription());
        t4.setText(mes.getLanguage());
    }
}
