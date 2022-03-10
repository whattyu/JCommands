package net.jcommands.util;

@FunctionalInterface
public interface Traceable<T, R, E, F> {
    void accept(T t, R r, E e, F f);
}
