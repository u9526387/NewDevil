package com.example.u9526.newdevil;

import android.app.ActionBar;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;

public class Loading_Scene extends AppCompatActivity {

    RingProgressBar ringProgressBar1,ringProgressBar2;
    private android.support.v7.app.ActionBar toolbar;

    int progress = 1;//起始是從多少%開始跑progress

    Handler progress_handle =  new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(progress < 100)
            {
                progress ++ ;
                ringProgressBar1.setProgress(progress);
                ringProgressBar2.setProgress(progress);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading__scene);
        toolbar = getSupportActionBar();
        toolbar.setTitle("正在載入");

        ringProgressBar1 = (RingProgressBar) findViewById(R.id.progress_bar_1);
        ringProgressBar2 = (RingProgressBar) findViewById(R.id.progress_bar_2);

        ringProgressBar1.setOnProgressListener(new RingProgressBar.OnProgressListener() {
            @Override
            public void progressToComplete() {
                Toast.makeText(Loading_Scene.this,"載入完成!!",Toast.LENGTH_SHORT).show();//跑完後，螢幕顯示文字
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 100; i++ ){
                    try{
                        Thread.sleep(20);
                        progress_handle.sendEmptyMessage(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(i == 99){
                        Intent intent = new Intent();
                        intent.setClass(Loading_Scene.this, First_page.class);

                        Bundle bndlanimation = ActivityOptions.makeCustomAnimation(Loading_Scene.this.getApplicationContext(), R.anim.animation,R.anim.animation2).toBundle();
                        startActivity(intent, bndlanimation);

                        finish();//清空記憶體

                    }

                }
            }
        }).start();

    }
}
