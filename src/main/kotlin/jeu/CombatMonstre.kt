package org.example.jeu

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
        if(monstreSauvage.pv <= 0){
            if(monstreSauvage.entraîneur == joueur){
                println("${monstreSauvage.nom} a été capturé !")
                return true
            }
            return false
        }
        println("$joueur.nom")
    }
}