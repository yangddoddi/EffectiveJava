package com.example.effectivejava.chapter3.item10.rule2;

import java.util.Set;

public class CounterPointTest {
    private static final Set<Point> unitCircle = Set.of(
            new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(1, -1)
    );

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static void main(String[] args) {
        Point point = new Point(1, 0);
        CounterPoint counterPoint = new CounterPoint(1, 0);

        System.out.println(onUnitCircle(point));
        System.out.println(onUnitCircle(counterPoint));
    }
}
