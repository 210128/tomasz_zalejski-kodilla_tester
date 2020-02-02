package interfaces.homework;

public class Audi implements Car {
    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 19;
    }
}
