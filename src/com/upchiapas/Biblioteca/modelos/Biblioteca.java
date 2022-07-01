package com.upchiapas.Biblioteca.modelos;

import java.util.Scanner;

public class Biblioteca {
    static LIbro[] listaLibro = new LIbro[5];


    public static void registroLibro() {
        Scanner entrada = new Scanner(System.in);
        boolean aux = false;
        String categoria;
        int opcion = 0;
        int auxliar;

        LIbro libro1 = new LIbro(3, "Algebra", "Matematicas");
        LIbro libro2 = new LIbro(2, "Lenguas", "Ingles");
        LIbro libro3 = new LIbro(4, "Programacion", "Computacion");
        LIbro libro4 = new LIbro(5, "Codigos", "Java");
        LIbro libro5 = new LIbro(1, "Sumas", "Matematicas");

        listaLibro[0] = libro1;
        listaLibro[1] = libro2;
        listaLibro[2] = libro3;
        listaLibro[3] = libro4;
        listaLibro[4] = libro5;

        for(int i=0; i<5; i++) {
            System.out.println(listaLibro[i].getId()+" "+listaLibro[i].getNombre());
        }

        for (int i=0; i<listaLibro[i].getId(); i++){
            for (int j=0; i<listaLibro[i].getId(); j++){
                if(listaLibro[j].getId() > listaLibro[i+1].getId()){
                    auxliar = listaLibro[j].getId();
                    listaLibro[j] = listaLibro[j+1];
                    //listaLibro[j+1].getId() = auxliar;
                }
            }
        }
    }
}