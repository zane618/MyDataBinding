package com.example.mydatabinding.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mydatabinding.R

class ViewModelActivity : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var bt: Button
    private lateinit var tvAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        setTitle("ViewModelActivity")
        tv = findViewById(R.id.tv_vm)
        bt = findViewById(R.id.bt_vm)
        tvAge = findViewById(R.id.tv_age)
        /**
         * 创建一个ViewModel
         */
        val userViewModel = ViewModelProviders.of(this).get(UserViewModel2::class.java)
        // 监听ViewModel中user的变化，当它变化时，将TextView重新设置文字
        userViewModel.user.observe(this, Observer {
//            tv.setText(it.name)
            tv.text = it.name
            tvAge.text = it.age.toString()
        })
        bt.setOnClickListener{v ->
            val user = User("张三", 21, 1)
            userViewModel.user.value = user

        }

    }
}
