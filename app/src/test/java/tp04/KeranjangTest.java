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
}