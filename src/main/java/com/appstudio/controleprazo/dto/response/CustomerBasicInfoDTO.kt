package com.appstudio.controleprazo.dto.response

import com.appstudio.controleprazo.model.Customer

data class CustomerBasicInfoDTO(
        var name: String? = null,
        var id: Long? = null
){
    constructor(customer: Customer) : this() {
        name = customer.name
        id = customer.customerId
    }
}
