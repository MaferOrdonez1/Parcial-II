/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_sintáctico;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author mafer
 */
public class Analisis_sintáctico {

    Scanner in = new Scanner(System.in);
    Pila pila = new Pila();
   
    public static void main(String[] args) {
        String cadena1 = "(()";
        String cadena2 = "(())";
       
        System.out.println(verificaParentesis(cadena1)+ cadena1);
        System.out.println(verificaParentesis(cadena2) + cadena2);
        
    }

    public static String verificaParentesis(String cadena) {
        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i < cadena.length()) {
            if (cadena.charAt(i) == '(') {
                pila.push("(");
            } else if (cadena.charAt(i) == ')') {
                if (!pila.empty()) {
                    pila.pop();
                } else {
                    pila.push(")");
                    break;
                }
            }
            i++;
        }
        if (pila.empty()) {
            return "Correcto";
        } else {
            return "Incorrecto";

        }
    }
}