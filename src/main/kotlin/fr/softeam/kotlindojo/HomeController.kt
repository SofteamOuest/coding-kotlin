package fr.softeam.kotlindojo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HomeController(val parserService: ParserService) {

    @GetMapping("/")
    fun displayData(model: Model, @RequestParam name: String?) : String {
        model.addAttribute("name", "Alex")
        var list = parserService.parse("/home/athomazo/animation_tech/coding-kotlin/kotlin-dojo/src/main/resources/liste.txt")

        if (name != null) {
           list = list.filter { it.nom.toLowerCase().contains(name.toLowerCase()) }
        }

        //permet de regrouper sous une map NomMaison -> Liste des personnes
        val groupBy = list.groupBy { it.maison }

        model.addAttribute("list", list)
        return "display"
    }

}