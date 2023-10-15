public class Horse extends PackedAnimals {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Иго-го!");
    }
}
