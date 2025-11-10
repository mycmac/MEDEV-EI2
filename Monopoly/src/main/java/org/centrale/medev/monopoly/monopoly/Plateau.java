/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.monopoly.monopoly;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author selli
 */
public class Plateau {
    
    private ArrayList<Case> plateau;
    private LinkedList<Joueur> joueurs;
    
    public Plateau(){ 
    }
    
    /**
     * 
     * @return 
     */
    public int lancerDé(){
        Random randInt = new Random();
        int dé1 = randInt.nextInt(6)+1;
        int dé2 = randInt.nextInt(6)+1;
        int t = dé1+dé2;
        
        return t;
    }
    
    public void supprimerJoueur(Joueur j){
        joueurs.remove(j);
    }

    public ArrayList<Case> getPlateau() {
        return plateau;
    }

    public void setPlateau(ArrayList<Case> plateau) {
        this.plateau = plateau;
    }

    public LinkedList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(LinkedList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    
    
}
