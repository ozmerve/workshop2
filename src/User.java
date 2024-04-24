/* 4-) Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList
        kullanarak giriş yapma algoritması yazınız.*/
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        // Kullanıcı bilgilerini tutan ArrayList
        ArrayList<Kullanici> kullanicilar = new ArrayList<>();

        // Örnek kullanıcılar ekleniyor
        kullanicilar.add(new Kullanici("user1", "user1@example.com", "MERVE", "ÖZ", "123456"));
        kullanicilar.add(new Kullanici("user2", "user2@example.com", "ZEYNEP", "ÖZ", "password"));

        // Kullanıcıdan giriş bilgileri alınıyor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        // Giriş yapılıyor
        boolean girisBasarili = girisYap(kullanicilar, kullaniciAdi, sifre);
        if (girisBasarili) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");
        }

        scanner.close();
    }

    public static boolean girisYap(ArrayList<Kullanici> kullanicilar, String kullaniciAdi, String sifre) {
        // Kullanıcı adı ve şifre kontrol ediliyor
        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi) && kullanici.getSifre().equals(sifre)) {
                return true;
            }
        }
        return false;
    }
}

class Kullanici {
    private String kullaniciAdi;
    private String email;
    private String firstName;
    private String lastName;
    private String sifre;

    public Kullanici(String kullaniciAdi, String email, String firstName, String lastName, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }
}
