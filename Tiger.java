public class Tiger extends Animal {
    public Tiger(String name) {
        super(name, "Tiger");
    }

    @Override
    public String makeSound() {
        return "Growl";
    }

    @Override
    public String eat() {
        return "Meat";
    }

    @Override
    public String color(){
        return "Orange and black";
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
