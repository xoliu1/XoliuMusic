package com.xoliu.xoliumusic.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xoliu.xoliumusic.Base.BaseActivity
import com.xoliu.xoliumusic.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvHello.text = "s"
    }

}