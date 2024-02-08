package com.appstudio.controleprazo.service.impl

import com.appstudio.controleprazo.model.Customer
import com.appstudio.controleprazo.model.SalesPerson
import com.appstudio.controleprazo.repository.CustomerRepository
import com.appstudio.controleprazo.repository.SalesPersonRepository
import com.appstudio.controleprazo.service.ISalesPersonService
import org.springframework.stereotype.Service

@Service
class SalesPersonService(
        private var salesPersonRepository: SalesPersonRepository,
) : ISalesPersonService {

    override fun getCustomerList(salesPersonId: Long): List<Customer>  = salesPersonRepository
            .findById(salesPersonId).get().listOfCustomers ?: listOf()

    override fun getSalesPersonById(id: Long): SalesPerson = salesPersonRepository.findById(id).get()

    override fun createSalesPerson(salesPerson: SalesPerson) {
        salesPersonRepository.save(salesPerson)
    }

    override fun deleteSalesPersonById(id: Long) {
        salesPersonRepository.deleteById(id)
    }
}