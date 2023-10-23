package com.xoliu.xoliumusic.ui.Main

import com.xoliu.xoliumusic.R
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.view.Menu
import android.view.inputmethod.EditorInfo
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.MenuItemCompat
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.xoliu.xoliumusic.Base.BaseActivity
import com.xoliu.xoliumusic.databinding.ActivityMainBinding
import com.xoliu.xoliumusic.ui.tools.shiqv


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //初始化toolbar
        initToolbar(binding.toolbar)

//        val navView = findViewById<BottomNavigationView>(com.xoliu.xoliumusic.R.id.btmnv)
//
//        val navController = findNavController(this, com.xoliu.xoliumusic.R.id.nav_host_fragment_activity_main)
//        setupWithNavController(binding.btmnv, navController)


    }

    /**
     * 配置首页的toolbar，用到searchView
     * @author xoliu
     * @create 23-10-23
     **/
    @RequiresApi(Build.VERSION_CODES.N_MR1)
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(com.xoliu.xoliumusic.R.menu.menu_search, menu)
        //定义出searchView实体
        var searchItem = menu?.findItem(com.xoliu.xoliumusic.R.id.action_search)
        var searchView = MenuItemCompat.getActionView(searchItem) as SearchView

        //初始化SearchView
        initSearchView(searchView)







        return true
    }

    @RequiresApi(Build.VERSION_CODES.N_MR1)
    fun initSearchView(searchView: SearchView){
        //图标是否显示在搜索框内
        searchView.setIconifiedByDefault(true)

        //是否显示提交按钮
        searchView.isSubmitButtonEnabled = true

        //把回车键设置成搜索
        searchView.setImeOptions(EditorInfo.IME_ACTION_SEARCH)

        //获取焦点
        //searchView.focusable = View.FOCUSABLE
        searchView.requestFocusFromTouch()

        //提示词
        searchView.revealOnFocusHint = true
        searchView.queryHint = "薛之谦"

        //设置输入字符
        searchView.inputType = InputType.TYPE_CLASS_NUMBER
    }

    fun initToolbar(toolbar: Toolbar){
        toolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
        toolbar.setOnMenuItemClickListener { menuItem ->

            when (menuItem.itemId) {
                com.xoliu.xoliumusic.R.id.shiqv -> jumpActivity(shiqv::class.java)
            }

            true
        }
    }
    fun initBtmNv(){
        //binding.btmnv
    }

}