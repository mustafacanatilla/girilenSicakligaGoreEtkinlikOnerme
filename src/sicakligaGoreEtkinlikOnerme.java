import java.util.Scanner;
public class sicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz:");
        x = input.nextInt();

        if (x < 5){
            System.out.print("Sıcaklık " + x + " Derece Kayak Yapabiliriz");
        } else if (x >= 5  && x<=25){
            if (x<=15){
                System.out.println("Sıcaklık " + x + " Derece Sinemaya Gidebiliriz.");
            }
            if (x>=10){
                System.out.print("Sıcaklık " + x + " Derece Pikniğe Gidebiliriz.");
            }

        } else {
            System.out.print("Sıcaklık " + x + " Derece Yüzmeye Gidebiliriz.");
        }

    }
}
