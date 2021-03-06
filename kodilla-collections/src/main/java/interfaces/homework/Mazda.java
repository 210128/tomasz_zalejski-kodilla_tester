package interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mazda mazda = (Mazda) o;
        return speed == mazda.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
