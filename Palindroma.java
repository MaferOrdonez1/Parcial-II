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
    Scanner in = new Scanner(System.in);
    Pila PilaA = new Pila();
    Pila PilaB = new Pila();
    
   
    public static void main(String[] args) {
        Palindroma pilaEjemplo = new Palindroma();
        pilaEjemplo.menu();
    }
   
    public void menu(){
        boolean exit = false;
        int option;
       
        while(!exit){
            System.out.println("\n1. push");
            System.out.println("2. pop");
            System.out.println("3. is empty?");
            System.out.println("4. who is at the start?");
            System.out.println("5. Size stack");
            System.out.println("6. clean stack");
            System.out.println("7. exit");
            System.out.println("select option");
            option = in.nextInt();
            switch(option){
                case 1:
                   System.out.println("Cola A");
                   PilaA.push(false,"");
                   break;
                case 2:
                    System.out.println("Cola A");
                    PilaA.pop();
                case 3:
                   System.out.println("Cola 1");
                   System.out.println(" Esta vacía? " + PilaA.isEmpty());
                case 4:
                    if(!PilaA.isEmpty()){
                        System.out.println("Cola 1 Esta vacía? ");
                        System.out.println(PilaA.cima());
                    }else{
                        System.out.println("Cola 1 Esta vací?");
                    }
                   break;
                case 5:
                    System.out.println("Tamaño cola 1; " + PilaA.size());
                    break;
                case 6:
                    if(!PilaA.isEmpty()){
                        PilaA.limpiar();
                        System.out.println("Limpiando stack");
                    }else{
                        System.out.println("is Empty");
                    }
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("no se encontro");
            }
        }
       
    }
    public void introvertir(){
        int r;
        PilaB = new Pila();
        Nodo NPilaA = new Nodo();
        NPilaA = PilaA.cima;
        
        for(int i = 0; i < PilaA.size();i++){
            if(PilaA[i] == PilaB){
                
            }
        }
    }
}
