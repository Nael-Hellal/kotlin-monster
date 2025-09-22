package org.example

import org.example.dresseur.Entraineur
import org.example.monstre.EspeceMonstre
import org.example.monde.Zone
import org.example.monstre.IndividuMonstre

var joueur = Entraineur(1, "Sacha", 100)
var especespringleaf = EspeceMonstre(id= 1, nom = "Springleaf", type = "Graine", basePv = 60, baseAttaque = 9, baseDefense = 11, baseVitesse = 10, baseAttaqueSpe = 12, baseDefenseSpe = 14, modPv = 34.0, modAttaque = 6.5, modDefense = 9.0, modVitesse = 8.0, modAttaqueSpe = 7.0, modDefenseSpe = 10.0, description = "Petit monstre espiègle rond comme une graine, adore le soleil", particularites = "sa feuille sur la tête indique son humeur.", caractères = "Curieux, amical, timide")
var especeflamkip= EspeceMonstre(id = 4, nom = "Flamkip", type = "Animal", basePv = 50, baseAttaque = 12, baseDefense = 8, baseVitesse = 13, baseAttaqueSpe = 16, baseDefenseSpe = 7, modPv = 22.0, modAttaque = 10.0, modDefense = 5.5, modVitesse = 9.5, modAttaqueSpe = 9.5, modDefenseSpe = 6.5, description = "Petit animal entouré de flammes, déteste le froid.", particularites = "Sa flamme change d'intensité selon son énergie.", caractères = "Impulsif, joueur, loyal")
var especeaquamy= EspeceMonstre(id = 7, nom = "Aquamy", type = "Meteo", basePv = 55, baseAttaque = 11, baseDefense = 10, baseVitesse = 9, baseAttaqueSpe = 8, baseDefenseSpe = 11, modPv = 27.0, modAttaque = 9.0, modDefense = 10.0, modVitesse = 7.5, modAttaqueSpe = 12.0, modDefenseSpe = 12.0, description = "Créature vaporeuse semblable à un nuage, produitdes gouttes pures.", particularites = "Fait baisser la température en s'endormant.", caractères = "Calme, rêveur, mystérieux")
var especelaoumi= EspeceMonstre(id = 8, nom= "Laoumi", type = "Animal", basePv = 58, baseAttaque = 11, baseDefense = 10, baseVitesse = 9, baseAttaqueSpe = 8, baseDefenseSpe = 11, modPv = 21.0, modAttaque = 11.0, modDefense = 8.0, modVitesse = 7.0, modAttaqueSpe = 6.0, modDefenseSpe = 11.5, description = "Petit ourson au pelage soyeux, aime se tenir debout", particularites = "Son grognement est mignon mais il protège ses amis.", caractères = "Affectueux,  protecteur, gourmand")
var especebugsyface= EspeceMonstre(id = 10, nom= "Bugsyface", type="Insecte", basePv = 45, baseAttaque = 10, baseDefense = 13, baseVitesse = 8, baseAttaqueSpe = 7, baseDefenseSpe = 13, modPv = 21.0, modAttaque = 7.0, modDefense = 11.0, modVitesse = 6.5, modAttaqueSpe = 8.0, modDefenseSpe = 11.5, description = "Insecte à carapace luisante, se déplace par bonds et vibre des antennes", particularites = "Sa carapace devient plus dure après chaque mue.", caractères = "Travailleur, sociable, infatigable")
var especegalum= EspeceMonstre(id = 13, nom = "Galum", type = "Minéral", basePv = 55, baseAttaque = 12, baseDefense = 15, baseVitesse = 6, baseAttaqueSpe = 8, baseDefenseSpe = 12, modPv = 13.0, modAttaque = 9.0, modDefense = 13.0, modVitesse = 4.0, modAttaqueSpe = 6.5, modDefenseSpe = 10.5, description = "Golem ancien de pierre, yeux lumineux en garde.", particularites = "Peut rester immobile des heures comme une statue.", caractères = "Sérieux, stoïque, fiable")
var prairie= Zone(id = 1, nom = "Prairie", Expzone = 0, especesMonstres = mutableListOf("Springleaf"))
var montagne= Zone(id= 2, nom = "Montagne", Expzone= 0)
val monstre1 = IndividuMonstre(1, "springleaf", 1500.0, especeSpringLeaf)
val monstre2 = IndividuMonstre(2, "flamkip", 1500.0, especeFlamkip)
val monstre3 = IndividuMonstre(3, "aquamy", 1500.0, especeAquamy)



fun main() {
//    println(especegalum.afficheArt())
//    println(especegalum.afficheArt(deFace = false))
    prairie.ZoneSuivante = montagne
    montagne.ZonePrecedente = prairie
}
//    println(changeCouleur("Hello","rouge"))
//    println(changeCouleur("World","bleu"))
//    println("Hello ${changeCouleur("my","jaune")} World")
//    println(changeCouleur("Truc","marron"))
//
//}
/**
 * Change la couleur du message donné selon le nom de la couleur spécifié.
 * Cette fonction utilise les codes d'échappement ANSI pour appliquer une couleur à la sortie console. Si un nom de couleur
 * non reconnu ou une chaîne vide est fourni, aucune couleur n'est appliquée.
 *
 * @param message Le message auquel la couleur sera appliquée.
 * @param couleur Le nom de la couleur à appliquer (ex: "rouge", "vert", "bleu"). Par défaut c'est une chaîne vide, ce qui n'applique aucune couleur.
 * @return Le message coloré sous forme de chaîne, ou le même message si aucune couleur n'est appliquée.
 */
fun changeCouleur(message: String, couleur:String=""): String {
    val reset = "\u001B[0m"
    val codeCouleur = when (couleur.lowercase()) {
        "rouge" -> "\u001B[31m"
        "vert" -> "\u001B[32m"
        "jaune" -> "\u001B[33m"
        "bleu" -> "\u001B[34m"
        "magenta" -> "\u001B[35m"
        "cyan" -> "\u001B[36m"
        "blanc" -> "\u001B[37m"
        "marron" -> "\u001B[33m"
        else -> "" // pas de couleur si non reconnu
    }
    return "$codeCouleur$message$reset"
}