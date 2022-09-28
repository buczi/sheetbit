package com.buczi.sheetbit.rulesprovider

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    
    @GetMapping("/rules")
    fun getRules(): List<String>{
        return listOf("RULE 1", "RULE 2")
    }
}