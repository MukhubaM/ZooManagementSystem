public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name, "Giraffe");
    }

    @Override
    public String makeSound(){
        return "Whinny";
    }

    @Override
    public String eat(){
        return "Leaves, grass and shrubs";
    }

    @Override
    public String color(){
        return "Light brown";
    }

    @Override
    public String sleep(){
        return "Daytime";
    }

    @Override
    public String graze(){
        return "Grazes";
    }
}
