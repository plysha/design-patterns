package org.patterns.behavioral.chainof;

/**
 * Базовый класс цепочки.
 */
public abstract class Middleware {
    private Middleware next;

    /**
     * Помогает строить цепь из объектов-проверок.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    /**
     * Подклассы реализуют в этом методе конкретные проверки.
     */
    public abstract boolean check(String email, String password);

    /**
     * Запускает проверку в следующем объекте или завершает проверку, если мы в
     * последнем элементе цепи.
     */
    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }

        return next.checkNext(email, password);
    }
}
