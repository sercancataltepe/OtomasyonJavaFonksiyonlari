import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> isimlerListesi = new ArrayList<>();

        isimlerListesi.add("Sercan");
        isimlerListesi.add("Merve");
        isimlerListesi.add("Mercan");
        isimlerListesi.add("Kaya");

        System.out.println(isimlerListesi);

        isimlerListesi.add("Ciko");
        isimlerListesi.add("inci");
        System.out.println(isimlerListesi);

        isimlerListesi.get(0);
        System.out.println(isimlerListesi.get(0));

        isimlerListesi.set(5, "Test");
        System.out.println(isimlerListesi);

        System.out.println("------------------");

        isimlerListesi.remove(3);
        System.out.println(isimlerListesi);

        System.out.println("------------------");

        String silinenIsim=isimlerListesi.remove(4);
        System.out.println(isimlerListesi);
        System.out.println(silinenIsim + " listemizden cikartilmistir");

        isimlerListesi.add("Jose");
        isimlerListesi.add("Maria");
        isimlerListesi.add("Moises");
        System.out.println(isimlerListesi);
        System.out.println("Listemizde olan kisi sayisi " + isimlerListesi.size() + " dir");
        System.out.println("----------------------");
        System.out.println("Listemizde Sercan ismi " + isimlerListesi.contains("Sercan"));
        System.out.println("Listemizde Kartal ismi " + isimlerListesi.contains("Kartal"));
        System.out.println("----------------------");

        System.out.println("Moises isminin Liste numarası " + isimlerListesi.indexOf("Moises") + " dir");
        System.out.println("----------------------");
        System.out.println(isimlerListesi.isEmpty());
        System.out.println("----------------------");

        for (String isim : isimlerListesi) {
            System.out.println(isim);
        }
    }
}
