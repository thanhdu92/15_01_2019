import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishToVietnamese {
    public static void main(String[] args) {
        Map<String,String> englVietDictionary=new HashMap<>();

        englVietDictionary.put("monday","thứ Hai");
        englVietDictionary.put("tuesday","thứ Ba");
        englVietDictionary.put("wednesday","thứ Tư");
        englVietDictionary.put("thursday","thứ Năm");
        englVietDictionary.put("friday","thứ Sáu");
        englVietDictionary.put("saturday","thứ Bảy");
        englVietDictionary.put("sunday","Chủ Nhật");

        System.out.println("Which word you want to translate to Vietnamese? ");
        Scanner scanner=new Scanner(System.in);
        String inputWord= scanner.nextLine();

        if (englVietDictionary.containsKey(inputWord)){
            System.out.println("It mean: "+englVietDictionary.get(inputWord));
        }else {
            System.out.println("Word not found!");
        }
    }
}
