package com.spring

import com.spring.controller.ShowcaseController
import com.spring.service.ShowcaseService
import com.spring.service.impl.ShowcaseServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
