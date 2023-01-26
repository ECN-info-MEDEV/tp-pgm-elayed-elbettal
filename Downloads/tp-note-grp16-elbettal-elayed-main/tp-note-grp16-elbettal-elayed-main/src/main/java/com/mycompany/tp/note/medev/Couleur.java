/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.medev;

import java.util.ArrayList;

/**
 * définit la liste des couleurs possible des pions
 * 
 */
public class Couleur {
    ArrayList <String> ListCouleur=new ArrayList<>();

    /**
     * ajout des couleurs disponibles a la liste de couleur
     */
    public Couleur(){
        ListCouleur.add("J");
        ListCouleur.add("R");
        ListCouleur.add("B");
        ListCouleur.add("V");
        ListCouleur.add("B");
        ListCouleur.add("N");
}
    
}
