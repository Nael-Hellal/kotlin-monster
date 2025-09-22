package org.example.monstre

import org.example.dresseur.Entraineur
import kotlin.math.pow
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

    /**
     * Calcule l'éxperience totale nécessaire pour atteindre un niveau donné.
     *
     * @param niveau Niveau cible.
     * @return Expérience cumulée nécessaire pour atteindre ce niveau.
     */
    fun palierExp(niveau: Int): Int{

        return 100*(niveau - 1.0).pow(2).toInt()
    }
}

    fun levelUp(){
       val caracteristiques:
}