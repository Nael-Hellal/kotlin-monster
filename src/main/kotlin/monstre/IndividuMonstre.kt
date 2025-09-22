package org.example.monstre

import org.example.dresseur.Entraineur
import kotlin.math.pow
import kotlin.random.Random

class IndividuMonstre (
    var id: Int,
    var nom: String,
    val espece: EspeceMonstre,
    var entraîneur: Entraineur? = null,
    expInit: Double
) {
    var niveau: Int = 1
    var attaque: Int = espece.baseAttaque + Random.nextInt(-2, 3)
    var défense: Int = espece.baseDefense + Random.nextInt(-2, 3)
    var vitesse: Int = espece.baseVitesse + Random.nextInt(-2, 3)
    var attaqueSpe: Int = espece.baseAttaqueSpe + Random.nextInt(-2, 3)
    var defenceSpe: Int = espece.baseDefense + Random.nextInt(-2, 3)
    var pvMax: Int = espece.basePv + Random.nextInt(-5, 6)
    var potentiel: Double = Random.nextDouble(0.5, 3.0)
    var exp: Double = 0.0
        get() = field
        set(exp) {
            field = exp
            var estNiveau1 = false
            if (niveau == 1){
                estNiveau1 = true
            }
            while (field >= palierExp(niveau)) {


                levelUp()
            }
            estNiveau1 == false

            println("Le monstre $nom est maintenant niveau $niveau !")

            if (estNiveau1 == true){
            }
        }
    var pv: Int = pvMax
        get() = field
        set(nouveauPv) {
            field = nouveauPv
        }

    /**
     * Calcule l'éxperience totale nécessaire pour atteindre un niveau donné.
     *
     * @param niveau Niveau cible.
     * @return Expérience cumulée nécessaire pour atteindre ce niveau.
     */
    fun palierExp(niveau: Int): Int {

        return (100 * (niveau - 1.0).pow(2)).toInt()
    }


    fun levelUp() {
        this.niveau ++
        this.attaque = (this.espece.modAttaque * this.potentiel).toInt() + Random.nextInt(-2,3)
        this.défense = (this.espece.modDefense * this.potentiel).toInt() + Random.nextInt(-2, 3)
        this.vitesse = (this.espece.modVitesse * this.potentiel).toInt() + Random.nextInt(-2, 3)
        this.attaqueSpe = (this.espece.modAttaqueSpe * this.potentiel).toInt() + Random.nextInt(-2, 3)
        this.defenceSpe = (this.espece.modDefenseSpe * this.potentiel).toInt() + Random.nextInt(-2 , 3)
        this.pvMax = (this.espece.modPv * this.potentiel).toInt() * Random.nextInt(-5, 6)
    }
    init{
        this.exp = expInit //applique le setter et déclenche un éventuel level-up
    }
}