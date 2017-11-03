package com.andy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Years extends AppCompatActivity {
    TextView abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);

        Intent intent=getIntent();
        if(intent!=null)
        {
            int imageId=intent.getIntExtra("imageId",R.drawable.cs);
            String BranchName=intent.getStringExtra("branchName");
            abc= (TextView) findViewById(R.id.abc);
            abc.setText(BranchName);

        }
    }
}
