public class Elephant extends Animal {
    public Elephant(String name) {
        super(name, "Elephant");
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }

    @Override
    public String eat() {
        return "Grass, fruits and plants";
    }

    @Override
    public String color(){
        return "Grey";
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
