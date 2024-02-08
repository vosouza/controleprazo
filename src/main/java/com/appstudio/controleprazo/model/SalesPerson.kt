package com.appstudio.controleprazo.model

import jakarta.persistence.*

@Entity
data class SalesPerson(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var userId: Long? = null,
        @Column(nullable = false, length = 100)
        var name: String? = null,
        @Column(nullable = true, length = 13)
        var phoneNumber:String? = null,
        @Column(nullable = true)
        @OneToMany(fetch = FetchType.LAZY,
                cascade = [CascadeType.REMOVE, CascadeType.PERSIST],
                mappedBy = "salesPerson")
        var listOfCustomers: List<Customer>? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SalesPerson

        if (userId != other.userId) return false
        if (name != other.name) return false
        if (phoneNumber != other.phoneNumber) return false
        if (listOfCustomers != other.listOfCustomers) return false

        return true
    }

    override fun toString(): String {
        return "User(userId=$userId, name='$name', phoneNumber=$phoneNumber, listOfClients=$listOfCustomers)"
    }

}
