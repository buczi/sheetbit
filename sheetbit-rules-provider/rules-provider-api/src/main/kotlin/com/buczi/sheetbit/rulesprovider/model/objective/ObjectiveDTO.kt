package com.buczi.sheetbit.rulesprovider.model.objective

import com.buczi.sheetbit.core.Faction
import com.buczi.sheetbit.core.Language
import com.buczi.sheetbit.rulesprovider.model.RuleType

class ObjectiveDTO(
    val id: ObjectiveId = ObjectiveId.generate(),
    val name: String,
    val subtype: String,
    val ruleType: RuleType,
    val description: String,
    val language: Language,
    val faction: Faction,
    val points: Map<String, Int>
)