package com.appstudio.controleprazo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
data class OrderNote(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var productId: Long,
        @Column(nullable = false, length = 100)
        var productName: String,
        @Column(nullable = false)
        var quantity: Int,
        @Column(nullable = false)
        var totalAmount: Float,
        @ManyToOne
        var customer: Customer
)