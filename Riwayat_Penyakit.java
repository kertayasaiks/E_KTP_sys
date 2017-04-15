/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_ktp_system;

/**
 *
 * @author 0xiRiz
 */
public class Riwayat_Penyakit {
    private  String Nama_penyakit;
    private String tgl;
    
    public void setNama_Penyakit(String Nama_Penyakit){
        this.Nama_Penyakit = Nama_Penyakit;
    }
    
    public String getNamaPenyakit(){
        return Nama_Penyakit;
    }
    
    public void SetTanggal(String Tanggal){
        this.Tanggal = Tanggal;
    }
    
    public getTanggal(){
       return Tanggal;
    }
}
