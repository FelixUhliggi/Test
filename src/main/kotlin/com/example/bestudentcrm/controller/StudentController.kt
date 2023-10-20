package com.example.bestudentcrm.controller

import com.example.bestudentcrm.controller.model.Student
import com.example.bestudentcrm.controller.repositories.StudentRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student-api")
class StudentController(val repository: StudentRepository) {

    @GetMapping("/hallo")
    fun hallo(): String {
        return "HALLO"

    }

    @PostMapping("/new/student")
    fun getPrint(@RequestBody student: Student) {
        repository.save(student)
    }


}