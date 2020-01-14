import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree a = new BinarySearchTree();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        System.out.println("Which number you want to check");
        Scanner scanner=new Scanner(System.in);

        int input=scanner.nextInt();
        System.out.println(a.ifNodePresent(root, input));
    }
}
