package app.carplus.services

import app.carplus.dtos.DriverDTO
import app.carplus.models.Driver

interface IDriverService {
    fun save(driver: Driver): Driver
}