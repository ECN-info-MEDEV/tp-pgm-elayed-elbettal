/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package com.mycompany.tp.note.medev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * classe definit le tour de jeu du codeur ou il choisit la combinaison de ses pions cachés
 * @author samar
 */
public class Codeur extends Joueur {
    /**
     * liste des pions
     */
    private ArrayList<Pion> ListPion = new ArrayList<>();

    /**
     *constructeur
     */
    public Codeur() {
        super() ;
    }
     
    /**
     * methode assure au codeur de choisir la combinaison de ses pions
     */
    public void choix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Codeur : choisit 4 pions: J pour Jaune, R pour Rouge, B pour Bleu, V pour Vert");
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1  + " ");
            String str = sc.nextLine();

            Pion P = new Pion(str);
            ListPion.add(P); 
            

        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Pion> getListPion() {
        return ListPion;
    }


    
}
