package com.yu.databinding;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yu.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        userInfo = new UserInfo();
        userInfo.username.set("123");
        userInfo.password.set("456");

        mainBinding.setUser(userInfo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.e("haha", userInfo.username.get() + "---" + userInfo.password.get());
//                Toast.makeText(this, userInfo.getUsername(), Toast.LENGTH_LONG).show();
            }
        }, 10000);
    }

}
