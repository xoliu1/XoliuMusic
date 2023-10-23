package com.xoliu.xoliumusic.Base


import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType
import java.net.URL


abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    lateinit var binding: VB
    lateinit var mContext: AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //利用反射，调用指定ViewBinding中的inflate方法填充视图
        mContext = this
        val type = javaClass.genericSuperclass
        if (type is ParameterizedType) {
            val clazz = type.actualTypeArguments[0] as Class<VB>
            val method = clazz.getMethod("inflate", LayoutInflater::class.java)
            binding = method.invoke(null, layoutInflater) as VB
            setContentView(binding.root)
        }


    }
    /***
     * @param msg 展示的文本
     * @return
     * @author xoliu
     * @create 23-10-22
     **/

    fun showShortToast(msg: String){
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
    fun showLongToast(msg: String){
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show()
    }

    /**
     * 跳转页面
     * @param clazz 目标页面
     */
    protected open fun jumpActivity(clazz: Class<*>?) {
        startActivity(Intent(mContext, clazz))
    }

    /**
     * 跳转页面并关闭当前页面
     * @param clazz 目标页面
     */
    protected open fun jumpActivityFinish(clazz: Class<*>?) {
        startActivity(Intent(mContext, clazz))
        //kotlin 使用 类名::class.java 表示
        finish()
    }
    /***
     * 设置返回键
     * @param null
     * @return
     * @author xoliu
     * @create 23-10-22
     **/

    protected open fun back(toolbar: Toolbar) {
        toolbar.setNavigationOnClickListener { v: View? -> onBackPressed() }
    }

    protected open fun backAndFinish(toolbar: Toolbar) {
        toolbar.setNavigationOnClickListener { v: View? -> finish() }
    }

    /**
     * 全屏沉浸式
     */
    protected open fun setFullScreenImmersion() {
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        val option = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        window.decorView.systemUiVisibility = option
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
    }

    fun openUrl(url: String){
        val uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }





}

