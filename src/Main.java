public class Main {
    public static void main(String[] args) {
        // Test Chicken
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        System.out.println(animals[0].makeSound());
        System.out.println(animals[1].makeSound());

        Edible edible = (Chicken) animals[0];
        System.out.println(edible.howToEat());

        // Test Fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
