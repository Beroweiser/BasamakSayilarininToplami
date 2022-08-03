/**
 * BasamakSayilarininToplami
 */
import java.util.Scanner;

public class BasamakSayilarininToplami {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,i,result = 0;
        System.out.print("Sayi giriniz : ");
        number = inp.nextInt();

        while (number != 0){
            i = number % 10;
            result += i;
            number /= 10;
        }
        System.out.println("Basamak Sayılarının toplamı : " + result);
        inp.close();

    }
}