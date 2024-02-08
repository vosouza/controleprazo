package com.appstudio.controleprazo.repository

import com.appstudio.controleprazo.model.Customer
import com.appstudio.controleprazo.model.SalesPerson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {}