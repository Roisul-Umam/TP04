package tp04;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class KeranjangTest {
    @Test
    public void testTambahProdukBerhasil() {
        Produk buku = new Produk("Buku", 50000, 500, 10);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(buku, 3);
        assertEquals(150000, keranjang.hitungSubtotal());
        assertEquals(1500, keranjang.hitungBerat());
    }

    @Test
    public void testTambahProdukGagal() {
        Produk buku = new Produk("Pensil", 90000, 50, 10);
        Keranjang keranjang = new Keranjang();
        boolean result = keranjang.tambahProduk(buku, 0);
        assertEquals(false, result);
    }

    @Test
    public void testHitungOngkirBerhasil() {
        Produk buku = new Produk("Buku", 50000, 500, 10);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(buku, 3);
        assertEquals(10000, keranjang.hitungOngkir());
    }

    @Test
    public void testHitungOngkirGagal() {
        Keranjang keranjang = new Keranjang();
        assertEquals(0, keranjang.hitungOngkir());
    }

    @Test
    public void testHitungTotalBerhasilSilverVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(20400, keranjang.hitungTotal("silver", "VOUCHER20"));
    }

    @Test
    public void testHitungTotalGoldVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(18800, keranjang.hitungTotal("gold", "VOUCHER20"));
    }

    @Test
    public void testHitungTotalPlatinumVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(17200, keranjang.hitungTotal("platinum", "VOUCHER20"));
    }

    @Test
    public void testHitungTotalBerhasilSilverNoVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(23600, keranjang.hitungTotal("silver", ""));
    }

    @Test
    public void testHitungTotalBerhasilGoldNoVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(22000, keranjang.hitungTotal("gold", ""));
    }

    @Test
    public void testHitungTotalBerhasilPlatinumNoVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(20400, keranjang.hitungTotal("platinum", ""));
    }

    @Test
    public void testHitungTotalBerhasilNoMemberVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(22800, keranjang.hitungTotal("", "VOUCHER20"));
    }

    @Test
    public void testHitungTotalBerhasilNoMemberNoVoucher() {
        Produk Penggaris = new Produk("Penggaris", 8000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(26000, keranjang.hitungTotal("", ""));
    }

    @Test
    public void testHitungTotalBerhasilMahal() {
        Produk Penggaris = new Produk("Penggaris", 80000, 100, 2);
        Keranjang keranjang = new Keranjang();
        keranjang.tambahProduk(Penggaris, 2);
        assertEquals(145000, keranjang.hitungTotal("", "VOUCHER20"));
    }    

    @Test
    public void testHitungTotalGagal() {
        Keranjang keranjang = new Keranjang();
        assertEquals(0, keranjang.hitungTotal("silver", "VOUCHER20"));
    }
}