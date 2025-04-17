public class MainVehicle {
    public static void main(String[] args) {
        Car myCar = new Car(5);
        myCar.start(); // Wywołanie przesłoniętej metody start()
        myCar.stop();  // Wywołanie przesłoniętej metody stop()
        System.out.println("Liczba miejsc: " + myCar.getNumberOfSeats());
    }
}