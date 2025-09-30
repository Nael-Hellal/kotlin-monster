package org.example.jeu

import org.example.item.Utilisable
import org.example.joueur
import org.example.monstre.IndividuMonstre

class CombatMonstre(
    var monstreJoueur: IndividuMonstre,
    var monstreSauvage: IndividuMonstre,
    var round: Int = 1
) {


    fun gameOver(): Boolean {
        /**
         * Vérifie si le joueur a perdu le combat.
         *
         * Condition de défaite :
         * -Aucun monstre de l'équipe du jueur n'a de PV > 0.
         *
         * @return `true`si le joueur a perdu, sinon `false`.
         */

        for (monstre in joueur.equipeMonstre) {
            if (monstre.pv > 0) {
                return true
            }
        }
        return false
    }

    fun joueurGagne(): Boolean {
        if (monstreSauvage.pv <= 0) {
            if (monstreSauvage.entraîneur == joueur) {
                println("${monstreSauvage.nom} a été capturé !")
                return true
            }
            return false
        }
        println("${joueur.nom} à gagné !")
        var gainExp = monstreSauvage.exp * 0.20
        monstreJoueur.exp + gainExp
        println("${monstreJoueur.nom} gagne ${gainExp} exp")
        return true
    }

    fun actionAdversaire() {
        if (monstreSauvage.pv > 0) monstreSauvage.attaquer(monstreJoueur)
    }

    fun actionJoueur(): Boolean {
        if (gameOver() != true) {
            println(
                "menu d'action:\n" +
                        "1: attaquer monstre sauvage \n " +
                        "2: utiliser un item\n" +
                        "3: changer le monstre en attaque contre un autre de l'équipe"
            )
            var choix = readln().toInt()
            while (choix in (1..3)) {
                if (choix == 1) {
                    monstreJoueur.attaquer(monstreSauvage)
                }
                if (choix == 2) {
                    println("${joueur.sacAItems}")
                    var indexChoix = readln().toInt()
                    var objetChoisi = joueur.sacAItems[indexChoix]
                    if (objetChoisi is Utilisable) {
                        var captureRéussie = objetChoisi.utiliser(monstreSauvage)
                        if (captureRéussie == true) {
                            return false
                        }
                        if (captureRéussie == false) {
                        }
                    }
                    if (objetChoisi is Utilisable == false) {
                        println("Objet non utilisable")
                    }
                }
                if (choix == 3) {
                    println("${joueur.equipeMonstre} (${monstreJoueur.pv > 0}")
                    var indexChoix = readln().toInt()
                    var choixMonstre = joueur.equipeMonstre[indexChoix]
                    if (choixMonstre.pv <= 0) {
                        println("Impossible ! Ce monstre est KO")
                    }
                    if (choixMonstre.pv > 0) {
                        println("${choixMonstre} remplace ${monstreJoueur}")
                        monstreJoueur = choixMonstre
                    }
                }
            }
            return true
        }
        if (gameOver()) {
            return false
        }
        return true
    }
}

