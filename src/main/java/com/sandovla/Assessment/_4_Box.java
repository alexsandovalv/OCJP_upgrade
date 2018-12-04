package com.sandovla.Assessment;

import java.security.SecureRandom;

public class _4_Box<T> {

    T value;

    public _4_Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public static void main(String ... arg){
        _4_Box<String> one = new _4_Box<String>("a string");
        _4_Box<Integer> tow = new _4_Box<>(123);
        System.out.print(one.getValue());
        System.out.print(tow.getValue());
    }

}
