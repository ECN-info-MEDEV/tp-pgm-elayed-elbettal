/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.medev;
import java.util.ArrayList;

/**
 *
 * classe de définition des pions selon leurs couleurs
 */
public class Pion {
    private String Color;
    
    /**
     * pion par défaut 
     */
    public Pion() {
        this.Color = "N";
    }
    
    /**
     *définition du pion par con couleur
     * @param couleur couleur du pion
     */
    public Pion(String couleur){
        Couleur Color1=new Couleur();
        for (int i=0;i<6;i++){
            if (couleur == null ? Color1.ListCouleur.get(i) == null : couleur.equals(Color1.ListCouleur.get(i)))
        this.Color=couleur;
    }
        }

    /**
     * retourne la couleur du pion
     * @return 
     */
    public String getColor() {
        return Color;
    }

    /**
     * définit la couleur du pion
     * @param Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
        
    
}
