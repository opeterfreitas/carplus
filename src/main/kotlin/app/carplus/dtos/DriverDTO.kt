package app.carplus.dtos

import app.carplus.models.Driver
import java.time.LocalDate

data class DriverDTO(
    val name: String,
    val birthDate: LocalDate
) {
    fun toEntity(): Driver = Driver(
        name = this.name,
        birthDate = this.birthDate
    )
}