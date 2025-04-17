public class MainAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Lion();

        System.out.println("Kot: " + cat.makeNoise());
        System.out.println("Pies: " + dog.makeNoise());
        System.out.println("Lew: " + lion.makeNoise());

        // Wywołanie metody room() dla rodziny kocich
        Felidae felidaeCat = (Felidae) cat;
        System.out.println("Kot: " + felidaeCat.room());

        Canidae canidaeDog = (Canidae) dog;
        System.out.println("Pies: " + canidaeDog.room());
    }
}