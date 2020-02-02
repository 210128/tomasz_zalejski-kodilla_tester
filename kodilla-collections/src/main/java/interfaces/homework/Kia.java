package interfaces.homework;

public class Kia implements Car {
    private int speed;

    public Kia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 13;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }
}
