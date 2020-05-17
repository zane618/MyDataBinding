package com.example.mydatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import androidx.databinding.DataBindingUtil
import com.example.mydatabinding.databinding.ActivityMainMenuBinding
import com.example.mydatabinding.lifecycle.ViewModelActivity
import com.example.mydatabinding.lifecycle.ViewModel_Databinding_Activity

class MainMenuActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var dataBinding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_menu)
        setTitle("MainMenuActviity")
        dataBinding.btn1.setOnClickListener(this)
        dataBinding.btn2.setOnClickListener(this)
        dataBinding.btn3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            dataBinding.btn1 -> {
                val intent = Intent(this, DataBindingActivity::class.java)
                startActivity(intent)
            }
            dataBinding.btn2 -> {
                startActivity(Intent(this, ViewModelActivity::class.java))
            }
            dataBinding.btn3 -> {
                startActivity(Intent(this, ViewModel_Databinding_Activity::class.java))
            }
        }
    }
}
