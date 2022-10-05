package com.example.effectivejava.chapter3.item10.rule2.after;

import com.example.effectivejava.chapter3.item10.rule2.Point;

import java.util.Objects;

public class ColorPoint2 {
    private final Point point;
    private final String color;

    public ColorPoint2(Point point, String color) {
        this.point = point;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint2 that = (ColorPoint2) o;
        return Objects.equals(point, that.point) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, color);
    }
}
