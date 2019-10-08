/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan26.waktusaatini;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Waktu Saat ini
 */
public class PBOIF11K10118905Latihan26WaktuSaatIni {

    /**
     * @return 
     */
    public static String getFullDate() {
        DateFormat dateformat = new SimpleDateFormat("dd mm yyyy H:mm:ss");
        Date tanggal = new Date();
        return dateformat.format(tanggal);
    }
    
    public static String getHari(){
        DateFormat dateformat = new SimpleDateFormat("EEEEEE");
        Date tanggal = new Date();
        String hari;
        hari = dateformat.format(tanggal);
        String[] hari_idn = new String[]{"Senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
        String[] hari_eng = new String[] {"Monday","tuesday","wednesday","thursday","fridaya","saturday","sunday"};
        for (int i =0; i < 7; i ++){
            if (hari.equals(hari_eng[i])){
                hari = hari_idn[i];
            }
        }
    return hari;
}
    public static void main(String[]args){
        String tanggal= getFullDate();
        String hari = getHari();
        System.out.println(hari+","+tanggal);
    }
}