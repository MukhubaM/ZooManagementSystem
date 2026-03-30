public class Gorilla extends Animal {
    public Gorilla(String name) {
        super(name, "Gorilla");
    }

    @Override
    public String makeSound() {
        return "Grunt";
    }

    @Override
    public String eat() {
        return "Fruits, leaves and stems";
    }

    @Override
    public String color(){
        return "Black";
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
