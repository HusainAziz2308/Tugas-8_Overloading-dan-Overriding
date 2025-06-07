class Anjing {
    int nomer;
    int umur;
    String nama;

    public Anjing(int nomer, int umur, String nama) {
        this.nomer = nomer;
        this.umur = umur;
        this.nama = nama;
    }

    public String skill() {
        return "penurut";
    }
}

class Kucing extends Anjing {
    double panjangEkor;

    public Kucing(int nomer, int umur, String nama, double panjangEkor) {
        super(nomer, umur, nama);
        this.panjangEkor = panjangEkor;
    }

    public String skill() {
        return "nyusahin :)";
    }
}

public class TesTugas2 {
    public static void main(String[] args) {
        Anjing Anjing1 = new Anjing(1, 5, "Jack");
        Kucing Kucing1 = new Kucing(1, 1, "Abdul ", 2);

        System.out.println("Hewan " + Anjing1.nomer);
        System.out.println("Umur            : " + Anjing1.umur);
        System.out.println("Nama            : " + Anjing1.nama);
        System.out.println("Cara Bergerak   : " + Anjing1.skill());

        System.out.println("\nHewan " + Kucing1.nomer);
        System.out.println("Umur            : " + Kucing1.umur);
        System.out.println("Nama            : " + Kucing1.nama);
        System.out.println("Panjang Ekor    : " + Kucing1.panjangEkor);
        System.out.println("Cara Bergerak   : " + Kucing1.skill());
    }
}

