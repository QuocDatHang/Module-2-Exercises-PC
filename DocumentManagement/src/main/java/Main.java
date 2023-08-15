import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentManagement documentManagement = new DocumentManagement();

        Document book = new Book("A1", "kimdong", 5000, "John", 240);
        Document journal = new Journal("A2", "lacviet", 4000, 12, 5);
        Document newspaper = new Newspaper("A3", "dantri", 3000, LocalDate.of(2023, 12, 23));

        System.out.println("App DocumentManagement");
        System.out.println("Select 1: Insert new document");
        System.out.println("Select 2: Delete document");
        System.out.println("Select 3: Show info document");
        System.out.println("Select 4: Search document");
        System.out.println("Select 5: Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1: {
                System.out.println("Choose type of document: ");
                System.out.println("Select a: Book");
                System.out.println("Select b: Journal");
                System.out.println("Select c: Newspaper");
                String option = scanner.nextLine();
                switch (option) {
                    case "a": {
                        System.out.println("Enter id :");
                        String id = scanner.nextLine();
                        System.out.println("Enter publisher :");
                        String publisher = scanner.nextLine();
                        System.out.println("Enter releaseNumber :");
                        int releaseNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter authorName :");
                        String authorName = scanner.nextLine();
                        System.out.println("Enter numberPaper :");
                        int numberPaper = Integer.parseInt(scanner.nextLine());
                        Document book1 = new Book(id, publisher, releaseNumber, authorName, numberPaper);
                        documentManagement.addDocument(book1);
                        documentManagement.showInfo();
                        break;
                    }
                    case "b": {
                        System.out.println("Enter id :");
                        String id = scanner.nextLine();
                        System.out.println("Enter publisher :");
                        String publisher = scanner.nextLine();
                        System.out.println("Enter releaseNumber :");
                        int releaseNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter issueNumber :");
                        int issueNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter monthIssue :");
                        int monthIssue = Integer.parseInt(scanner.nextLine());
                        Document journal1 = new Journal(id, publisher, releaseNumber, issueNumber, monthIssue);
                        documentManagement.addDocument(journal1);
                        documentManagement.showInfo();
                        break;
                    }
                    case "c": {
                        System.out.println("Enter id :");
                        String id = scanner.nextLine();
                        System.out.println("Enter publisher :");
                        String publisher = scanner.nextLine();
                        System.out.println("Enter releaseNumber :");
                        int releaseNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter dayIssue :");
                        String dayIssue1 = scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                        LocalDate dayIssue = LocalDate.parse(dayIssue1, formatter);
                        Document newspaper1 = new Newspaper(id, publisher, releaseNumber, dayIssue);
                        documentManagement.addDocument(newspaper1);
                        documentManagement.showInfo();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Enter id to remove : ");
                String id = scanner.nextLine();
                boolean flag = documentManagement.deleteDocument(id);
                while (!flag) {
                    System.out.println("Can not find id to remove!");
                }
                System.out.println("Delete success");
            }
            break;
        }
    }
}
}
