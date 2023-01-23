package com.etiya.ecommerce;

public class FileLogger implements Logger{

    @Override
    public void log() {
        System.out.println("File'a loglandı.");
    }
}
