public class Bear extends Animal {
    public Bear(String name) {
        super(name, "Bear");
    }

    @Override
    public String makeSound() {
        return "Roar!!!";
    }

    @Override
    public String eat() {
        return "Fish, berries and honey";
    }

    @Override
    public String color(){
        return "Brown";
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

