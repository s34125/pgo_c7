public class Car extends Venice {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Silnik samochodu został uruchomiony");
    }

    @Override
    public void stop() {
        System.out.println("Silnik samochodu został wyłączony");
    }
}