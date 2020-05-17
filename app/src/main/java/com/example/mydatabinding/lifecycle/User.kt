package com.example.mydatabinding.lifecycle

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * created by zhangshi on 2020/4/19.
 */

data class User(var name: String, val age: Int, val sex: Int)

data class Student(var name: String, var age: Int)

class UserViewModel : ViewModel() {
    val student = Student("学生", 12)
    val user = User("张三", 21, 1)
}

class UserViewModel2 : ViewModel() {
    val user = MutableLiveData<User>()
    val student = MutableLiveData<Student>()

    init {
        student.value = Student("哈哈", 111)
    }

}