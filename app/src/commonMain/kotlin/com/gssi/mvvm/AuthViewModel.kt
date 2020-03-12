package com.gssi.mvvm

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel

class AuthViewModel: ViewModel() {
    var emailAddress: MutableLiveData<String> = MutableLiveData("")
    var password: MutableLiveData<String> = MutableLiveData("")

    var authListener: AuthListener? = null

    fun onSignupBtnPressed() {
        authListener?.onStarted()
        if (emailAddress.value.isNullOrEmpty() || password.value.isNullOrEmpty()) {
            authListener?.onFailure("Email address is required")
            return
        }
        authListener?.onSuccess()
    }
}