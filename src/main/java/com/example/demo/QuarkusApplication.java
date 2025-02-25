package com.example.demo;

@QuarkusMain
public class QuarkusApplication extends QuarkusApplication {

    public static void main(String... args) {
        Quarkus.run(DemoApplication.class, args);
    }
}
