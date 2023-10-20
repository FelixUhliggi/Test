package com.example.bestudentcrm.controller.repositories.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.*

@Entity
class StudentDBModel(
        val id: Int = 0,
        val email: String = ""
) {
    @Id
    @GeneratedValue
    var myId: UUID? = null
        private set

    val date: Date = Date()


}