/*Nama  : Hanif Herofa */
/*NIM   : 24060122120015 */
/*File  : Asersi2.java */

// class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

// class asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "jari-jari harus lebih besar dari nol!!!";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/* Secara prinsip, program di atas sudah menggunakan asersi dengan tepat untuk memastikan bahwa jari-jari lingkaran harus memiliki nilai yang lebih besar dari 0
sebelum kelilingnya dihitung.*/
