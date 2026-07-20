import java.util.Scanner;
package tp04;
public class Main {
    ArrayList<Produk> daftarBelanja = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("=== Selamat Datang Di Kopdes Rois ===");
        System.out.println("Masukkan nama produk: ");
        Scanner scanner = new Scanner(System.in);
        String namaProduk = scanner.nextLine();
        Keranjang keranjang = new Keranjang();
        while (!namaProduk.equals("selesai")) {
            System.out.println("Masukkan harga produk: ");
            int hargaProduk = scanner.nextInt();
            System.out.println("Masukkan berat produk (gram): ");
            int beratProduk = scanner.nextInt();
            System.out.println("Masukkan stok produk: ");
            int stokProduk = scanner.nextInt();
            Produk produk = new Produk(namaProduk, hargaProduk, beratProduk, stokProduk);
            System.out.println("Masukkan kuantitas produk yang ingin dibeli: ");
            int kuantitasProduk = scanner.nextInt();
            produk.setKuantitas(kuantitasProduk);
            keranjang.tambahProduk(produk, kuantitasProduk);
            System.out.println("Masukkan nama produk: ");
            namaProduk = scanner.next();
        }
        System.out.println("Subtotal: " + keranjang.hitungSubtotal());
        System.out.println("Berat: " + keranjang.hitungBerat());
        System.out.println("Ongkir: " + keranjang.hitungOngkir());
    }
}
