package com.example.bestudentcrm.controller.model

import com.example.bestudentcrm.controller.repositories.model.StudentDBModel

class Student(var id: Int = 0,
              var email: String = "") {

    //var firstName: String = ""
    //var lastName: String = ""
    // TODO var courses = arrayOf(Course)


    fun Student.convertToDBModel() = StudentDBModel(
            id = this.id,
            email = this.email
    )
}