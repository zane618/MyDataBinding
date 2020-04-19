package com.example.mydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.example.mydatabinding.bean.User;
import com.example.mydatabinding.bean.User2;
import com.example.mydatabinding.databinding.ActivityMainBinding;

public class DataBindingActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setTitle("DataBindingActivity");
        binding.edit1.setHint("public");
        User user = new User();
        user.setName("zhangsan");
        user.setAge(19);
        user.setSex("man");
        binding.setUser(user);

        User2 user2 = new User2();

        binding.setUser2(user2);

        binding.setPreseneter(new Presenter());
//        binding.button1.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });

    }

    public class Presenter {
        public void onCLick(View v) {
            Toast.makeText(DataBindingActivity.this, binding.getUser().getName(), Toast.LENGTH_SHORT).show();

        }

        public boolean onLongClick11(View v) {

            Toast.makeText(DataBindingActivity.this, "long click", Toast.LENGTH_SHORT).show();
            return false;
        }

        public void afterfdaf(Editable s) {
            binding.getUser().setName(s.toString());
            binding.getUser2().name.set(s.toString());
        }

        public void onCLickToastAge(User user) {
            Toast.makeText(DataBindingActivity.this, binding.getUser().getAge() + "", Toast.LENGTH_SHORT).show();
        }
    }
}
