package com.buczi.sheetbit.rulesprovider.repository

import com.buczi.sheetbit.rulesprovider.data.Objective
import com.buczi.sheetbit.rulesprovider.model.objective.ObjectiveId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ObjectiveRepository : JpaRepository<Objective,ObjectiveId> {
}