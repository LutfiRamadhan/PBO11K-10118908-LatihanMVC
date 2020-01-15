/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanmvc.models;

import javax.swing.JOptionPane;
import latihanmvc.events.PelangganListener;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class PelangganModel {
    
    protected String email, nama, telp;
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        Change();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        Change();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
        Change();
    }
    
    public void Change(){
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
    
    public void Reset(){
        setNama("");
        setEmail("");
        setTelp("");
    }
    
    public void Simpan(){
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
    }
}
