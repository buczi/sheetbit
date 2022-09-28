package com.buczi.sheetbit.gameengine

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("RULES-PROVIDER")
interface TestFeign {
    @RequestMapping(method = [RequestMethod.GET], value = ["/rules"])
    fun getRules(): List<String>
}