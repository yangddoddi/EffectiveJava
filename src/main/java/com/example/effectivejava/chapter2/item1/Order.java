package com.example.effectivejava.chapter2.item1;

/*
*
* 장점
* 1. 같은 인자를 이용한 생성도 구별할 수 있음.
*
*
* */

import com.example.effectivejava.chapter2.item1.appendix.OrderStatus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order {
    private Long id;
    private Product product;
    private boolean prime;
    private boolean urgent;

    private OrderStatus orderStatus = OrderStatus.DELIVERED;

    /*
    public Order(Long id, Product product) {
        this.id = id;
        this.product = product;
    }

    기본 생성자를 사용할 경우 같은 타입이 들어간 생성자를 필요에 맞게 분류해서 사용할 수 없음.
    혹은 생성자 순서를 바꾸면 다른 생성자로 인식시킬 수 있으나 이는 개발자가 직관적으로 해당 생성자가 어떤 의도로 만들어진 것인지 알 수 없음.
    */

    public static Order primeOrder(Product product) {
        Order order = new Order(); // 위에 생성자 해제했으니 당연히 기본 생성자는 필요 x
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Arrays.stream(OrderStatus.values())
                .forEach(
                        e -> {
                            System.out.println(e);
                            System.out.println(e.getCode());
                            System.out.println(e.getMessage());
                        }
                );

        System.out.println(OrderStatus.PREPARING.getCode());

        System.out.println(OrderStatus.PREPARING == OrderStatus.DELIVERED);
        System.out.println(OrderStatus.PREPARING == OrderStatus.PREPARING);

        List<Integer> list = new java.util.ArrayList<>(List.of(1, 4, 3, 2, 2, 5, 6));

        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        list.sort(desc);

        System.out.println(list);

        list.sort(desc.reversed());

        System.out.println(list);
    }

}
