import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentManagement documentManagement = new DocumentManagement();
        System.out.println("App DocumentManagement");
        System.out.println("Select 1: Insert new document");
        System.out.println("Select 2: Delete document");
        System.out.println("Select 3: Show infor document");
        System.out.println("Select 4: Search document");
        System.out.println("Select 5: Exit");
        Integer choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:

        }
    }
}
