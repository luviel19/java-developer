package com.company.luviel19.lesson10HomeWorks.images;

public class Gallery implements Drawable {
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
    public Gallery clone(){
        // копия Order, массивов и элементов массивов
        Drawable[] drawables1 = new Drawable[drawables.length];
        for (int i = 0; i < drawables1.length; i++) {
            drawables1[i] = drawables[i].clone();
        }
        return new Gallery(drawables1);

}