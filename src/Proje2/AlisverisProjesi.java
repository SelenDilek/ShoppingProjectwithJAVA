package Proje2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AlisverisProjesi {
    public static void main(String[] args) {
        Scanner stroku = new Scanner(System.in);

        Scanner intoku = new Scanner(System.in);

        ArrayList<String> urunler = new ArrayList<>(Arrays.asList("DETERJAN", "MAKARNA", "UN", "EKMEK", "MEYVE"));
        ArrayList<Double> fiyatlar = new ArrayList<>(Arrays.asList(120.25, 225.99, 75.25, 22.19, 13.96));
        ArrayList<Integer> stok = new ArrayList<>(Arrays.asList(10, 14, 13, 12, 9));
        HashSet<String> secimListesi = new HashSet<>();
        ArrayList<Integer> secimMiktari = new ArrayList<>();

        ArrayList<Integer> secilenMakarnaAdedi = new ArrayList<>();
        ArrayList<Integer> secilenDeterjanAdedi = new ArrayList<>();
        ArrayList<Integer> secilenUnAdedi = new ArrayList<>();
        ArrayList<Integer> secilenekmekAdedi = new ArrayList<>();
        ArrayList<Integer> secilenMeyveAdedi = new ArrayList<>();

        double toplam1 = 0.0, toplam0 = 0.0, toplam2 = 0.0, toplam3 = 0.0, toplam4 = 0.0;

        String secim = "";
        String cevap = "";
        int secilenUrunAdeti;

        do {
            menuYazdir(urunler);

            System.out.print("\u001B[4m" + "Enter'a basiniz. " + "\u001B[0m");
            stroku.nextLine();

            System.out.print("\u001B[36m" + "Lutfen urun secimi yapiniz= " + "\u001B[0m");
            secim = stroku.nextLine().toUpperCase();
            secimListesi.add(secim);
            System.out.println("Sectiginiz urun:" + " " + secim.toUpperCase());

            if (secim.equalsIgnoreCase("Deterjan")) {
                System.out.println("Stok Miktarı = " + stok.get(0));
            } else if (secim.equalsIgnoreCase("Makarna")) {
                System.out.println("Stok Miktarı = " + stok.get(1));
            } else if (secim.equalsIgnoreCase("Un")) {
                System.out.println("Stok Miktarı = " + stok.get(2));
            } else if (secim.equalsIgnoreCase("Ekmek")) {
                System.out.println("Stok Miktarı = " + stok.get(3));
            } else if (secim.equalsIgnoreCase("Meyve")) {
                System.out.println("Stok Miktarı = " + stok.get(4));
            }

            System.out.print("Lütfen,talep ettiğiniz miktarı giriniz= ");
            secilenUrunAdeti = intoku.nextInt();
            secimMiktari.add(secilenUrunAdeti);

            if (secim.equalsIgnoreCase("Deterjan")) {

                int bulasikDStok = stok.get(0) - secilenUrunAdeti;
                stok.set(0, bulasikDStok);
                System.out.println(urunler.get(0) + " " + "ürününün toplam tutarı = " + (secilenUrunAdeti * (fiyatlar.get(0))));

                if (bulasikDStok > 0) {
                    toplam0 = toplam0 + (secilenUrunAdeti * (fiyatlar.get(0)));
                    secilenDeterjanAdedi.add(secilenUrunAdeti);
                } else if (bulasikDStok < 0) {

                    System.out.println("Istediginiz urun bitmistir ve stok durumu= " + stok.get(0));
                } else
                    System.out.println("Deterjan istediginiz adette mevcut degildir :  stok durumu = " + bulasikDStok);
            } else if (secim.equalsIgnoreCase("Makarna")) {

                int MakarnaStok = stok.get(1) - secilenUrunAdeti;
                stok.set(1, MakarnaStok);
                System.out.println(urunler.get(1) + " " + "ürününün toplam tutarı = " + (secilenUrunAdeti * (fiyatlar.get(1))));

                if (MakarnaStok > 0) {
                    toplam1 = toplam1 + (secilenUrunAdeti * (fiyatlar.get(1)));
                    secilenMakarnaAdedi.add(secilenUrunAdeti);
                } else if (MakarnaStok < 0) {

                    System.out.println("Istediginiz urun bitmistir ve stok durumu = " + stok.get(1));
                } else
                    System.out.println("Peynir istediginiz adette mevcut degildir :  stok durumu = " + MakarnaStok);
            } else if (secim.equalsIgnoreCase("Un")) {

                int unStok = stok.get(2) - secilenUrunAdeti;
                stok.set(2, unStok);
                System.out.println(urunler.get(2) + " " + "ürününün toplam tutarı = " + " " + (secilenUrunAdeti * (fiyatlar.get(2))));

                if (unStok > 0) {
                    toplam2 = toplam2 + (secilenUrunAdeti * (fiyatlar.get(2)));
                    secilenUnAdedi.add(secilenUrunAdeti);

                } else if (unStok < 0) {

                    System.out.println("Istediginiz urun bitmistir ve stok durumu = " + stok.get(2));
                } else
                    System.out.println("Un istediginiz adette mevcut degildir :  stok durumu = " + unStok);
            } else if (secim.equalsIgnoreCase("Ekmek")) {

                int ekmekStok = stok.get(3) - secilenUrunAdeti;
                stok.set(3, ekmekStok);
                System.out.println(urunler.get(3) + " " + "ürününün toplam tutarı = " + " " + (secilenUrunAdeti * (fiyatlar.get(3))));

                if (ekmekStok > 0) {
                    toplam3 = toplam3 + (secilenUrunAdeti * (fiyatlar.get(3)));
                    secilenekmekAdedi.add(secilenUrunAdeti);

                } else if (ekmekStok < 0) {

                    System.out.println("Istediginiz urun bitmistir ve stok durumu = " + stok.get(3));
                } else {
                    System.out.println("Ekmek istediginiz adette mevcut degildir :  stok durumu = " + ekmekStok);
                }
            } else if (secim.equalsIgnoreCase("Meyve")) {

                int meyveStok = stok.get(4) - secilenUrunAdeti;
                stok.set(4, meyveStok);
                System.out.println(urunler.get(4) + " " + "ürününün toplam tutarı = " + " " + (secilenUrunAdeti * (fiyatlar.get(4))));

                if (meyveStok > 0) {
                    toplam4 = toplam4 + (secilenUrunAdeti * (fiyatlar.get(4)));
                    secilenMeyveAdedi.add(secilenUrunAdeti);

                } else if (meyveStok < 0) {

                    System.out.println("Istediginiz urun bitmistir ve stok durumu = " + stok.get(4));
                } else {
                    System.out.println("Meyve istediginiz adette mevcut degildir :  stok durumu = " + meyveStok);
                }
            }
            System.out.print("\u001B[35m" + "Baska bir urun almak ister misiniz(E/H)= " + "\u001B[0m");
            cevap = stroku.next();

        } while (cevap.equalsIgnoreCase("E"));
        System.out.println();

        int toplammeyve = 0;
        int toplamekmek = 0;
        int toplammakarna = 0;
        int toplamun = 0;
        int toplamdeterjan = 0;
        System.out.println("\u001B[31m" + "ALISVERISINIZ BASARI ILE TAMAMLANDI !" + "\u001B[0m");
        System.out.print("\u001B[1m" + "Sectiginiz Urunlerin Listesi : " + "\u001B[0m");
        System.out.println(secimListesi);
        System.out.println();
        System.out.println("\u001B[31m" + "Sectiginiz Urunlerin Miktarlari : " + "\u001B[0m");

        if (secimListesi.contains(urunler.get(4))) {
            for (int i = 0; i < secilenMeyveAdedi.size(); i++) {

                toplammeyve += secilenMeyveAdedi.get(i);
            }
            System.out.println("\u001B[34m" + "Toplam meyve miktariniz= " + toplammeyve + "\u001B[0m");
        }

        if (secimListesi.contains(urunler.get(3))) {

            for (int i = 0; i < secilenekmekAdedi.size(); i++) {

                toplamekmek += secilenekmekAdedi.get(i);
            }

            System.out.println("\u001B[34m" + "Toplam ekmek miktariniz= " + toplamekmek + "\u001B[0m");
        }

        if (secimListesi.contains(urunler.get(1))) {

            for (int i = 0; i < secilenMakarnaAdedi.size(); i++) {

                toplammakarna += secilenMakarnaAdedi.get(i);
            }
            System.out.println("\u001B[34m" + "Toplam makarna miktariniz= " + toplammakarna + "\u001B[0m");
        }

        if (secimListesi.contains(urunler.get(0))) {

            for (int i = 0; i < secilenDeterjanAdedi.size(); i++) {

                toplamdeterjan+= secilenDeterjanAdedi.get(i);
            }
            System.out.println("\u001B[34m" + "Toplam deterjan miktariniz= " + toplamdeterjan + "\u001B[0m");
        }

        if (secimListesi.contains(urunler.get(2))) {

            for (int i = 0; i < secilenUnAdedi.size(); i++) {

                toplamun += secilenUnAdedi.get(i);
            }
            System.out.println("\u001B[34m" + "Toplam un miktariniz= " + toplamun + "\u001B[0m");
        } else
            System.out.println("\u001B[31m" + "Ürün adedini sıfır girdiniz" + "\u001B[0m");

        System.out.println("\u001B[1m" + "Toplam alisveris tutariniz =" + (double) (toplam0 + toplam1 + toplam2 + toplam3 + toplam4) + "TL" + "\u001B[0m");

    }

    public static void menuYazdir(ArrayList<String> urunler) {
        System.out.println("\u001B[35m" + "Alisveris Listeniz : " + "\u001B[0m");
        for (int i = 0; i < urunler.size(); i++) {

            System.out.println((i + 1) + "." + urunler.get(i));
        }


    }

}
