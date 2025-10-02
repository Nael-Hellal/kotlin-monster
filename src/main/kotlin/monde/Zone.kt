package org.example.monde

import org.example.jeu.CombatMonstre
import org.example.joueur
import org.example.monstre.EspeceMonstre
import org.example.monstre.IndividuMonstre
import java.time.ZoneId
import kotlin.random.Random

class Zone(
    var id: Int,
    var nom: String,
    val Expzone: Int,
    var especesMonstres: MutableList<EspeceMonstre> = mutableListOf(),
    var ZoneSuivante: Zone? = null,
    var ZonePrecedente: Zone? = null
) {

//TODO : - faire la méthode genereMonstre() - faire la méthode rencontreMonstre()

    /**
     * la fonction genereMonstre permet de générer un monstre aléatoire dans la zone
     *
     * @property especeAlea vas recuperer aléatoirement un monstre de la liste especesMonstres
     * @property monstre permet de générer les caracteristique du monstre
     */
    fun genereMonstre(){
        val especeAlea=this.especesMonstres.random()
        var monstre = IndividuMonstre(1, "${this.nom}", especeAlea, null, 0.0)
        monstre.exp = Expzone.toDouble() + Random.nextInt(-20, 21)
        return
    }

    fun rencontreMonstre(){
        genereMonstre()
        var monstreSauvage = especesMonstres
        var premierMonstre = joueur.equipeMonstre.forEach { it.pv > 0 }
        val combat = CombatMonstre(premierMonstre, monstreSauvage)
    }

}