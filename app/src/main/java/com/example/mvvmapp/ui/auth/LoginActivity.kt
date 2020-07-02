package com.example.mvvmapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmapp.R
import com.example.mvvmapp.databinding.ActivityLoginBinding
import com.example.mvvmapp.util.Toast
import com.example.mvvmapp.util.hide
import com.example.mvvmapp.util.show
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() ,AuthListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        progress_bar.show()
//        Toast("Login Started")
    }

    override fun onSuccess(message: LiveData<String>) {
        progress_bar.hide()
       message.observe(this, Observer {
           Toast(it)
       })
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        Toast(message)
    }
}