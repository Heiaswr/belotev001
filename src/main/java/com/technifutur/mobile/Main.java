package com.technifutur.mobile;

import com.technifutur.mobile.data.BeloteDao;
import com.technifutur.mobile.domain.Joueur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Joueur joueur = new Joueur();
        Scanner sc = new Scanner(System.in);
        int choix;

        System.out.println("1. Inscription\n2.Connexion");
        choix=sc.nextInt();


        switch (choix)
        {
            case 1:
                joueur.inscription(joueur);
                BeloteDao beloteDao = new BeloteDao();
                beloteDao.insert(joueur);
                break;
            case 2:
                joueur.identification(joueur);
                break;
            default:
                break;
        }


    }
}
