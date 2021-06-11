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
import java.util.Scanner;
public class Tambah {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
    int a,b,c,tambah,jumlah;
    
        System.out.println("a: ");
        a = input.nextInt();
        System.out.println("b: ");
        b = input.nextInt();
        System.out.println("c: ");
        c = input.nextInt();
        
        tambah = a + b;
        
        if(c <= 0){
            System.out.println("PEMBAGI TIDAK BOLEH NOL!!");
        }
        
        jumlah = tambah / c;
        
        System.out.println("hasil pembagian bilangan 1 = "+ tambah +" dengan bilangan 2 = "+ c +" adalah = "+ jumlah);
    }
   
    
}
