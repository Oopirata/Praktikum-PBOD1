// Nama : Hanif Herofa
// NIM  : 24060122120015
// Lab  : D1

public class MTitik {
    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(5, 6);
        t1.setAbsis(1);
        t1.setOrdinat(1);
        t2.setAbsis(4);
        t2.setOrdinat(5);

        System.out.println("Jumlah Objek Titik : " + t2.getCounter());
        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");

    }
}
