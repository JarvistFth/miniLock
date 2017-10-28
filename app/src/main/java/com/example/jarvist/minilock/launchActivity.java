package com.example.jarvist.minilock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.avos.avoscloud.AVOSCloud;

public class launchActivity extends AppCompatActivity {

    private Button registerBtn;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AVOSCloud.initialize(this,"YGB2ErmfjNR7dpAPhPjWFrt4-gzGzoHsz","mxwOs75S8CpyqBGRuGn942mn");
        AVOSCloud.setDebugLogEnabled(true);
        setContentView(R.layout.activity_launch);
        registerBtn = (Button)findViewById(R.id.registerBtn);
        loginBtn = (Button)findViewById(R.id.loginBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(launchActivity.this,RegisterActivity.class);
                startActivity(intent);
                launchActivity.this.finish();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(launchActivity.this,LoginActivity.class);
                startActivity(intent);
                launchActivity.this.finish();
            }
        });


    }
}
