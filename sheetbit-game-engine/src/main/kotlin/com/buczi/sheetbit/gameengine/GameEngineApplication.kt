package com.buczi.sheetbit.gameengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
class GameEngineApplication{
    @Bean
    fun testBean(testFeign: TestFeign): String{
//        val rules = testFeign.getRules()
        return "OKI DOKI"
    }
}
fun main(args: Array<String>) {
    runApplication<GameEngineApplication>(*args)
}
