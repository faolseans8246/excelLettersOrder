import java.util.*;

public class Main {

    // Berilgan harf yordamida uning joylashuv o'rnini aniqlab berish qismi
    public int lengthOfLastWord(String s) {

        int len = s.length() - 1;
        int result = 0;
        int roomNumber = 26;


        // Harflarni tahlil qilish qismi
        for (int i = 0; i < len; i ++) {

            // Harf natijasini chiqarish
            result += (roomNumber * Math.pow(letterToNumber(s.charAt(i)), (len - i)));

        }


    // Natijani foydalanuvchiga yuborish
        return result + letterToNumber(s.charAt(len));

    }

    // Bazaviy harf pozitsiyasi
    public static int letterToNumber (char a) {

        int num = 0;

        // Berilgan harf qismini tanlash qismi
        switch (a) {
            case 'A': num = 1; break;
            case 'B': num = 2; break;
            case 'C': num = 3; break;
            case 'D': num = 4; break;
            case 'E': num = 5; break;
            case 'F': num = 6; break;
            case 'G': num = 7; break;
            case 'H': num = 8; break;
            case 'I': num = 9; break;
            case 'J': num = 10; break;
            case 'K': num = 11; break;
            case 'L': num = 12; break;
            case 'M': num = 13; break;
            case 'N': num = 14; break;
            case 'O': num = 15; break;
            case 'P': num = 16; break;
            case 'Q': num = 17; break;
            case 'R': num = 18; break;
            case 'S': num = 19; break;
            case 'T': num = 20; break;
            case 'U': num = 21; break;
            case 'V': num = 22; break;
            case 'W': num = 23; break;
            case 'X': num = 24; break;
            case 'Y': num = 25; break;
            case 'Z': num = 26; break;
            default: num = 0;
        }

        // natijani tanlash
        return num;

    }

    public static void main(String[] args) {

        Main mn = new Main();
        Scanner scan = new Scanner(System.in);

        // Namunani kiritish
        System.out.print("Enter excel letter: ");
        String exel_column_latter = scan.nextLine();


        // Natijani olish qismi
        int order_letter = mn.lengthOfLastWord(exel_column_latter);
        System.out.println("Your excel order: " + order_letter);

    }
}