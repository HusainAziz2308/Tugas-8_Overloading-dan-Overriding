public class Dosen {
    String nama;
    int nip;
    int umur;

    public Dosen(String nama) {
        this.nama = nama;
        this.nip = -1;
        this.umur = -1;
    }

    public Dosen(String nama, int nip) {
        this.nama = nama;
        this.nip = nip;
        this.umur = -1;
    }

    public Dosen(String nama, int nip, int umur) {
        this.nama = nama;
        this.nip = nip;
        this.umur = umur;
    }


    public void info() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + (nip == -1 ? "-" : nip));
        System.out.println("Umur    : " + (umur == -1 ? "-" : umur));
    }
}

class TesClass {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Agus");
        Dosen dosen2 = new Dosen("Budi", 1213);
        Dosen dosen3 = new Dosen("iwan", 2918, 47);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }
}