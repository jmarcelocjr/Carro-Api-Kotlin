package br.com.mcerqueira.carroapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarroapiApplication

fun main(args: Array<String>) {
    runApplication<CarroapiApplication>(*args)
}
