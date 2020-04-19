package com.example.mydatabinding.lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * created by zhangshi on 2020/4/19.
 */

data class User(var name: String, val age: Int, val sex: Int)

class UserViewModel : ViewModel() {
    val user = User("张三", 21, 1)
}

class UserViewModel2 : ViewModel() {
    val user = MutableLiveData<User>()
}