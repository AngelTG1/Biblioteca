package com.upchiapas.Biblioteca.modelos;

import java.util.Scanner;

public class Biblioteca {
    static LIbro[] listaLibro = new LIbro[5];


    public static void registroLibro() {


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
        String libro;
        System.out.println("-----------------------------------------");
        for(int i=0; i<5; i++) {
         //   System.out.println("Id: "+listaLibro[i].getId()+" Nombre: "+listaLibro[i].getNombre()+ " Categoria: "+listaLibro[i].getCategoria());
           libro="Id: "+listaLibro[i].getId()+" Nombre: "+listaLibro[i].getNombre()+ " Categoria: "+listaLibro[i].getCategoria();
        }
    }

    public static void ordenarLibro(){
        LIbro auxiliar;
        for(int i =0; i<listaLibro.length; i++){
            for(int j=0; j< listaLibro.length-1; j++){
                if(listaLibro[j].getId() > listaLibro[j+1].getId()){
                    auxiliar = listaLibro[j];
                    listaLibro[j] =listaLibro[j+1];
                    listaLibro[j+1] = auxiliar;
                }
            }
        }



        for (int i=0; i< listaLibro.length; i++){
           // System.out.println(listaLibro[i].getNombre());
        }
    }

    public static void consultaGeneral(){
        System.out.println("-------------------------");
        System.out.println("Biblioteca ordenada +- Mayor a Menor");
        for(int i=(listaLibro.length-1); i>-1; i--){
            System.out.println(" ID: "+listaLibro[i].getId()+" Titulo: "+listaLibro[i].getNombre());
        }
    }

    public static void buscarCategoria(int id){
        for(int i=0; i<listaLibro.length; i++){
            if(listaLibro[i].getId()==id){
                System.out.println("/////////////////////////////////");
                System.out.println("Nombre: "+listaLibro[i].getNombre());
                System.out.println("Categoria: "+listaLibro[i].getCategoria());
                System.out.println("/////////////////////////////////");
            }
        }
    }

    public static void buscarCategoriaL(String categoria){
        for(int i=0; i<listaLibro.length; i++){
            if(categoria.equals(listaLibro[i].getCategoria())){
                System.out.println("Categoria encontrada:");
                System.out.println("Id: "+listaLibro[i].getId()+" Nombre: "+listaLibro[i].getNombre());
            }
        }
    }

    public static void visualizarMenu(){
        Scanner entrada = new Scanner(System.in);
        int op;
        do{
            System.out.println("=========================");
            System.out.println("1. Consulta general");
            System.out.println("2. buscar LIbros");
            System.out.println("3. salir");
            System.out.println("=========================");
            System.out.print("Selecciones una opcion: ");
            op = entrada.nextInt();
            switch (op){
                case 1:
                    registroLibro();
                    ordenarLibro();
                    consultaGeneral();
                    break;
                case 2:
                    registroLibro();
                    ordenarLibro();
                    System.out.println("ingresa Categoria: ");
                    String op1;
                    op1=entrada.next();
                    buscarCategoriaL(op1);
                    break;
                case 3:

                    break;
            }
        }while(op !=3);

    }
}