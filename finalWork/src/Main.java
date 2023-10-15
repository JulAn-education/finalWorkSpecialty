import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Animals> list = new ArrayList<>();
            while (true) {
                System.out.println("1.Добавить новое животное ");
                System.out.println("2.Список команд , которое выполняет животное");
                System.out.println("3.Обучить животное новым командам ");
                System.out.println("4.Выход");
                int ans = scanner.nextInt();
                if (ans == 1) {
                    System.out.println("Введите кличку животного ");
                    String name = scanner.next();
                    System.out.println("Введите категорию животного (Home or Pack):");
                    String type = scanner.next();
                    if (type.equalsIgnoreCase("Home")) {
                        System.out.println("Введите тип животного(dog, cat, hamster): ");
                        String animalType = scanner.next();
                        if (animalType.equalsIgnoreCase("dog")) {


                            list.add(new Dog(name));
                        } else if (animalType.equalsIgnoreCase("cat")) {
                            list.add(new Cat(name));
                        } else if (animalType.equalsIgnoreCase("hamster")) {
                            list.add(new Hamster(name));
                        } else {
                            System.out.println("Несуществующий класс.");
                        }
                    } else if (type.equalsIgnoreCase("Pack")) {
                        System.out.println("Введите тип животного(horse, camel, donkey): ");
                        String animalType = scanner.next();
                        if (animalType.equalsIgnoreCase("Horse")) {
                            list.add(new Horse(name));
                        } else if (animalType.equalsIgnoreCase("camel")) {
                            list.add(new Camel(name));
                        } else if (animalType.equalsIgnoreCase("donkey")) {
                            list.add(new Donkey(name));
                        } else {
                            System.out.println("Несуществующий тип.");
                        }
                    }


                } else if (ans == 2) {
                    System.out.println("Введите кличку животного");
                    String name = scanner.next();
                    for (Animals animal : list) {
                        if (animal.getName().equalsIgnoreCase(name)) {

                            animal.getListCommand().forEach(System.out::println);
                            break;
                        }

                    }
                } else if (ans == 3) {
                    System.out.println("Введите кличку животного");
                    String name = scanner.next();
                    for (Animals animal : list) {
                        if (animal.getName().equalsIgnoreCase(name)) {
                            System.out.println("Введите новую команду ");
                            String command = scanner.next();

                            animal.getListCommand().add(command);
                        }
                    }

                }
                else if (ans == 4){
                    System.exit(0);
                }
            }
        }
    }

}
