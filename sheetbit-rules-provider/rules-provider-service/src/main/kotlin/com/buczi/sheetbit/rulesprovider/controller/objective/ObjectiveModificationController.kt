package com.buczi.sheetbit.rulesprovider.controller.objective

import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveDTO
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveId
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ObjectiveModificationController {

    @Operation(summary = "Add new objective to the database")
    @PostMapping(value = ["/rules/objective/modify/add"])
    fun addObjective(@RequestBody objective: ObjectiveDTO){

    }

    @Operation(summary = "Modify existing objective")
    @PostMapping(value = ["/rules/objective/modify/update"])
    fun updateObjective(@RequestBody objective: ObjectiveDTO){
    }

    @Operation(summary = "Delete existing rule")
    @DeleteMapping(value = ["/rules/objective/modify/delete/{id}"])
    fun removeObjectiveById(@PathVariable("id") objectiveId: ObjectiveId){
    }
}