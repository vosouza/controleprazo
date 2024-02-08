package com.appstudio.controleprazo.dto.response

import com.appstudio.controleprazo.model.Customer
import com.appstudio.controleprazo.model.SalesPerson

data class SalesPersonDTO(
        var userId: Long? = null,
        var name: String? = null,
        var phoneNumber:String? = null,
        var customerList: MutableList<CustomerBasicInfoDTO> = mutableListOf()
){
    constructor(salesPerson: SalesPerson) : this() {
        userId = salesPerson.userId
        name = salesPerson.name
        phoneNumber = salesPerson.phoneNumber
        salesPerson.listOfCustomers?.forEach{
            customerList.add(
                    CustomerBasicInfoDTO(
                            it.name ?: "",
                            it.customerId ?: 0
                    )
            )
        }
    }

    constructor(salesPerson: SalesPerson, customers: List<Customer>?) : this() {
        userId = salesPerson.userId
        name = salesPerson.name
        phoneNumber = salesPerson.phoneNumber
        customers?.forEach{
            customerList.add(
                    CustomerBasicInfoDTO(
                            it.name ?: "",
                            it.customerId ?: 0
                    )
            )
        }
    }
}
