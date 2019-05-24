package com.example.testlogin;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;

/*
*
* 修改密码
* */
public class ForgetPawActivity extends AppCompatActivity {

    private Button mYanZhengBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_paw);
        mYanZhengBtn = findViewById(R.id.yanzhengBtn);
        //设置透明度
        mYanZhengBtn.getBackground().setAlpha(10);
        initView();
    }

    private void initView() {
        //返回Login页面
        final ImageView mBackBtn = findViewById(R.id.backBtn);
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPawActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //new倒计时对象,总共的时间,每隔多少秒更新一次时间
        final MyCountDownTimer myCountDownTimer = new MyCountDownTimer(60000,1000);

        //验证码动态更改
        mYanZhengBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountDownTimer.start();
            }
        });
    }

    class MyCountDownTimer extends CountDownTimer {
        //倒计时函数

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        //计时过程
        @Override
        public void onTick(long l) {
            //防止计时过程中重复点击
            mYanZhengBtn.setClickable(false);
            mYanZhengBtn.setText("再次获取"+l/1000+"s");

        }

        //计时完毕的方法
        @Override
        public void onFinish() {
            //重新给Button设置文字
            mYanZhengBtn.setText("重新获取");
            //设置可点击
            mYanZhengBtn.setClickable(true);
        }

    }


}

