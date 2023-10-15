public class Cat extends HomeAnimals{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
}
