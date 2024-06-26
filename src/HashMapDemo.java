import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ogrenciNotu = new HashMap<>();
        ogrenciNotu.put("Sercan", 85);
        ogrenciNotu.put("Jose", 70);
        ogrenciNotu.put("Merve", 95);
        System.out.println(ogrenciNotu);
        System.out.println("---------------");
        System.out.println("Sercan'in Ders Notu: " + ogrenciNotu.get("Sercan"));
        System.out.println("Butun 'Anahtar, Key' Degerleri: " + ogrenciNotu.keySet());
        System.out.println("Butun 'Not, Value' degerleri: " + ogrenciNotu.values());
        System.out.println("Butun girdi ciftleri: " + ogrenciNotu.entrySet());
        System.out.println("---------------");
        ogrenciNotu.replace("Sercan", 92);
        System.out.println("Sercan'in Yeni Notu: " + ogrenciNotu.get("Sercan"));
        System.out.println("---------------");
        ogrenciNotu.remove("Jose");
        System.out.println(ogrenciNotu);
    }
}
