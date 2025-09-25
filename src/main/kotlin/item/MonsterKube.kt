package org.example.item

import org.example.joueur
import org.example.monstre.IndividuMonstre

class MonsterKube(
    id: Int,
    nom: String,
    description: String,
    var chanceCapture: Double,
): Item(id, nom, description), Utilisable {
    override fun utiliser(cible: IndividuMonstre): Boolean {
        println("Vous lancez le Monster Kube !")
       if (cible.entraîneur != null){
           println("Le monstre ne peut pas être capturé")
           return false
       }
        val nbAleatoire = (0..100).random()
        if(!(nbAleatoire < chanceCapture)){
            println("Presque ! Le KUbe n'a pas pu capturer le monstre!")
            return false
        }
        if(nbAleatoire < chanceCapture){
            println("Le monstre est capturé")
            cible.renommer()
        }


        if(joueur.equipeMonstre.size >= 6){
            joueur.boiteMonstre.add(cible)
        }
        if(joueur.equipeMonstre.size <= 6){
            joueur.equipeMonstre.add(cible)
        }
        cible.entraîneur = joueur
        return true
    }
}