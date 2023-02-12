package com.spring.controller

import com.spring.helper.BaseResponse
import com.spring.model.CreateShowcaseRequest
import com.spring.model.ShowcaseResponse
import com.spring.service.ShowcaseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class ShowcaseController(val showcaseService: ShowcaseService) {

    @PostMapping(
        value=["/api/showcase"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createShowcase(@RequestBody createShowcaseRequest: CreateShowcaseRequest):BaseResponse<ShowcaseResponse>{
        val showCaseResponse = showcaseService.create(createShowcaseRequest)
        return  BaseResponse(
            code = 200,
            status = "Ok",
            data = showCaseResponse
        )
    }

}