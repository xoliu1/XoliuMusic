package com.xoliu.xoliumusic.ui.tools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.xoliu.xoliumusic.Base.BaseActivity
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.ActivityShiqvBinding

class shiqv : BaseActivity<ActivityShiqvBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initToolBar()
    }
    fun initToolBar(){
        binding.shiqvToolbar.setNavigationOnClickListener {
                finish()
        }
    }
}