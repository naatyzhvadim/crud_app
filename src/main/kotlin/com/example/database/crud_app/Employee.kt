package com.example.database.crud_app

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Employee (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @get: NotBlank
        val first_name: String = "",

        @get: NotBlank
        val last_name: String = "",

        @get: NotBlank
        val year_of_birth: Int = 0,

        @get: NotBlank
        val year_of_hiring: Int = 0

        /*@get: NotBlank
        val title: String = "",

        @get: NotBlank
        val content: String = ""*/
)
