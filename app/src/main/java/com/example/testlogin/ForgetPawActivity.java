package com.example.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForgetPawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_paw);
        Button mYanZhengBtn = findViewById(R.id.yanzhengBtn);
        mYanZhengBtn.getBackground().setAlpha(30);
        initView();
    }

    private void initView() {
        final ImageView mBackBtn = findViewById(R.id.backBtn);
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPawActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
