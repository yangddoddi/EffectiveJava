package com.example.effectivejava.chapter3.item10.rule2;

// 추이성이 깨진다
public class ColorPoint extends Point {
    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color=color;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint)) {
            return false;
        }
        return ((ColorPoint) obj).color == color && super.equals(obj);
        // colorPoint면 정상적으로 비교, Point면 false
        // Point에서는 모두 비교.
    }

    public boolean equals2(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        // ColorPoint a = new ColorPoint(2,2,"Red");
        // Point b = new Point(2,2);
        // ColorPoint c = new ColorPoint(2,2,"Blue);

        return ((ColorPoint) obj).color == color && super.equals(obj);
        // colorPoint면 정상적으로 비교, Point면 false
        // Point에서는 모두 비교.
    }
}
