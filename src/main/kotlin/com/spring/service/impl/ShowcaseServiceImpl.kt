package com.spring.service.impl

import com.spring.entity.ShowCase
import com.spring.model.CreateShowcaseRequest
import com.spring.model.ShowcaseResponse
import com.spring.repository.ShowcaseRepository
import com.spring.service.ShowcaseService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ShowcaseServiceImpl(val showcaseRepository: ShowcaseRepository):ShowcaseService {
    override fun create(createShowcaseRequest: CreateShowcaseRequest): ShowcaseResponse {
        val showCase = ShowCase(
            id = createShowcaseRequest.id,
            title = createShowcaseRequest.title,
            image = createShowcaseRequest.image,
            description = createShowcaseRequest.description,
            categoryId = createShowcaseRequest.categoryId,
            createdAt = Date(),
            updatedAt = Date()
        )

        showcaseRepository.save(showCase)
        return ShowcaseResponse(
            id = showCase.id,
            title = showCase.title,
            description = showCase.description,
            categoryId = showCase.categoryId,
            image = showCase.image,
            createdAt = showCase.createdAt!!,
            updatedAt = showCase.updatedAt!!
        )
    }
}