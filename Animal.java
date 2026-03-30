public class Animal {
    private String name;
    private String species;


    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    //No longer being called after final updates | Dead code
    /*
    public String getSpecies() {
        return species;
    } */

    public String makeSound() {
        return "Generic animal sound";
    }

    public String eat(){
        return "Generic food";
    }

    public String color(){
        return "Generic color";
    }

    public String sleep(){
        return "Generic sleeping pattern";
    }

    //This a method for animals that hunt
    public String hunt(){
        return "Does not hunt";     //Default implementations
    }

    //This a method for animals that graze
    public String graze(){
        return "Does not graze";    //Default implementations
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Species: " + species
                + ", Sound: " + makeSound()
                + ", Eats: " + eat()
                + ", Color: " + color()
                + ", Sleep: " + sleep()
                + ", " + hunt() + ", " + graze();
    }
}
