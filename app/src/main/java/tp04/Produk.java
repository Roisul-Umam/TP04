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
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getBerat() {
        return this.berat;
    }
    public int getStok() {
        return stok;
    }
    public int getKuantitas() {
        return kuantitas;
    }
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }
}
