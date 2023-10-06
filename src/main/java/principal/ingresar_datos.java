package principal;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;
import static java.util.Arrays.setAll;

import javax.swing.*;
 // Funciones y clases
public class ingresar_datos {



    public static void main(String[] args) {
        System.out.println(" Por favor seleccione una de las opciones \n1.Mostar invetario de productos" +
                "\n2.Buscar productos por letra\n3.Ordenar inventario alfabeticamente\n4.Verificar existencias" +
                "\n5.Comparar precios");


        Scanner impresion = new Scanner(System.in);

        String[] product = new String[10];
        int[] cantidad = new int[10];
        float[] price = new float[10];

        //producto
        product[0] = "Arroz    ";
        product[1] = "Papa     ";
        product[2] = "Leche    ";
        product[3] = "yogurt   ";
        product[4] = "Zucaritas";
        product[5] = "Chocolate";
        product[6] = "Verdura  ";
        product[7] = "Kumis    ";
        product[8] = "Arandanos";
        product[9] = "Cococete ";

        //Unidades
        cantidad[0] = 5;
        cantidad[1] = 2;
        cantidad[2] = 6;
        cantidad[3] = 7;
        cantidad[4] = 9;
        cantidad[5] = 5;
        cantidad[6] = 2;
        cantidad[7] = 0;
        cantidad[8] = 7;
        cantidad[9] = 9;


        //precio
        price[0] = 1500f;
        price[1] = 2500f;
        price[2] = 3500f;
        price[3] = 1500f;
        price[4] = 4500f;
        price[5] = 1100f;
        price[6] = 1300f;
        price[7] = 1500f;
        price[8] = 1700f;
        price[9] = 1800f;

        int seleccion = impresion.nextInt();

        switch (seleccion) {
            case 1:
            imprimirProducto(product, cantidad, price);
            break;
            case 2:
            buscarProducto(product);
            break;
            case 3:
            organizarProductoAlfabeticamente(product);
            break;
            case 4:
            buscarunidades(product, cantidad);
            break;
            case 5:
            compararPrecios(product, price);
            break;
        }
    }



    public static void imprimirProducto(String[] product, int[] cantidad, float[] price) {
        System.out.println( "Producto     Unidades  Precio ");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i] + "    |  " + cantidad[i] + "  |   " + price[i]);


        }

    }

    public static String buscarProducto(String[] product) {
        Scanner imprimir = new Scanner(System.in);
        System.out.println(" Por favor ingrese la letra a buscar");
        String letraproducto = imprimir.next();
        for (int m = 0; m < product.length; m++) {

            if (product[m].startsWith(letraproducto)) {
                System.out.println("Productos encontrados");
                System.out.println(product[m]);

                return product[m];
            }


        }
        return product[0];
    }


    public static String organizarProductoAlfabeticamente(String[] product) {
        Arrays.sort(product);
        StringBuilder resultado = new StringBuilder("Productos ordenados alfabéticamente:\n ");

        for (String Ordenado : product) {
            System.out.print( Ordenado+"\n ");


        }
        return resultado.toString();
    }

    public static String buscarunidades(String[] product, int[]cantida) {
        Scanner imprimir = new Scanner(System.in);
        System.out.println(" Por favor ingrese el nombre del producto al verificar ");
        String letraproducto = imprimir.next();
        for (int m = 0; m < product.length; m++) {

            if (product[m].equals(letraproducto)) {
                System.out.println("Productos encontrados");
                System.out.println(product[m] );
                 if(cantida[m]>1)
                 {
                     System.out.println("Actualmente existen"+cantida[m]+"existente");
                 }
                 else{
                     System.out.println("No cuenta con unidades");
                 }

                return product[m];
            }


        }
        return product[0];
    }

    public static String compararPrecios(String[] product,float[] price) {
        Scanner imprimir = new Scanner(System.in);
        System.out.println(" Por favor ingrese el nombre del producto al verificar ");
        String letraproducto = imprimir.next();
        System.out.println("Ingrese el precio para comparar");
        int precio =imprimir.nextInt();
        for (int m = 0; m < product.length; m++) {

            if (product[m].equals(letraproducto)) {
                System.out.println("Productos encontrados");
                System.out.println(product[m] + " el precio actual es "+price[m]);
                if(precio>price[m])
                {
                    System.out.println("El precio ingresado es superior");
                }
                else{
                    System.out.println("El precio ingresado es menor");
                }

                return product[m];
            }


        }
        return product[0];
    }

}


































