package com.mycompany.primeiroprograma;

import java.util.Scanner;

public class Primeiroprograma {

    public static void main(String[] args) {
        String name;
        int idade, dia;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        name = ler.nextLine();
        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        
        dia = idade * 365;
        System.out.printf("Voce tem %s%n dias de vida", dia);
        
        
        
        
    }
}
