/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicados;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author mafer
 */
public class Duplicados {

   
    public static void main(String[] args) {

        String e;
        Scanner in= new Scanner(System.in); 
        System.out.println("Ingrese expresion:");
        e=in.next();
        
        if(duplicar(e) == true){
            System.out.println("True");
            System.out.println(e);
        }else{
            System.out.println("False");
            System.out.println(e);
        }
    }   
    public static boolean duplicar(String s){
        Stack<Character> pila = new Stack<>();

        char[] str = s.toCharArray();
        for (char ch : str) {

            if (ch == ')') {
                char top = pila.peek();
                pila.pop();
                int elementos = 0;

                while (top != '(') {
                    elementos++;
                    top = pila.peek();
                    pila.pop();
                }

                if (elementos < 1) {
                    return true;
                }
            } else {
                pila.push(ch);
            }
        }

        return false;
    }
    
}
