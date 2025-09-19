package org.example.monstre

import java.io.File

/**
 * Décrit les caractéristiques de base d’un type de monstre (comme un « modèle » ou une espèce).
 *  Contient ses statistiques de base, ses multiplicateurs de croissance, son nom, son type et éventuellement son art ASCII.
 *
 */
class EspeceMonstre (
    var id: Int, //la variable id est l'identifiant unique de l'espèce de monstre
    var nom: String, //la variable nom est le nom de l'espèce du monstre
    var type: String,  //
    val baseAttaque: Int, // la valeur baseAttaque represente les point de degat de base de l'espèce du monstre
    val baseDefense: Int, // la valeur baseDefense represente les point de defense de base de l'espèce du monstre
    val baseVitesse: Int, // la valeur baseVitesse represente la vitesse basique de l'espèce du monstre
    val baseAttaqueSpe: Int, //la valeur baseAttaqueSpe represente les point de degat special de base de l'espèce du monstre
    val baseDefenseSpe: Int, // la valeur baseDefenseSpe represente les point de defense spécial de base de l'espèce du monstre
    val basePv: Int, // la valeur basePv represente les points de vie de base de l'espèce du monstre
    val modAttaque: Double, // la valeur modAttaque represente le modificateur de croissance de la statistique d'attaque par chaque monter de niveau
    val modDefense: Double, // la valeur modDefence represente le modificateur de croissance de la statistique de defense par chaque monter de niveau
    val modVitesse: Double, // la valeur modVitesse represente le modificateur de croissance de la statistique de vitesse par chaque monter de niveau
    val modAttaqueSpe: Double, // la valeur modAttaqueSpe represente le modificateur de croissance de la statistique d'attaque spécial par chaque monter de niveau
    val modDefenseSpe: Double, // la valeur modDefenseSpe represente le modificateur de croissance de la statistique de defense spécial par chaque monter de niveau
    val modPv: Double, // la valeur modPv represente le modificateur de croissance de la statistique de pv par chaque monter de niveau
    val description: String = "", // la valeur description represente la description de l'espèce du monstre
    val particularites: String = "", // la valeur de particularites represente la particularites de l'espèce du monstre
    val caractères: String = "", // la valeur caractères represente le caractères/caractéristique du monstre/de l'espèce du monstre
    ){
    /**
     * Affiche la représentatin artistique ASCII du monstre.
     *
     * @param deFace Détermine si l'art affiché est de face (true) ou de dos (false).
     *              La valeur par défaut est true.
     *@return Une chaine de caractères contenant L'art ASCII du monstre avec les codes couleur ANSI.
     *              L'art est Lu à partir d'un fichier texte dans le dossier resources/art.
     */

    fun afficheArt(deFace: Boolean=true): String{
        val nomFichier = if(deFace) "front" else "back";
        val art=
            File("src/main/resources/art/${this.nom.lowercase()}/$nomFichier.txt").readText()
            val safeArt = art.replace("/","/")
            return safeArt.replace("\\u001B", "\u001B")
    }
}