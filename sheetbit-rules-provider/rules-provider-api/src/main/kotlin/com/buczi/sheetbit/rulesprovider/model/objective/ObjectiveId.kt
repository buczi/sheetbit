package com.buczi.sheetbit.rulesprovider.model.objective

import java.util.UUID

class ObjectiveId(private val uuid: UUID) {

    constructor(uuid: String) : this( UUID.fromString(uuid)) {
    }

    companion object{
        fun generate(): ObjectiveId {
            return ObjectiveId(UUID.randomUUID())
        }
    }
}