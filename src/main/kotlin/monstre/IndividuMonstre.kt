package org.example.monstre

import org.example.dresseur.Entraineur
import kotlin.random.Random

class IndividuMonstre (
    var id: Int,
    var nom: String,
    val espece: EspeceMonstre,
    var entraîneur: Entraineur? = null,
    val expInit: Double
) {
    var niveau: Int = 1
    var attaque: Int = espece.baseAttaque + Random.nextInt(-2, 3)
    var défense: Int = espece.baseDefense + Random.nextInt(-2, 3)
    var vitesse: Int = espece.baseVitesse + Random.nextInt(-2,3)
    var attaqueSpe: Int = espece.baseAttaqueSpe + Random.nextInt(-2,3)
    var defenceSpe: Int = espece.baseDefense + Random.nextInt(-2,3)
    var pvMax: Int = espece.basePv + Random.nextInt(-5,6)
    var potentiel: Double = Random.nextDouble(0.5,3.0)
    var exp: Double = 0.0
    var pv: Int = pvMax
        get()= field
        set(nouveauPv) {
            field=nouveauPv
        }
}