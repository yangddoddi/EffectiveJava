package com.example.effectivejava.chapter2.item2;

public class Burger {
    private final int bread;
    private final int patty;
    private final int onion;
    private final int tomato;
    private final int lettuce;
    private final int source;

    public Burger(BurgerBuilder builder) {
        this.bread = builder.bread;
        this.patty = builder.patty;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
        this.lettuce = builder.lettuce;
        this.source = builder.source;
    }

    public static class BurgerBuilder {
        private int bread = 0;
        private int patty = 0;
        private int onion = 0;
        private int tomato = 0;
        private int lettuce = 0;
        private int source = 0;

        public BurgerBuilder bread(int n) {
            this.bread = n;
            return this;
        }

        public BurgerBuilder patty(int n) {
            this.patty = n;
            return this;
        }

        public BurgerBuilder onion(int n) {
            this.onion = n;
            return this;
        }

        public BurgerBuilder tomato(int n) {
            this.tomato = n;
            return this;
        }

        public BurgerBuilder lettuce(int n) {
            this.lettuce = n;
            return this;
        }

        public BurgerBuilder source(int n) {
            this.source = n;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

    public static void main(String[] args) {
        Burger burger = new BurgerBuilder()
                .bread(3)
                .lettuce(2)
                .patty(2)
                .onion(1)
                .source(1)
                .tomato(2)
                .build();
    }
}
