import java.util.ArrayList;  //Thought importing an asterisk would be a bad approach
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.print("Enter animal species [Lion|Elephant|Bird|Zebra|Hyena|Wolf|Tiger|Bear|Gorilla|Giraffe|Python]: ");
        String species = scanner.nextLine().trim().toLowerCase();

        Animal animal;
        switch (species) {
            case "lion" -> animal = new Lion(name);
            case "elephant" -> animal = new Elephant(name);
            case "bird" -> animal = new Bird(name);
            case "zebra" -> animal = new Zebra(name);
            case "hyena" -> animal = new Hyena(name);
            case "wolf" -> animal = new Wolf(name);
            case "tiger" -> animal = new Tiger(name);
            case "bear" -> animal = new Bear(name);
            case "gorilla" -> animal = new Gorilla(name);
            case "giraffe" -> animal = new Giraffe(name);
            case "python" -> animal = new Python(name);
            default -> {
                System.out.println("Unknown species! Adding as generic animal.");
                animal = new Animal(name, species);
            }
        }

        animals.add(animal);
        System.out.println("Animal added successfully!");
    }

    public void viewAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("\nAnimal List: ");
            System.out.println();
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    public void searchAnimal(Scanner scanner) {
        System.out.print("Enter animal name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + animal);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Animal not found!");
        }
    }
}
