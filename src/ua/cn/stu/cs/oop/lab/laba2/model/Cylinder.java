package ua.cn.stu.cs.oop.lab.laba2.model;

public class Cylinder { //циліндричний брус
    private Wood wood;
    private float height;
    private float radius;

    public Cylinder(Wood wood, float height, float radius) {
        this.wood = wood;
        this.height = height;
        this.radius = radius;
    }

    public Wood getWood() {
        return wood;
    }

    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

    public float volume() {
        return (float) (height * Math.pow(radius, 2) * Math.PI);
    }

    public float weight() {
        return wood.getDensity() * volume();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "wood=" + wood +
                ", volume=" + volume() +
                ", weight=" + weight() +
                '}';
    }
}
