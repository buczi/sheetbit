package com.buczi.sheetbit.core.rules

import com.buczi.sheetbit.core.Faction
import com.buczi.sheetbit.core.Language

class RuleDTO(
    val name: String,
    val subtype: String,
    val ruleType: RuleType,
    val description: String,
    val language: Language,
    val faction: Faction,
    val points: Map<String,Int>
)