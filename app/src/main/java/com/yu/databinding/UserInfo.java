package com.yu.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class UserInfo {

//    // 第一种方式  需要集成BaseObservable
//    private String username;
//
//    private String password;
//
//    @Bindable
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//        notifyPropertyChanged(BR.username);
//    }
//
//    @Bindable
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//        notifyPropertyChanged(BR.password);
//    }

    // 第二种方式
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();
}
