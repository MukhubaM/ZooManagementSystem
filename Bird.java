public class Bird extends Animal {
    public Bird(String name) {
        super(name, "Bird");
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String eat() {
        return "Seeds and insects";
    }

    @Override
    public String color(){
        return  "Black and gold";
    }

    @Override
    public String sleep(){
        return "Night-time";
    }

    @Override
    public String hunt(){
        return "Hunts";
    }

    @Override
    public String graze(){
        return "Grazes";
    }

}
