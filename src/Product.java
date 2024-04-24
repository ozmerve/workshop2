/*3-) Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen miktarları bir dizi ile tutan
algoritma yazınız.*/
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünler ve fiyatlarını içeren diziler
        String[] urunler = {"Elma", "Armut", "Portakal", "Muz"};
        double[] fiyatlar = {2.5, 3.0, 2.0, 4.0};

        // Kullanıcının sepete eklemek istediği ürünleri ve miktarlarını tutan diziler
        String[] sepetUrunler = new String[5];
        int[] sepetMiktarlar = new int[5];
        double[] sepetToplamFiyatlar = new double[5];

        // Kullanıcıya ürünleri listeleme
        System.out.println("Ürünler:");
        for (int i = 0; i < urunler.length; i++) {
            System.out.println((i+1) + ". " + urunler[i] + " - " + fiyatlar[i] + " TL");
        }

        // Sepete ürün ekleme işlemi
        int sepettekiUrunSayisi = 0;
        String devam;
        do {
            System.out.print("Sepete eklemek istediğiniz ürünün numarasını girin: ");
            int urunNumarasi= scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            int urunIndex = urunNumarasi - 1;
            if (urunIndex >= 0 && urunIndex < urunler.length) {
                System.out.print("Sepete eklemek istediğiniz miktarı girin: ");
                int miktar = scanner.nextInt();

                sepetUrunler[sepettekiUrunSayisi] = urunler[urunIndex];
                sepetMiktarlar[sepettekiUrunSayisi] = miktar;
                sepetToplamFiyatlar[sepettekiUrunSayisi] = fiyatlar[urunIndex] * miktar;

                sepettekiUrunSayisi++;
            } else {
                System.out.println("Geçersiz ürün numarası.");
            }

            System.out.print("Alışverişe devam etmek istiyor musunuz? (E/H): ");
            devam = scanner.nextLine();
        } while (devam.equalsIgnoreCase("E"));

        // Sepetteki ürünleri ve toplam fiyatı gösterme
        System.out.println("Sepetinizdeki Ürünler:");
        double toplamFiyat = 0;
        for (int i = 0; i < sepettekiUrunSayisi; i++) {
            System.out.println(sepetUrunler[i] + " - " + sepetMiktarlar[i] + " adet - Toplam Fiyat: " + sepetToplamFiyatlar[i] + " TL");
            toplamFiyat += sepetToplamFiyatlar[i];
        }
        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");

        scanner.close();
    }
}
