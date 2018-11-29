package fr.softeam.kotlindojo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDojoApplication

fun main(args: Array<String>) {
    runApplication<KotlinDojoApplication>(*args)
}
