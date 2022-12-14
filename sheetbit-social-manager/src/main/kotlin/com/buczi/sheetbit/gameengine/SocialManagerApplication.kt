package com.buczi.sheetbit.gameengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
class SocialManagerApplication

fun main(args: Array<String>) {
    runApplication<SocialManagerApplication>(*args)
}
