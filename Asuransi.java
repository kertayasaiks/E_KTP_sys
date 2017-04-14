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
import java.util.Date;
public class Asuransi {
    private String No_kartu;
    private Date tgl_awal = new Date();
    private Date tgl_akhir = new Date();
    private String status;

    public void setNo_kartu(String No_kartu) {
        this.No_kartu = No_kartu;         
    }
    
    public String getNo_kartu() {
        return No_kartu;
    }
    
    public void setTgl_awal(Date tgl_awal) {
        this.tgl_awal = tgl_awal;
    }
    
    public Date getTgl_awal() {
        return tgl_awal;
    }

    public void setTgl_akhir(Date tgl_akhir) {
        this.tgl_akhir = tgl_akhir;
    }
    
    public Date getTgl_akhir() {
        return tgl_akhir;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
