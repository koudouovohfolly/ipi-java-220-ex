package com.exemple;

public class Client {
    //Attribut Nom
    String nom;

    //Prenom
    String prenom;

    //Numéro
    Integer numero = 1;
    //int numero;

    void calculReduction(/*Integrer numero*/){
       if (numero < 200000){
           return 10;
       }
       return 0;
    }
}
