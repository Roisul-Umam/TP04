package tp04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Keranjang keranjang = new Keranjang();

        System.out.println("=== Selamat Datang Di Kopdes Rois ===");
        while (true) {
            System.out.print("Masukkan nama produk (ketik 'selesai' untuk checkout): ");
            String namaProduk = scanner.nextLine();

            if (namaProduk.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan harga produk: ");
            int hargaProduk = scanner.nextInt();
            System.out.print("Masukkan berat produk (gram): ");
            int beratProduk = scanner.nextInt();
            System.out.print("Masukkan stok produk: ");
            int stokProduk = scanner.nextInt();
            System.out.print("Masukkan kuantitas: ");
            int kuantitasProduk = scanner.nextInt();
            scanner.nextLine(); 

            if (kuantitasProduk > stokProduk) {
                System.out.println("Stok tidak mencukupi!");
                continue;
            }

            Produk produk = new Produk(namaProduk, hargaProduk, beratProduk, stokProduk);
            keranjang.tambahProduk(produk, kuantitasProduk);
        }

        System.out.print("Masukkan tipe member (silver/gold/platinum): ");
        String tipeMember = scanner.nextLine();

        System.out.print("Masukkan kode voucher (kosongkan jika tidak ada): ");
        String kodeVoucher = scanner.nextLine();

        System.out.println("\n===== STRUK =====");
        System.out.println("Barang yang dibeli:");
        for (Produk p : keranjang.getKeranjang()) {
            System.out.println("- " + p.getNama() + " x " + p.getKuantitas() + " = Rp" + p.getHarga());
        }
        System.out.println("Subtotal : " + keranjang.hitungSubtotal());
        System.out.println("Berat    : " + keranjang.hitungBerat() + " gram");
        System.out.println("Ongkir   : " + keranjang.hitungOngkir());
        System.out.println("Total    : " + keranjang.hitungTotal(tipeMember, kodeVoucher));

        scanner.close();
    }
}