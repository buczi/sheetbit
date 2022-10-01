package com.buczi.sheetbit.rulesprovider.model.mission

import java.util.UUID

class MissionId(private val uuid: UUID) {

    constructor(uuid: String) : this( UUID.fromString(uuid)) {
    }

    companion object{
        fun generate(): MissionId{
            return MissionId(UUID.randomUUID())
        }
    }
}