package org.acme;

import io.quarkiverse.githubaction.Action;

public class MyAction {

    @Action
    void test() {
        System.out.println("Hello from Quarkus GitHub Action");
    }
}