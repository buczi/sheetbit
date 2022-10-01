package com.buczi.sheetbit.rulesprovider.controller.mission

import com.buczi.sheetbit.rulesprovider.model.mission.MissionDTO
import com.buczi.sheetbit.rulesprovider.model.mission.MissionId
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotEmpty

@RestController
class MissionController {

    @Operation(summary = "Get all existing missions")
    @GetMapping(value = ["/rules/mission"])
    fun getMissions(): List<MissionDTO>{
        return listOf()
    }

    @Operation(summary = "Get missions with given ids")
    @GetMapping(value = ["/rules/mission/{ids}"])
    fun getMissionsByIds(@NotEmpty @PathVariable("ids") factions: List<MissionId>): List<MissionDTO>{
        return listOf()
    }
}