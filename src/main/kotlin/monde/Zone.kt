package org.example.monde

import org.example.monstre.EspeceMonstre
import java.time.ZoneId

class Zone(
    var id: Int,
    var nom: String,
    val Expzone: Int,
    var especesMonstres: MutableList<String> = mutableListOf(),
    var ZoneSuivante: Zone? = null,
    var ZonePrecedente: Zone? = null
) {

//TODO : - faire la méthode genereMonstre() - faire la méthode rencontreMonstre()
}