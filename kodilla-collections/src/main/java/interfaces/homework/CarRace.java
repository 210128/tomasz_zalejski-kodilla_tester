package interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Audi audi = new Audi(200);
        doRace(audi);
        Mazda mazda = new Mazda(230);
        doRace(mazda);
        Kia kia = new Kia(180);
        doRace(kia);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

}
