package org.example.jeu

import org.example.dresseur.Entraineur
import org.example.especeaquamy
import org.example.especeflamkip
import org.example.especespringleaf
import org.example.monde.Zone
import org.example.monstre.IndividuMonstre

class Partie(
    var id: Int,
    var joueur: Entraineur,
    var zone: Zone
) {
    fun choixStarter(){
        val monstre1 = IndividuMonstre(1, "springleaf", especespringleaf, org.example.joueur,1500.0)
        val monstre2 = IndividuMonstre(2, "flamkip", especeflamkip, org.example.joueur,1500.0)
        val monstre3 = IndividuMonstre(3, "aquamy", especeaquamy, null, 1500.0)

        println(monstre1.afficheDetail())
        println(monstre2.afficheDetail())
        println(monstre3.afficheDetail())
        println("choisir un starter\n" +
                "choix 1: springleaf\n" +
                "choix 2: flamkip\n" +
                "choix 3: aquamy")
        var starter: IndividuMonstre
        var choixSelection = readln().toInt()
        while(choixSelection !in 1..3 ){
            return
        }
        if(choixSelection == 1){
             starter = monstre1
        }
        else if(choixSelection == 2){
             starter = monstre2
        }
        else {
            starter = monstre3
        }
        starter.renommer()
        joueur.equipeMonstre.add(starter)
        starter.entraîneur = joueur
    }

    fun modifierOrdreEquipe(){
        if(joueur.equipeMonstre.size < 2){
            println("vous n'avez pas assez de monstre pour pouvoir modifier l'ordre de l'équipe")
        }
        else{
            println("modifier ordre de l'équipe: ")
            println("selectionner le premier monstre: ")
            var remplaçant1 = readln().toInt()
            println("selectionner le second monstre: ")
            var remplaçant2 = readln().toInt()


            var monstreremplaçant1 = joueur.equipeMonstre[remplaçant1]
            val monstreremplaçantdeplacer = joueur.equipeMonstre[remplaçant1]
            var monstreremplaçant2 = joueur.equipeMonstre[remplaçant2]

            monstreremplaçant1 = monstreremplaçant2
            monstreremplaçant2 = monstreremplaçantdeplacer
        }

        fun examineEquipe(){

        }
    }
}