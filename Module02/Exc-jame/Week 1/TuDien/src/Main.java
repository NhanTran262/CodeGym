import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("!", "exclamation");
        dictionary.put("I", "Tôi");
        dictionary.put("want", "muốn");
        dictionary.put("to", "đến");
        dictionary.put("sleep", "ngủ");
        dictionary.put("you", "bạn");
        dictionary.put("tonight", "tối nay");

        System.out.println("Nhập câu chữ cần dịch: ");
        String input = sc.nextLine();

        String[] words = input.split("\\W+");
        StringBuilder translatedText = new StringBuilder();

        for (String word : words) {
            String translatedWord = dictionary.get(word);
            if (translatedWord != null) {
                translatedText.append(translatedWord).append(" ");
            } else {
                System.out.println("Không tìm thấy từ '" + word + "'trong từ điển.Nhập định nghĩa mới: ");
                String newDefinition = sc.nextLine();
                dictionary.put(word, newDefinition);
                translatedText.append(newDefinition).append(" ");
            }

        }
        System.out.println("Đoạn chữ đã dịch: " + translatedText.toString().trim());
        sc.close();


    }
}