public class Donkey extends PackedAnimals{

    public Donkey(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Иа!");
    }
}
