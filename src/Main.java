import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sercan Cataltepe");
        System.out.println("----------------");

        ArabaStatic ilkArabam = new ArabaStatic();
        ilkArabam.setModel("Peugeot 207");
        System.out.println("İlk Arabamin Modeli: " + ilkArabam.getModel() + " ve Fiyati: " + ArabaStatic.arabaFiyati);
        ArabaStatic.arabaFiyati = 970000;
        System.out.println("İlk Arabamin Modeli: " + ilkArabam.getModel() + " ve Yeni Fiyati: " + ArabaStatic.arabaFiyati);


        ArabaStatic ikinciArabam = new ArabaStatic();
        ikinciArabam.setModel("Volvo V40");
        System.out.println("Ikinci Arabamın Modeli: " +ikinciArabam.getModel() + " ve Fiyati: " + ArabaStatic.arabaFiyati);
        ArabaStatic.arabaFiyati = 1530000;
        System.out.println("ikinci Arabamin Modeli: "+ ikinciArabam.getModel() + " ve Yeni Fiyati: " + ArabaStatic.arabaFiyati);

        ArabaStatic ucuncuArabam = new ArabaStatic();
        ucuncuArabam.setModel("BMW 4.28i Grandcoupe");
        System.out.println("Ucuncu Arabamin  Modeli: " + ucuncuArabam.getModel() + " ve Fiyati: " + ArabaStatic.arabaFiyati);



        }
    }