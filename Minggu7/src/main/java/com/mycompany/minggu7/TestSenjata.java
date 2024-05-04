/*
Nama    : Hanif Herofa
NIM     : 24060122120015
Tanggal : 4/5/2024
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu7;

/**
 *
 * @author user
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isipeluru(3);
        kontrolAK47. menembak(5);

        System.out.println("===========================");

        kontrolM16.menembak(1);
        kontrolM16.isipeluru(5);
        kontrolM16.menembak(2);
    }
}
