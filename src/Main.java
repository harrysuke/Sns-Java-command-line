import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VEPOperations vepOperations = new VEPOperations();

        int choice = 0;
        System.out.println("Welcome to Safety and Security system");

        while (choice != 6){
            System.out.println("SNS Main Menu\n");
            System.out.println("Please choose from the menu below:\n");
            System.out.println("1. Create new VEP (vehicle entry permit)\n");
            System.out.println("2. View all VEP records\n");
            System.out.println("3. Update existing VEP record\n");
            System.out.println("4. Search VEP records\n");
            System.out.println("5. Delete VEP record\n");
            System.out.println("6. Exit from SNS\n");
            System.out.println("Enter your choice:\n");

            try{
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Performing create new record operation...\n");
                        vepOperations.create();
                        break;
                    case 2:
                        System.out.println("Performing view record operation...");
                        vepOperations.read();
                        break;
                    case 3:
                        System.out.println("Performing udpate operation...");
                        vepOperations.update();
                        break;
                    case 4:
                        System.out.println("Performing search operation...");
                        vepOperations.search();
                        break;
                    case 5:
                        System.out.println("Performing delete operation...");
                        vepOperations.delete();
                        break;
                    case 6:
                        System.out.println("Exiting SNS...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number");
                }
            }catch (Exception e){
                System.out.println("Invalid input. Please enter a number");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}