public class Wolf extends Animal {
    public Wolf(String name) {
        super(name, "Wolf");
    }

    @Override
    public String makeSound() {
        return "Howl";
    }

    @Override
    public String eat() {
        return "Meat";
    }

    @Override
    public String color(){
        return  "Gray and white";
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
