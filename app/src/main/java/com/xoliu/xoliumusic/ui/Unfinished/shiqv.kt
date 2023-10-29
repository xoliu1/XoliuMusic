package com.xoliu.xoliumusic.ui.Unfinished

import android.os.Bundle
import com.xoliu.xoliumusic.Base.BaseActivity
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