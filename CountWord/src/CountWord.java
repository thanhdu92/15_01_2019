import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> frequency=new HashMap<>();
        
        System.out.println("Enter your string: ");
        String line = scanner.nextLine();
        String[] words=line.split(" ");

        for (String word :
                words) {
            String lowerCaseWord=word.toLowerCase()
                    .replace(",","");

            if (frequency.containsKey(lowerCaseWord)){
                frequency.put(lowerCaseWord,frequency.get(lowerCaseWord)+1);
            }else {
                frequency.put(lowerCaseWord,1);
            }
        }

        System.out.println(frequency);
    }
}
