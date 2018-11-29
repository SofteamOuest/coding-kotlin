package fr.softeam.kotlindojo

import org.springframework.stereotype.Service
import java.io.File

/**
 *
 */
@Service
class ParserService {

    fun parse(path : String) : List<Person> = File(path).readLines().map { line ->
        val p = line.split('|')
        Person(p[0].toLong(), p[1], p[2], p[3])
    }
}