package com.example.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
*
*   登录
* */
public class MainActivity extends AppCompatActivity {

    private TextView mForgetPawBtn;
    private EditText mEdtPaw;
    private Button mLoginBtn;
    private TextView mPawError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        //登陆按钮曹祖
        ToHomeActivity();
        //忘记密码操作
        ToForgetPawActivity();
    }




    private void initView() {
        mForgetPawBtn = findViewById(R.id.forgetPawBtn);
        mLoginBtn = findViewById(R.id.loginBtn);
        mEdtPaw = findViewById(R.id.edtPaw);
        mPawError = findViewById(R.id.pawerror);
        mPawError.setVisibility(View.GONE);
    }

    private void ToHomeActivity() {

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtPaw.getText().toString().equals("123456")){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else {
                    mPawError.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void ToForgetPawActivity() {
        mForgetPawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgetPawActivity.class);
                startActivity(intent);

            }
        });
    }
}
