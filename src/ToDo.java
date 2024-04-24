/*6-) Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan bir Arraylist
      oluşturunuz.ArrayList içinde bulunan görevleri güncelleyen, tamamlanan görevleri ise silen
      algoritmayı yazınız.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        // Günlük görevleri içeren ArrayList oluşturma
        ArrayList<Gorev> gunlukGorevler = new ArrayList<>();
        gunlukGorevler.add(new Gorev("Alışveriş yap", false));
        gunlukGorevler.add(new Gorev("E-postaları kontrol et", false));
        gunlukGorevler.add(new Gorev("Raporu hazırla", false));

        // Görevleri listeleme
        System.out.println("Günlük Görevler:");
        for (Gorev gorev : gunlukGorevler) {
            System.out.println(gorev.getIsim() + " - Tamamlandı mı? " + (gorev.isTamamlandi() ? "Evet" : "Hayır"));
        }

        // Görev güncelleme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Güncellemek istediğiniz görevin sırasını girin (1-" + gunlukGorevler.size() + "): ");
        int secilenIndex = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku
        if (secilenIndex >= 1 && secilenIndex <= gunlukGorevler.size()) {
            System.out.print("Yeni durumu girin (true/false): ");
            boolean yeniDurum = scanner.nextBoolean();
            gunlukGorevler.get(secilenIndex - 1).setTamamlandi(yeniDurum);
        } else {
            System.out.println("Geçersiz görev numarası.");
        }

        // Tamamlanan görevleri silme
        for (int i = 0; i < gunlukGorevler.size(); i++) {
            if (gunlukGorevler.get(i).isTamamlandi()) {
                gunlukGorevler.remove(i);
                i--; // Bir önceki indekse dön
            }
        }

        // Güncellenmiş görevleri listeleme
        System.out.println("Güncellenmiş Görevler:");
        for (Gorev gorev : gunlukGorevler) {
            System.out.println(gorev.getIsim() + " - Tamamlandı mı? " + (gorev.isTamamlandi() ? "Evet" : "Hayır"));
        }

        scanner.close();
    }
}

class Gorev {
    private String isim;
    private boolean tamamlandi;

    public Gorev(String isim, boolean tamamlandi) {
        this.isim = isim;
        this.tamamlandi = tamamlandi;
    }

    public String getIsim() {
        return isim;
    }

    public boolean isTamamlandi() {
        return tamamlandi;
    }

    public void setTamamlandi(boolean tamamlandi) {
        this.tamamlandi = tamamlandi;
    }
}