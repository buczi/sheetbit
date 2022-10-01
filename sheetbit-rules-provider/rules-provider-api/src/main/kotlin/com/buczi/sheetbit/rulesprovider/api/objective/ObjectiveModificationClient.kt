package com.buczi.sheetbit.rulesprovider.api.objective

import com.buczi.sheetbit.rulesprovider.RULES_PROVIDER_SERVICE
import com.buczi.sheetbit.rulesprovider.model.mission.MissionId
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(RULES_PROVIDER_SERVICE)
interface ObjectiveModificationClient {

    @RequestMapping(method = [RequestMethod.POST], value = ["/rules/objective/modify/add"])
    fun addObjective(objective: ObjectiveDTO)

    @RequestMapping(method = [RequestMethod.POST], value = ["/rules/objective/modify/update"])
    fun updateObjective(objective: ObjectiveDTO)

    @RequestMapping(method = [RequestMethod.DELETE], value = ["/rules/objective/modify/delete/{id}"])
    fun removeObjectiveById(@PathVariable("id") id: MissionId)
}