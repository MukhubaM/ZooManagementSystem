import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        boolean running = true;

        System.out.println("Welcome to MIE Zoo Management System");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View Animals");
            System.out.println("2. Add Animal");
            System.out.println("3. Search Animal");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> zoo.viewAnimals();
                    case 2 -> zoo.addAnimal(scanner);
                    case 3 -> zoo.searchAnimal(scanner);
                    case 4 -> {
                        System.out.println("Exiting... Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        scanner.close();
    }
}
