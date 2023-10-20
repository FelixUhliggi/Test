package com.example.bestudentcrm.controller.repositories

import com.example.bestudentcrm.controller.model.Student
import org.springframework.data.repository.CrudRepository
import java.util.*

interface StudentRepository : CrudRepository<Student, UUID> {

}