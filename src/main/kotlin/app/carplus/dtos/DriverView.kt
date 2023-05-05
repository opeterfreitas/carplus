package app.carplus.dtos

import app.carplus.models.Driver
import java.time.LocalDate

data class DriverView(
    var id: Long?,
    var name: String,
    var birthDate: LocalDate
) {
    constructor(driver: Driver) : this(
        id = driver.id,
        name = driver.name,
        birthDate = driver.birthDate,
    )
}