package com.xoliu.xoliumusic.ui.Splash

import android.os.Bundle
import android.view.View
import com.xoliu.xoliumusic.Base.BaseActivity
import com.xoliu.xoliumusic.databinding.ActivityLoginBinding
import com.xoliu.xoliumusic.ui.Main.MainActivity

/***
 * 登录/注册界面
 * @author xoliu
 * @create 23-10-23
 **/

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //初始化点击事件
        initData()
        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString();
            val password = binding.etPassword.text.toString();
            if (username == "" || password == "") {
                showShortToast("请填写账号信息")
            } else if (binding.checkBoxAgree.isChecked == false) {
                showShortToast("请阅读并勾选协议")
            } else {
                jumpActivityFinish(MainActivity::class.java)
            }
        }

        //设置沉浸式
        setFullScreenImmersion()
    }
    fun initData(){
        //设置TextView的点击事件
        binding.regisURL.setOnClickListener(View.OnClickListener {
                openUrl("https://mail.163.com/register/#/pn")
        })
        binding.tvForget.setOnClickListener{
            openUrl("https://id.163.com/mail/retrievepassword#/verifyAccount")
        }
    }
}