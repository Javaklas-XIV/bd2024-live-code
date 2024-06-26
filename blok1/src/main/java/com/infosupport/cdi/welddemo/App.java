package com.infosupport.cdi.welddemo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class App {

    @Inject // 1: field injection
    private Screen screen;

    public App() {
    }

    void start() {
        this.screen.print();
    }
}
