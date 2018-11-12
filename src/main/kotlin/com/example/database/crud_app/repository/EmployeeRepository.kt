package com.example.database.crud_app.repository

import com.example.database.crud_app.Employee

import com.example.database.crud_app.repository.EmployeeRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long>