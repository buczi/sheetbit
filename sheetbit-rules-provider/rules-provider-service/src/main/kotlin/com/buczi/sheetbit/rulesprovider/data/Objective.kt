package com.buczi.sheetbit.rulesprovider.data

import com.buczi.sheetbit.core.Faction
import com.buczi.sheetbit.core.Language
import com.buczi.sheetbit.rulesprovider.model.RuleType
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveId
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Objective(
    @EmbeddedId
    @AttributeOverrides(
        AttributeOverride(name = "uuid", column = Column(name = "objective_id"))
    )
    val objectiveId: ObjectiveId,
    @Column(name="name")
    val name: String,
    @Column(name="subtype")
    val subtype: String,
    @Column(name="rule_type")
    val ruleType: RuleType,
    @Column(name="description")
    val description: String,
    @Column(name="language")
    val language: Language,
    @Column(name="faction")
    val faction: Faction,
    @OneToMany
    val scores: List<Score>
) {
}