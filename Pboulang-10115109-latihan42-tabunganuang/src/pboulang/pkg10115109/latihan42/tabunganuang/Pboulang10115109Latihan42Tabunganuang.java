/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan42.tabunganuang;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 tabungan pennarikan uangg
 */
public class Pboulang10115109Latihan42Tabunganuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Program Penarikan Uang ---");
       System.out.print("Masukan saldo awal \t\t: ");
       Scanner input = new Scanner(System.in);
       int saldoawal = input.nextInt();
       
       Tabungan tab = new Tabungan(saldoawal);
       
        System.out.println("jumlah uang yang diambiil :");
        int ambil = input.nextInt();
        
        if(ambil > saldoawal){
            System.out.println("saldo anda tidak cukup ");
            System.out.println("saldo anda sekarang :"+tab.ambiluang(0)+"\n");
        }
        else{
            System.out.println("Sukses");
           System.out.println("Saldo anda sekarang : "+tab.ambiluang(ambil)+"\n");
       }
            
            
            
            
        }
        
        
    }
    

