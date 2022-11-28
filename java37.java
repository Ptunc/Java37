package Java37;

import java.util.Scanner;

public class java37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sonuc;
        System.out.print("N sayısı: ");
        sayi = input.nextInt();
        int temp = sayi;
        sonuc = desen(temp);
        if(sonuc <= 0) desen2(sonuc, sayi);
    }
    static int desen(int temp) {
        System.out.print(temp + " "); 
        if (temp <= 0) return temp;
        else return desen(temp - 5);
                
    }
    static int desen2(int sonuc, int sayi) {
        if (sonuc <= 0) System.out.print("");
        else if(sonuc != sayi) System.out.print(sonuc + " ");
        if (sonuc == sayi) {System.out.print(sonuc + " "); return 0;}
        return desen2(sonuc + 5, sayi);
    }
}

