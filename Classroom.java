abstract class AkunMahasiswa {
    private String nama;
    private int nilai;

    //Construction 
    public AkunMahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    //Getter
    public String getNama() {
        return nama;
    }
    public int getNilai() {
        return nilai;
    }
    public abstract void lihatTugas();
    }

class MahasiswaIT extends AkunMahasiswa {
    public MahasiswaIT(String nama, int nilai) {
        super(nama, nilai);
    }
 
    //Polimorfisme: tugas spesifik IT
    @Override
    public void lihatTugas() {
        System.out.println(getNama() + " melihat tugas IT dengan nilai: " + getNilai());
    }
}

class MahasiswaSipil extends AkunMahasiswa {
    public MahasiswaSipil(String nama, int nilai) {
        super(nama, nilai);
    }

    //Polimorfisme: tugas spesifik Sipil
    @Override
    public void lihatTugas() {
        System.out.println(getNama() + " melihat tugas Sipil dengan nilai: " + getNilai());
    }
}


    //Main Program
public class Classroom {
    public static void main(String[] args) {
        // Menggunakan tipe induk untuk objek yang berbeda (Polimorfisme)
        AkunMahasiswa m1 = new MahasiswaIT("Ronin", 90);
        AkunMahasiswa m2 = new MahasiswaSipil("Firza", 85);

        System.out.println("=== INFO AKADEMIK ===");
        m1.lihatTugas();
        m2.lihatTugas();
    }
}


