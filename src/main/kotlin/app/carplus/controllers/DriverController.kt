package app.carplus.controllers

import app.carplus.dtos.DriverDTO
import app.carplus.dtos.DriverView
import app.carplus.models.Driver
import app.carplus.services.impl.DriverService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drivers")
class DriverController(private val driverService: DriverService) {

    @PostMapping
    fun save(@RequestBody driverDTO: DriverDTO): ResponseEntity<DriverView> {
        val saveDriver: Driver = this.driverService.save(driverDTO.toEntity())
        return ResponseEntity.status(HttpStatus.CREATED).body(DriverView(saveDriver))
    }
}