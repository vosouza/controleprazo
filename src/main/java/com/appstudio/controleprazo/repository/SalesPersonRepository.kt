package com.appstudio.controleprazo.repository

import com.appstudio.controleprazo.model.SalesPerson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SalesPersonRepository : JpaRepository<SalesPerson, Long>{
}