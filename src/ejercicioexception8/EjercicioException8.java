/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexception8;

import java.util.Scanner;

/**
 *
 * @author Piruxb17
 */
public class EjercicioException8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scr.nextLine();
        System.out.println("Ingrese un numero: ");
        int numero = scr.nextInt();
        try{
        System.out.println("la posisicion es: " + caracterEn(palabra, numero));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
public static char caracterEn(String palabra, int numero ) throws Exception {
        if (numero<palabra.length())
            return  palabra.charAt(numero);
         else
            throw new Exception("posicion incorrecta");
    // TODO code application logic here
    }
}
    

