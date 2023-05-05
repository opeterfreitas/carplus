package app.carplus.services.impl

import app.carplus.models.Driver
import app.carplus.repositories.DriverRepository
import app.carplus.services.IDriverService
import org.springframework.stereotype.Service

@Service
class DriverService(private val driverRepository: DriverRepository) : IDriverService {

    override fun save(driver: Driver): Driver = this.driverRepository.save(driver)

}
