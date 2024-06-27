import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {
        HashMap<String, String> ilkOgrenci = new HashMap<>();

        ilkOgrenci.put("Isim", "Sercan");
        ilkOgrenci.put("Soyisim", "Cataltepe");
        ilkOgrenci.put("Ders", "Matematik");
        ilkOgrenci.put("Not", "78");

        System.out.println(ilkOgrenci);

        HashMap <String, String> ikinciOgrenci =new HashMap<>();

        ikinciOgrenci.put("Isim", "Merve");
        ikinciOgrenci.put("Soyisim", "Cataltepe");
        ikinciOgrenci.put("Ders", "Biyoloji");
        ikinciOgrenci.put("Not", "95");

        System.out.println(ikinciOgrenci);

        HashMap <String, String> ucuncuOgrenci = new HashMap<>();

        ucuncuOgrenci.put("Isim", "Jose Carlos");
        ucuncuOgrenci.put("Soyisim", "Dominguez Coronel");
        ucuncuOgrenci.put("Ders", "Fizik");
        ucuncuOgrenci.put("Not", "60");

        System.out.println(ucuncuOgrenci);

        ArrayList<HashMap<String, String>> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ikinciOgrenci);
        ogrenciListesi.add(ucuncuOgrenci);

        System.out.println("--------------------");
        System.out.println(ogrenciListesi);
        System.out.println(ogrenciListesi.get(2));

    }
}
