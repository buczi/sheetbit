package com.buczi.sheetbit.rulesprovider.controller.mission

import com.buczi.sheetbit.rulesprovider.model.mission.MissionDTO
import com.buczi.sheetbit.rulesprovider.model.mission.MissionId
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MissionModificationController {

    @Operation(summary = "Add new mission to the database")
    @PostMapping(value = ["/rules/mission/modify/add"])
    fun addObjective(@RequestBody mission: MissionDTO){

    }

    @Operation(summary = "Modify existing mission")
    @PostMapping(value = ["/rules/mission/modify/update"])
    fun updateMission(@RequestBody mission: MissionDTO){
    }

    @Operation(summary = "Add new image to mission")
    @PostMapping(value = ["/rules/mission/modify/image/{id}"])
    fun addImage(@PathVariable("id") missionId: MissionId, image: String){
    }

    @Operation(summary = "Delete mission rule")
    @DeleteMapping(value = ["/rules/mission/modify/delete/{id}"])
    fun removeMissionById(@PathVariable("id") missionId: MissionId){
    }
}