package com.andy.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AllListFrags extends AppCompatActivity {

    Sequence sequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);

        Intent intent = getIntent();
        if (intent != null) {
            sequence = new Sequence();
            sequence.setBranch(intent.getStringExtra("branchName"));

        }
        BranchFragment Bf = new BranchFragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(Bf, "years");
        ft.commit();

    }

    public String getBranch() {
        return sequence.getBranch();
    }
}
