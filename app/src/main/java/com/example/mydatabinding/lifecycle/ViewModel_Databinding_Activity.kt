package com.example.mydatabinding.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mydatabinding.R
import com.example.mydatabinding.databinding.ActivityViewModelDatabindingBinding

class ViewModel_Databinding_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userViewModel2 = ViewModelProviders.of(this).get(UserViewModel::class.java)
        val binding = DataBindingUtil.setContentView<ActivityViewModelDatabindingBinding>(this, R.layout.activity_view_model__databinding_)
        binding.viewModel = userViewModel2

        // 让xml内绑定的LiveData和Observer建立连接，也正是因为这段代码，让LiveData能感知Activity的生命周期
        binding.lifecycleOwner = this //和下面一句意思一样
//        binding.setLifecycleOwner(this)

        binding.btVm.setOnClickListener{
            userViewModel2.user.name = "李思"
        }
    }
}
