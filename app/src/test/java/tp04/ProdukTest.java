package tp04;

import org.junit.jupiter.api.Test;

public class ProdukTest {
    @Test
    public void testProduk() {
        Produk produk = new Produk("Buku", 50000, 500, 10);
        assert produk.getNama().equals("Buku");
        assert produk.getHarga() == 50000;
        assert produk.getBerat() == 500;
        assert produk.getStok() == 10;
    }

    @Test
    public void testSetKuantitas() {
        Produk produk = new Produk("Buku", 50000, 500, 10);
        produk.setKuantitas(3);
        assert produk.getKuantitas() == 3;
    }

    @Test
    public void testSetKuantitasInvalid() {
        Produk produk = new Produk("Buku", 50000, 500, 10);
        produk.setKuantitas(-1);
        assert produk.getKuantitas() == -1; 
    }

    @Test
    public void testGetters() {
        Produk produk = new Produk("Buku", 50000, 500, 10);
        assert produk.getNama().equals("Buku");
        assert produk.getHarga() == 50000;
        assert produk.getBerat() == 500;
        assert produk.getStok() == 10;
    }
}
