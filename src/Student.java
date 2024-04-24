/*  5-) Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli not aralığı altında
        kalan öğrenciyi listeden silme algoritması yazınız.,*/
import java.util.ArrayList;
import java.util.Iterator;

public class Student {

    public static void main(String[] args) {
        // Öğrenci adları ve notlarını içeren ArrayList
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci("Ali", 80));
        ogrenciler.add(new Ogrenci("Ayşe", 65));
        ogrenciler.add(new Ogrenci("Ahmet", 45));
        ogrenciler.add(new Ogrenci("Fatma", 75));

        // Belirli bir not aralığının altındaki öğrencileri listeden silme
        silBelirliNotAraligiAltindakiOgrenciler(ogrenciler, 60, 70);

        // Silindikten sonra öğrencileri listeleme
        System.out.println("Kalan Öğrenciler:");
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println(ogrenci.getAd() + " - Not: " + ogrenci.getNot());
        }
    }

    public static void silBelirliNotAraligiAltindakiOgrenciler(ArrayList<Ogrenci> ogrenciler, int altSinir, int ustSinir) {
        Iterator<Ogrenci> iterator = ogrenciler.iterator();
        while (iterator.hasNext()) {
            Ogrenci ogrenci = iterator.next();
            int not = ogrenci.getNot();
            if (not >= altSinir && not <= ustSinir) {
                iterator.remove(); // Belirli not aralığı altındaki öğrenciyi listeden kaldır
            }
        }
    }
}

class Ogrenci {
    private String ad;
    private int not;

    public Ogrenci(String ad, int not) {
        this.ad = ad;
        this.not = not;
    }

    public String getAd() {
        return ad;
    }

    public int getNot() {
        return not;
    }
}
