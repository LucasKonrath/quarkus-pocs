package com.example.demo;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class QuarkusApp implements QuarkusApplication {

    public static void main(String... args) {
        Quarkus.run(QuarkusApp.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        return 0;
    }
}
