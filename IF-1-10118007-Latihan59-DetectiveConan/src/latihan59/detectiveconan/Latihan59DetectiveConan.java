/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan59.detectiveconan;

/**
 *
 * @author 
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi Program : Program ini untuk membuat objek dari anime detective 
 *                     conan.
 */
public class Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainCharacter conan = new MainCharacter("Investigator", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        MainCharacter ran = new MainCharacter("Karate", "Sama seperti Shinichi","Ran Mouri","Osaka",false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }
    
}
