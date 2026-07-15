package tp04;
public class Produk {
    private String nama;
    private int harga;
    private int stok;
    private int berat;
    private int kuantitas;
    
    public Produk(String nama, int harga, int berat, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
        this.stok = stok;
    }
    public String getNama() {
        return this.nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getBerat() {
        return this.berat;
    }
    public int getStok() {
        return this.stok;
    }
    public int getKuantitas() {
        return kuantitas;
    }
    public void setKuantitas(int kuantitas) {
        if (kuantitas < 0) {
            System.out.println("Kuantitas tidak boleh kurang dari 0!");
        } else {
            this.kuantitas = kuantitas;
        }
    }
}
