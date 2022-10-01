package com.buczi.sheetbit.rulesprovider.api.mission

import com.buczi.sheetbit.rulesprovider.RULES_PROVIDER_SERVICE
import com.buczi.sheetbit.rulesprovider.model.mission.MissionDTO
import com.buczi.sheetbit.rulesprovider.model.mission.MissionId
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(RULES_PROVIDER_SERVICE)
interface MissionModificationClient {
    @RequestMapping(method = [RequestMethod.POST], value = ["/rules/mission/modify/add"])
    fun addObjective(mission: MissionDTO)

    @RequestMapping(method = [RequestMethod.POST], value = ["/rules/mission/modify/update"])
    fun updateMission(mission: MissionDTO)

    @RequestMapping(method = [RequestMethod.POST], value = ["/rules/mission/modify/image/{id}"])
    fun addImage(@PathVariable("id") id: MissionId, image: String)

    @RequestMapping(method = [RequestMethod.DELETE], value = ["/rules/mission/modify/delete/{id}"])
    fun getFactionsRules(@PathVariable("id") id: MissionId)
}