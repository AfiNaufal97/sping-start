package com.spring.repository

import com.spring.entity.ShowCase
import org.springframework.data.jpa.repository.JpaRepository

interface ShowcaseRepository:JpaRepository<ShowCase, String> {

}