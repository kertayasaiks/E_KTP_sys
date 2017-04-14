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
public class Akta_Kelahiran {
    private String No_akta;
    private String nama_dokter;
    private char anak_ke;

    public void setNo_akta(String No_akta) {
        this.No_akta = No_akta;
    }
    
    public String getNo_akta() {
        return No_akta;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }
    
    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setAnak_ke(char anak_ke) {
        this.anak_ke = anak_ke;
    }
    
    public char getAnak_ke() {
        return anak_ke;
    }    
}