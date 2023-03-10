package com.spring.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="showcase")
data class ShowCase(
    @Id
    @Column(name="id")
    val id:String,
    @Column(name="title")
    val title:String,
    @Column(name = "image")
    val image:String,
    @Column(name = "description")
    val description:String,
    @Column(name = "category_id")
    val categoryId:String,
    @Column(name = "created_at")
    val createdAt: Date?,
    @Column(name = "updated_at")
    val updatedAt:Date?
)
