package com.spring.service

import com.spring.model.CreateShowcaseRequest
import com.spring.model.ShowcaseResponse


interface ShowcaseService {
    fun create(createShowcaseRequest: CreateShowcaseRequest):ShowcaseResponse
}