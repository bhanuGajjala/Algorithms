package com.learning.java8features;

@FunctionalInterface
public interface Addition<T, R> {

    public T execute(T t, R r);
}
