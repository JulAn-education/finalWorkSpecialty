public class Dog extends HomeAnimals {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Гав!");
    }
}
