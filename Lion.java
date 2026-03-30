public class Lion extends Animal {
    public Lion(String name) {
        super(name, "Lion");
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String eat() {
        return "Meat";
    }

    @Override
    public String color(){
        return "Golden brown";
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
