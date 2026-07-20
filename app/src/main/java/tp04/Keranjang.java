package tp04;
import java.util.ArrayList;

public class Keranjang {
    
    private ArrayList<Produk> keranjang = new ArrayList<>();
    // Menyimpan pasangan Produk dan kuantitasnya.
    /** Menambahkan produk ke keranjang. */
    public boolean tambahProduk(Produk produk, int kuantitas) {
        if (kuantitas < 1) {
            System.out.println("Kuantitas tidak boleh kurang dari 1!");
            return false;
        } 
        keranjang.add(produk);
        produk.setKuantitas(kuantitas);
        System.out.println("Produk berhasil ditambahkan ke keranjang!");
        System.out.println("");
        return true;
    }
    /** Total harga seluruh item sebelum ongkir dan berat. */
    public int hitungSubtotal() {
        int total = 0;
        for (Produk p : keranjang) {
            total += p.getHarga() * p.getKuantitas();
        }
        return total;
    }
    /** Total berat seluruh item dalam gram. */
    public int hitungBerat() {
        int total = 0;
        for (Produk p : keranjang) {
            total += p.getBerat() * p.getKuantitas();
        }
        return total;
    }
    /** Ongkos kirim berdasarkan total berat. */
    public int hitungOngkir() { 
        int totalBerat = hitungBerat(); 
        int ongkir = 0 ; 

        for (Produk p : keranjang) {
            if (p == null) {
                ongkir = 0;
            } else {
                if (totalBerat <= 1000) {
                    ongkir = 10000;
                } else {
                    ongkir = 10000 + ((int) Math.ceil((totalBerat-1000) / 1000)) * 5000;
                }
            }
        }
        return ongkir;
    }
    /** Harga akhir yang harus dibayar. */
    public int hitungTotal(String tipeMember, String kodeVoucher) {
        int subtotal = hitungSubtotal();
        int ongkir = hitungOngkir();
        int memberDiscount = 0;
        String tipememberNew = tipeMember.toLowerCase();
        // Diskon member
        switch (tipememberNew) {
            case "silver" -> memberDiscount = (int) (subtotal * 0.15);
            case "gold" -> memberDiscount = (int) (subtotal * 0.25);
            case "platinum" -> memberDiscount = (int) (subtotal * 0.35);
            default -> {}
        }
        // Diskon voucher
        if (kodeVoucher.equals("VOUCHER20")) {
            if (subtotal <= 125000) {
                subtotal *= 0.80;
            } else {
                subtotal -= 25000;
            }
        } else {
        }
        return subtotal + ongkir - memberDiscount;
    }
    /** Mendapatkan daftar produk dalam keranjang. */
    public ArrayList<Produk> getKeranjang() {
        return keranjang;
    }
}
