package com.buczi.sheetbit.rulesprovider.api.objective

import com.buczi.sheetbit.core.Faction
import com.buczi.sheetbit.rulesprovider.RULES_PROVIDER_SERVICE
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveDTO
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveId
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.validation.constraints.NotEmpty

@FeignClient(RULES_PROVIDER_SERVICE)
interface ObjectiveClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/rules/objective"])
    fun getObjectives(): List<ObjectiveDTO>

    @RequestMapping(method = [RequestMethod.GET], value = ["/rules/objective/{factions}"])
    fun getFactionsObjectives(@NotEmpty @PathVariable("factions") factions: List<Faction>): List<ObjectiveDTO>

    @RequestMapping(method = [RequestMethod.GET], value = ["/rules/objective/{ids}"])
    fun getObjectivesByIds(@NotEmpty @PathVariable("ids") factions: List<ObjectiveId>): List<ObjectiveDTO>
}