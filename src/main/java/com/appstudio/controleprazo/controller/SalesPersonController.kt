package com.appstudio.controleprazo.controller

import com.appstudio.controleprazo.dto.response.SalesPersonDTO
import com.appstudio.controleprazo.model.SalesPerson
import com.appstudio.controleprazo.service.impl.SalesPersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SalesPersonController(
        private val service: SalesPersonService,
) {

    @GetMapping("/{id}")
    fun findSalesPersonByCode(
            @PathVariable id: Long
    ): ResponseEntity<SalesPersonDTO> {
        val salesPerson = service.getSalesPersonById(id)

        return ResponseEntity.ok(
                SalesPersonDTO(salesPerson)
        )
    }

    @PostMapping
    fun createSalesPersonByCode(
            @RequestBody salesPerson: SalesPerson
    ) : ResponseEntity<Unit> = ResponseEntity.ok(service.createSalesPerson(salesPerson))

    @DeleteMapping("/{id}")
    fun deleteSalesPersonByCode(
            @PathVariable id: Long
    ) : ResponseEntity<Unit> = ResponseEntity.ok(service.deleteSalesPersonById(id))

}