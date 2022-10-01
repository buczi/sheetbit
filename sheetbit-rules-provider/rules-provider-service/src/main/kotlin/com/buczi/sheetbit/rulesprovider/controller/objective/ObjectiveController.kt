package com.buczi.sheetbit.rulesprovider.controller.objective

import com.buczi.sheetbit.core.Faction
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveDTO
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveId
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotEmpty

@RestController
class ObjectiveController {

    @Operation(summary = "Get all existing objectives")
    @GetMapping(value = ["/rules/objective"])
    fun getObjectives(): List<ObjectiveDTO>{
        return listOf()
    }

    @Operation(summary = "Get objectives for specified factions")
    @GetMapping(value = ["/rules/objective/{factions}"])
    fun getFactionsObjectives(@NotEmpty @PathVariable("factions") factions: List<Faction>): List<ObjectiveDTO>{
        return listOf()
    }

    @Operation(summary = "Get objectives with given ids")
    @GetMapping(value = ["/rules/objective/{ids}"])
    fun getObjectivesByIds(@NotEmpty @PathVariable("ids") factions: List<ObjectiveId>): List<ObjectiveDTO>{
        return listOf()
    }
}