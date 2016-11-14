package itello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String v = in.nextLine();
        if (v.equals("")) {
            System.out.println(v);
        } else {
            String encryptionToString = getEveryOtherEncryption(v);
            System.out.println(encryptionToString);
        }
    }

    static String getEveryOtherEncryption(String v) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        v = v.replaceAll("[^\\p{Alnum}^åÅäÄöÖ]", "");
        for (int currentIndex = 0; currentIndex < v.length(); currentIndex++) {
            char currrentLetter = v.charAt(currentIndex);
            if ((currentIndex % 2) == 0) {
                string1.append(currrentLetter);
            } else {
                string2.append(currrentLetter);
            }
        }
        return string1.toString() + string2.toString();
    }
}
