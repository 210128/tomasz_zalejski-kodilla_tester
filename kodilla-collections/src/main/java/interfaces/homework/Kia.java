package interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
