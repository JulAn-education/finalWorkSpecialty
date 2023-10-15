public class Hamster extends HomeAnimals{

    public Hamster(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Пи!");
    }
}
