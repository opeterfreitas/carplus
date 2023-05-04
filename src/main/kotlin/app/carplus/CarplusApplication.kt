package app.carplus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarplusApplication

fun main(args: Array<String>) {
	runApplication<CarplusApplication>(*args)
}
