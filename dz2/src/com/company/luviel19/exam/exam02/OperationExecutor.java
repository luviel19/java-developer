package com.company.luviel19.exam.exam02;

import java.util.HashMap;
import java.util.Map;

public class OperationExecutor {
    private Map<String, Command> commandMap = new HashMap<>();

    public void executeOperation(Command command) {
        command.execute();
    }
}