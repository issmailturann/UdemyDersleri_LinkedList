import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {

    //Kullanıcı için arayüz
    public static void islemBastir(){

        System.out.println("0 - İŞLEMLERİ GÖRÜNTÜLE");
        System.out.println("1 - BİR SONRAKİ ŞEHRE GİT");
        System.out.println("2 - BİR ÖNCEKİ ŞEHRE GİT");
        System.out.println("3 - UYGULAMADAN ÇIK");
    }

    //Şehirleri turlayabileceğimiz algoritma.
    public static void sehirleriTurlamak(LinkedList<String> Sehirler){
        ListIterator<String> iterator  = Sehirler.listIterator();

        int islem;

        islemBastir();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("HERHANGİ BİR ŞEHİR BULUNMUYOR!");

        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis){
            System.out.println("BİR İŞLEM SEÇİNİZ");

            islem = scanner.nextInt();

            switch(islem){
                case 0:
                    islemBastir();
                    break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("ŞEHRE GİDİLİYOR: " + iterator.next());
                    }
                    else{
                        System.out.println("GİDİLECEK ŞEHİR KALMADI.");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("ŞEHRE GİDİLİYOR: " + iterator.previous());
                    }
                    else {
                        System.out.println("SİSTEM YENİ BAŞLADI...");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("UYGULAMADAN ÇIKILDI");
                    break;
            }
        }
    }
    //Main
    public static void main(String[] args) {

        LinkedList<String> Sehirler = new LinkedList<String>();

        Sehirler.add("Ankara");
        Sehirler.add("İstanbul");
        Sehirler.add("İzmir");

        sehirleriTurlamak(Sehirler);

    }
    }
