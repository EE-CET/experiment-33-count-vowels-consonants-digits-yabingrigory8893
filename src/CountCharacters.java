import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String s = sc.nextLine();

            int vowels = 0, consonants = 0, digits = 0, special = 0;
            String v = "aeiouAEIOU";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    digits++;
                } else if (Character.isLetter(ch)) {
                    if (v.indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else {
                    special++;
                }
            }

            System.out.println(vowels + " " + consonants + " " + digits + " " + special);
        }
    }
}
