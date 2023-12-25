package com.company.luviel19.exam.exam02;

public class GameApp {
    Start startGame = new Start();
    GameApp linkGameApp;
    Paragraph gameState = new Text().getFox();


    private boolean isStartingGame = false;
    int userAnswer;
    UtilsMethod utilsMethod = new UtilsMethod();
    public void getLink(GameApp gameApp) {
        linkGameApp = gameApp;
    }

    public void start() {

        OperationExecutor operationExecutor = new OperationExecutor();
        operationExecutor.executeOperation(startGame);

        userAnswer = utilsMethod.scanner();

        if (userAnswer == 1) {
            if(gameState != null) System.out.println("начать игру = " + gameState.getName());
            isStartingGame = true;
            utilsMethod.drowParagraph(gameState, linkGameApp);
        } else if (userAnswer == 2) {
            if(gameState != null) System.out.println("Загрузить игру = " + gameState.getName());
            isStartingGame = true;
            utilsMethod.drowParagraph(gameState, linkGameApp);
        } else if (userAnswer == 3) {
            if(isStartingGame){
                System.out.println("Игра сохранена");
            } else{
                System.out.println("Вы вышли из игры");
                return;
            }

            if(gameState != null) System.out.println("сохранить игру" + this.gameState.getName());

            linkGameApp.start();
        } else if (userAnswer == 4 && isStartingGame == true) {
            System.out.println("Вы вышли из игры");
            return;
        } else if (userAnswer == 4 && isStartingGame == false) {
            System.out.println("Не верная команда. Начните игру снова");
            isStartingGame = true;
            linkGameApp.start();
        }


    }

}