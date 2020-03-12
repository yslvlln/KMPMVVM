package com.gssi.mvvm

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(msg: String)
}