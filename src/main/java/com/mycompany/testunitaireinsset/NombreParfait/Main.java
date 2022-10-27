/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import com.mycompany.testunitaireinsset.NombrePremier.*;
import com.mycompany.testunitaireinsset.NombreParfait.Parfait;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre :");

        String str = sc.nextLine();
                 
       Parfait e = new Parfait();
       System.out.println(e.formaterResult(e.estParfait(Long.parseLong(str)), Long.parseLong(str)));
        
    }

}
