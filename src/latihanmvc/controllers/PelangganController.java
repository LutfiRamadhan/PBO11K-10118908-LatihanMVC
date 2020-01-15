/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanmvc.controllers;

import javax.swing.JOptionPane;
import latihanmvc.models.PelangganModel;
import latihanmvc.views.Pelanggan;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(Pelanggan view){
        model.Reset();
    }
    
    public void simpanForm(Pelanggan view){
        String nama = view.getInputNama().getText();
        String email = view.getInputEmail().getText();
        String telp = view.getInputTelepon().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if(telp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No. Telp Masih Kosong");
        }else{
            model.Simpan();
        }
    }
    
}
