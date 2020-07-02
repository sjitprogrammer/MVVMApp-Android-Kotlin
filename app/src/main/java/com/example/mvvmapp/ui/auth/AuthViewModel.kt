package com.example.mvvmapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmapp.data.repositories.UserRepository

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null

    var authListener: AuthListener? = null
    fun onLoginButtonClick(view: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("please Enter email or password!")
            return
        }
        val liginResponse = UserRepository().userLogin(email!!, password!!)
        authListener?.onSuccess(liginResponse)
    }
}