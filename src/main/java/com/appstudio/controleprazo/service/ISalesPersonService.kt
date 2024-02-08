package com.appstudio.controleprazo.service

import com.appstudio.controleprazo.model.Customer
import com.appstudio.controleprazo.model.SalesPerson

interface ISalesPersonService {

    fun getCustomerList(salesPersonId: Long): List<Customer>

    fun getSalesPersonById(id: Long): SalesPerson

    fun createSalesPerson(salesPerson: SalesPerson)

    fun deleteSalesPersonById(id: Long)
}