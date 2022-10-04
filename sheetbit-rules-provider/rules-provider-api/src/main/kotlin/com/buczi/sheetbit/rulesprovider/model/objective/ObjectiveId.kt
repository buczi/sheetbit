package com.buczi.sheetbit.rulesprovider.model.objective

import java.io.Serializable
import java.util.UUID
import javax.persistence.Embeddable

@Embeddable
class ObjectiveId(private val uuid: UUID) : Serializable{

    constructor(uuid: String) : this(UUID.fromString(uuid)) {
    }

    companion object {
        fun generate(): ObjectiveId {
            return ObjectiveId(UUID.randomUUID())
        }
    }
}