package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String stamped; /*TODO: Review kdrzazga: Should be boolean*/
    private double width;
    private double hight;

    public Stamp(String name, String stamped, double width, double hight) {
        this.name = name;
        this.stamped = stamped;
        this.width = width;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public String getStamped() {
        return stamped;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.hight, hight) == 0 &&
                Objects.equals(name, stamp.name) &&
                Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stamped, width, hight);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", stamped='" + stamped + '\'' +
                ", width=" + width +
                ", hight=" + hight +
                '}';
    }
}
