package org.acme;

import java.io.IOException;

import org.kohsuke.github.GHEventPayload;

import io.quarkiverse.githubaction.Action;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubapp.event.Issue;

public class MyAction {

    @Action
    void test(@Issue.Opened GHEventPayload.Issue issuePayload, Commands commands) throws IOException {
        System.out.println("Hello from Quarkus GitHub Action");

        commands.appendJobSummary("# Hi from Quarkus GitHub Action");

        commands.error("There was an error");

        issuePayload.getIssue().comment("Hi from our action");
    }
}