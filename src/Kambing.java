/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 *Nama  : Divi Adiffia Freza Alana
 *Kelas : PBO2
 *Nim   : 10118084
 *Deskripsi Program : Program ini berisi program untuk menampilkan Jumlah Kambing setelah ditambah 5

 */
public class Kambing {

    /**
     */
    public void tambahKambing(){
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       Kambing kambingJantan = new Kambing();
       kambingJantan.tambahKambing();
        
        // TODO code application logic here
    }
    
}