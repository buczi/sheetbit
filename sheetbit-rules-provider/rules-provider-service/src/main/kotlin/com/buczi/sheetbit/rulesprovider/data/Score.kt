package com.buczi.sheetbit.rulesprovider.data

import com.buczi.sheetbit.core.Language
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Score(
    @Id
    @GeneratedValue
    val score_id: UUID,
    @Column(name="description")
    val description: String,
    @Column(name="point")
    val point: Int,
    @Column(name="language")
    val language: Language
) {
}