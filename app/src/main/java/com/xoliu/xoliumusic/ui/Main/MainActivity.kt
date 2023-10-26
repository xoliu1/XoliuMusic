package com.xoliu.xoliumusic.ui.Main



import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.xoliu.xoliumusic.Base.BaseActivity
import com.xoliu.xoliumusic.R
import com.xoliu.xoliumusic.databinding.ActivityMainBinding
import com.xoliu.xoliumusic.ui.tools.shiqv


class MainActivity : BaseActivity<ActivityMainBinding>() {
    private val TAG = "xoliu2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //初始化toolbar
        initToolbar(binding.toolbar)

        //初始化导航栏
        initBTMNV()



    }

    /**
     * 配置首页的toolbar，用到searchView
     * @author xoliu
     * @create 23-10-23
     **/

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        //定义出searchView实体













        return true
    }

    fun initBTMNV(){
        val navView = findViewById<BottomNavigationView>(com.xoliu.xoliumusic.R.id.btmnv)

//        val navController = findNavController(this, com.xoliu.xoliumusic.R.id.nav_host_fragment)
//        setupWithNavController(binding.btmnv, navController)
         val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
         binding.btmnv.setupWithNavController(navHostFragment.navController)
//        val navController = findNavController(R.id.nav_host_fragment)
//        binding.btmnv.setupWithNavController(navController)
    }


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
        Log.d(TAG, "initSearchView: 1")
        //提示词
       // searchView.revealOnFocusHint = true
        searchView.queryHint = "sdfdsfsd"
        Log.d(TAG, "initSearchView: 1")
        //设置输入字符
        searchView.inputType = InputType.TYPE_CLASS_NUMBER
        Log.d(TAG, "initSearchView: 1")
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

}