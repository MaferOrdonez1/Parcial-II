/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindroma;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Palindroma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Palabra;
        Scanner in= new Scanner(System.in); 
        System.out.println("Ingrese palabra:");
        Palabra=in.next();
        
        if(Palindromo(Palabra) == true){
            System.out.println("La palabra es palindroma");
            System.out.println(Palabra);
        }else{
            System.out.println("La palabra no es palindroma");
            System.out.println(Palabra);
        }
    }   
    public static boolean Palindromo(String palabra){
        for(int i = 0; i < palabra.length();i++)
         {
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1))
            {
                return false;
            }
         }
        return true;
    }
        
 
}
