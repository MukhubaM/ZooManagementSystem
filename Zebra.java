public class Zebra extends Animal {
    public Zebra(String name) {
        super(name, "Zebra");
    }

    @Override
    public String makeSound() {
        return "Neigh";
    }

    @Override
    public String eat() {
        return "Grass";
    }

    @Override
    public String color(){
        return "Black and white";
    }

    @Override
    public String sleep(){
        return "Night-time";
    }

    @Override
    public String graze(){
        return "Grazes";
    }
}
