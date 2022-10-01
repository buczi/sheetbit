package com.buczi.sheetbit.rulesprovider.api.mission

import com.buczi.sheetbit.rulesprovider.RULES_PROVIDER_SERVICE
import com.buczi.sheetbit.rulesprovider.model.mission.MissionDTO
import com.buczi.sheetbit.rulesprovider.model.mission.MissionId
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.validation.constraints.NotEmpty

@FeignClient(RULES_PROVIDER_SERVICE)
interface MissionClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/rules/mission"])
    fun getMissions(): List<MissionDTO>

    @RequestMapping(method = [RequestMethod.GET], value = ["/rules/mission/{ids}"])
    fun getMissionsByIds(@NotEmpty @PathVariable("ids") factions: List<MissionId>): List<MissionDTO>
}