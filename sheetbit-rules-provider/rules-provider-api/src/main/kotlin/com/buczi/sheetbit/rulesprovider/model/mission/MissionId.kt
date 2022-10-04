package com.buczi.sheetbit.rulesprovider.model.mission

import java.io.Serializable
import java.util.UUID
import javax.persistence.Embeddable

@Embeddable
class MissionId(private val uuid: UUID) : Serializable{

    constructor(uuid: String) : this( UUID.fromString(uuid)) {
    }

    companion object{
        fun generate(): MissionId{
            return MissionId(UUID.randomUUID())
        }
    }
}