package com.spring.helper

data class BaseResponse<T:Any> (
    val code:Int,
    val status:String,
    val data:T
)