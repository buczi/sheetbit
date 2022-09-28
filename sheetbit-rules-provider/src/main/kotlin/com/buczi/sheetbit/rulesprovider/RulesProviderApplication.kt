package com.buczi.sheetbit.rulesprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class RulesProviderApplication

fun main(args: Array<String>) {
    runApplication<RulesProviderApplication>(*args)
}
