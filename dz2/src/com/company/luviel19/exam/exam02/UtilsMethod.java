package com.company.luviel19.exam.exam02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilsMethod {

    OperationExecutor operationExecutor = new OperationExecutor();

    Paragraph currentParagraph;
    Text data = new Text();

    String gameState = "";

    int userAnswer;

    private String paragraphName = "";


    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }


    public String getParagraphName() {
        return paragraphName;
    }

    public void setParagraphName(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public void drowParagraph(Paragraph paragraph, GameApp gameApp) {

        currentParagraph = paragraph;
        System.out.println("currentParagraph = " + currentParagraph.getName());
        while (true) {
            System.out.println(currentParagraph.getText());
            if (currentParagraph.getName() == "end_game" || currentParagraph.answer_1.getName() == "end_game"
                    || currentParagraph.answer_2.getName() == "end_game") {
                System.out.println("Игра закончилась");
                return;
            }
            int answer = scanner();
            if (answer == 1) {

                currentParagraph = currentParagraph.answer_1;

            } else if (answer == 2) {

                currentParagraph = currentParagraph.answer_2;
            } else if (answer == 3) {
                operationExecutor.executeOperation(new Save(currentParagraph, gameApp));


            }
            System.out.println("currentParagraph in while = " + currentParagraph.getName());
        }
    }


    public int scanner() {
        int userAnswer = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выбора введите цифру выбранного пункта меню.");
        try {
            userAnswer = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println(exception.fillInStackTrace());

        }
        return userAnswer;
    }
}