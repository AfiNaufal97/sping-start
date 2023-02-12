package com.spring.model

import java.util.*

data class CreateShowcaseRequest (
    val id:String,
    val title:String,
    val image:String,
    val description:String,
    val categoryId:String,
)