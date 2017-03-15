package com.example.allen.myapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.allen.myapplication.R;
import com.example.allen.myapplication.udp.UDPActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        initView();
    }

    private Button udp;

    private void initView() {
        udp = (Button) findViewById(R.id.udp);
        udp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.udp:
                Intent intent = new Intent(this, UDPActivity.class);
                startActivity(intent);
                break;
        }
    }
}
