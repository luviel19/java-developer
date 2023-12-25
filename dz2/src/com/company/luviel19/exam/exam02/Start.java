package com.company.luviel19.exam.exam02;



public class Start implements Command {
    OperationExecutor operationExecutor = new OperationExecutor();
    UtilsMethod utilsMethod = new UtilsMethod();
    private boolean isStartingGame = false;

    public void setStartingGame(boolean startingGame) {
        isStartingGame = startingGame;
    }

    public boolean isStartingGame() {
        return isStartingGame;
    }

    @Override
    public void execute() {

        System.out.println("Игра запустилась!.");
        System.out.println("isStartingGame = " + isStartingGame);
        if (isStartingGame) {
            System.out.println("Выберите вариант:\n" +

                    "1. Начать игру\n" +
                    "2. Загрузить игру\n" +
                    "3. Сохранить игру \n" +
                    "4. Выйти из игры\n"
            );
        } else {

            System.out.println("Выберите вариант:\n" +

                    "1. Начать игру\n" +
                    "2. Загрузить игру\n" +
                    "3. Выйти из игры\n");

        }
        isStartingGame = true;
    }
}