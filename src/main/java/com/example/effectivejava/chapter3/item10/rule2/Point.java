package com.example.effectivejava.chapter3.item10.rule2;

// 추이성이 깨진다
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return point.x == x && point.y == y;
    }

    // 리스코프 치환원칙 위배
    public boolean equals2(Object obj) {
        if ( obj == null || obj.getClass() != getClass() ) {
            return false;
        }
        Point p = (Point)obj;
        return p.x == x && p.y == y;
    }
}
