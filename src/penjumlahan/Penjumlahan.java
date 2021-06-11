/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahan;

/**
 *
 * @author DELL
 */
import java.util.*;
public class Penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,tambah,kurang,kali,bagi;
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        tambah = a + b;
        kurang = a - b;
        kali = a * b;
        bagi = a / b;
         System.out.print("Nilai penjumlahan : "+ tambah + "\n" + "Nilai pengurangan :"+ kurang + "\n" + "Nilai perkalian :"+ kali + "\n" + "Nilai pembagian :"+ bagi + "\n");
        
    }
    
}
