
package it.unisa.prova;

/**
 *
 * @author raffa
 */
public class Main {
    public static void main(String args[]){
        salute("Fisciano");
        salute("world");
        salute("universe");
        salute("Fisciano");
        salute("metaverse");
    }
    
    public static void salute(String whom){
        System.out.println("Hello, "+whom);
    }
    
}
