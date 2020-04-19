package com.example.mydatabinding.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mydatabinding.BR;

/**
 * created by zhangshi on 2020/4/18.
 */
public class User extends BaseObservable {

    private String name;
    private int age;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    @Bindable
    public String getName() {
        return name;
    }

//    @Bindable
    public void setName(String name) {
        this.name = name;
//        notifyPropertyChanged(BR.name);
        notifyChange();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
