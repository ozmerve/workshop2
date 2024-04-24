import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan ve toplam
        satış gelirini hesaplayan bir algoritma yazınız. */

        HashMap<String, Double> urunler = new HashMap<>();
        urunler.put("Bilgisayar", 5000.0);
        urunler.put("Telefon", 3000.0);
        urunler.put("Televizyon", 4000.0);
        // Mağazanın günlük satışlarını içeren bir dizi oluşturuluyor
        int[] gunlukSatislar = {10, 20, 15}; // Örnek olarak bilgisayar, telefon ve televizyon satışları
        // Toplam satış geliri hesaplanıyor
        double toplamSatisGeliri = hesaplaToplamSatisGeliri(urunler, gunlukSatislar);
        System.out.println("Günlük Toplam Satış Geliri: " + toplamSatisGeliri + " TL");
    }

    public static double hesaplaToplamSatisGeliri(HashMap<String, Double> urunler, int[] gunlukSatislar) {
        double toplamGelir = 0;
        // Her bir ürünün günlük satışları üzerinden toplam gelir hesaplanıyor
        for (int i = 0; i < gunlukSatislar.length; i++) {
            String urunAdi = (String)urunler.keySet().toArray()[i];
            double urunFiyati = urunler.get(urunAdi);
            int urunAdedi = gunlukSatislar[i];
            double urunGeliri = urunFiyati * urunAdedi;
            toplamGelir += urunGeliri;
        }
        return toplamGelir;
    }
}