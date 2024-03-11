/*Nama  : Hanif Herofa */
/*NIM   : 24060122120015 */
/*File  : AngkaSial.java */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println("Angka "+angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* 
Dalam program tersebut, jika terjadi eksepsi AngkaSialException saat memanggil angkasial.cobaAngka(13);,
baris 6 (System.out.println("Angka "+angka+" bukan angka sial");) tidak akan dieksekusi.
Program akan langsung beralih ke blok catch. Jadi, baris 9 tidak akan dieksekusi karena eksepsi terjadi sebelumnya,
dan program langsung melanjutkan ke blok catch.
Selain itu, pada program tersebut, baris 18 akan dieksekusi karena terdapat angka 13 yang menyebabkan terjadinya eksepsi. */