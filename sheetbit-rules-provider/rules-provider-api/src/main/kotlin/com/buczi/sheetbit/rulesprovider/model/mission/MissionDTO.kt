package com.buczi.sheetbit.rulesprovider.model.mission

import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveDTO

class MissionDTO(
    val id: MissionId = MissionId.generate(),
    val name: String,
    val order: Int,
    val missionBriefing: String?,
    val missionRules: String,
    val firstPrimaryObjective: ObjectiveDTO,
    val secondPrimaryObjective: ObjectiveDTO
) {
}