package com.etiya.ecommerce;

public class ConsoleLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Console'a loglandı..");
    }
}
