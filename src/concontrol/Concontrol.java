/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concontrol;

/**
 *
 * @author sguardatb
 */
public class Concontrol {

    public static int fact(int n){
        int f = 1;
        for (int i= 2; i < n; i++)
            f= f*i;
        return f;
    }
    
    public static int suma(int n1, int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("\nFact (3)= " + fact(3) + "\n");
    }
    
}
