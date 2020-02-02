package interfaces.homework;

public class Mazda implements Car {
    private int speed;

    public Mazda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 25;
    }
}
