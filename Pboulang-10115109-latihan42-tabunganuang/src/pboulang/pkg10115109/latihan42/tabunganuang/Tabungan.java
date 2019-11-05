/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan42.tabunganuang;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitun tabungan
 */
public class Tabungan {
    private int saldo; 
    
    public Tabungan(int saldo ){
        this.saldo = saldo;
    }
    public int ambiluang(int jumlah){
        saldo -= jumlah;
        return saldo;
    }
    
    
}
