
package program;

import entidades.Product;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Program {
    
    public static void main(String[] args){
    
        Scanner read = new Scanner (System.in);
        Locale.setDefault( Locale.US);
        
        
        Set<Product> list = new TreeSet<>();
        
        list.add(new Product("lousa",54.20));
        list.add(new Product("cadeira",78.4));
        list.add(new Product("estante",23.5));
        list.add(new Product("giz",67.76));
        list.add(new Product("armario",56.89));
        
        Product prod = new Product("armario", 56.76);
       
        
        
        
        for(Product obg : list){
        
            System.out.println(obg.toString());
        }
        String nome = read.nextLine();
        System.out.println(list.contains(prod));
    }
}
