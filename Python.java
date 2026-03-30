public class Python extends Animal {
    public Python(String name){
        super(name, "Python");
    }

    @Override
    public String makeSound(){
        return "Hissing";
    }

    @Override
    public String eat(){
        return "Rodents, birds and lizards";
    }

    @Override
    public String color(){
        return "Brown-camouflage";
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
