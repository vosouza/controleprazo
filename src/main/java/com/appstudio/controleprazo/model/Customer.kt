package com.appstudio.controleprazo.model

import jakarta.persistence.*
import java.util.Date

@Entity
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var customerId: Long? = null,
        @Column(nullable = false, length = 100)
        var name: String? = null,
        @Column(nullable = true, length = 13)
        var phoneNumber: String? = null,
        @Column(nullable = false, length = 13)
        var address: String? = null,
        @Column(nullable = true)
        var dateOfBirth: Date? = null,
        @Column(nullable = true)
        @OneToMany(fetch = FetchType.LAZY,
                cascade = [CascadeType.REMOVE, CascadeType.PERSIST],
                mappedBy = "customer")
        var listOfOrders: List<OrderNote>? = null,
        @OneToOne
        var salesPerson: SalesPerson? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Customer

        if (customerId != other.customerId) return false
        if (name != other.name) return false
        if (phoneNumber != other.phoneNumber) return false
        if (address != other.address) return false
        if (dateOfBirth != other.dateOfBirth) return false
        if (listOfOrders != other.listOfOrders) return false

        return true
    }

    override fun toString(): String {
        return "Client(clientId=$customerId, name='$name', phoneNumber=$phoneNumber, address='$address', dateOfBirth=$dateOfBirth, listOfOrders=$listOfOrders)"
    }
}
