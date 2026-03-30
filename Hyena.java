public class Hyena extends Animal {
    public Hyena(String name) {
        super(name, "Hyena");
    }

    @Override
    public String makeSound() {
        return "Laugh";
    }

    @Override
    public String eat() {
        return "Meat and carrion";
    }

    @Override
    public String color(){
        return "Yellowish-brown";
    }

    @Override
    public String sleep(){
        return "Daytime";
    }

    @Override
    public String hunt(){
        return "Hunts";
    }
}
