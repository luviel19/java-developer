package com.company.luviel19.exam.exam02;

public class Save implements Command{

    Paragraph paragraph;
    GameApp gameApp;

public Save(Paragraph paragraph, GameApp gameApp){
    this.paragraph = paragraph;
    this.gameApp= gameApp;
};
    @Override
    public void execute() {
        gameApp.gameState = paragraph;
        gameApp.start();

    }
}