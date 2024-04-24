/*2-) Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi
        ile tutan algoritma yazınız. */
public class Restaurant {

    public static void main(String[] args) {
        // Yemekler, fiyatlar ve popülerlik derecelendirmeleri bir dizi içinde tutuluyor
        String[] yemekler = {"Köfte", "Kebap", "Tavuk", "Balık"};
        double[] fiyatlar = {20.0, 25.0, 18.0, 30.0};
        int[] populerlikDerecelendirmesi = {5, 4, 3, 5}; // Örneğin, 5 en popüler, 1 en az popüler

        // Menüdeki yemekler ve özellikleri ekrana yazdırılıyor
        System.out.println("Restoran Menüsü:");
        for (int i = 0; i < yemekler.length; i++) {
            System.out.println("Yemek: " + yemekler[i] + ", Fiyat: " + fiyatlar[i] + " TL, Popülerlik: " + populerlikDerecelendirmesi[i]);
        }
    }
}
