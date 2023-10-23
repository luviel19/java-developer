package com.company.luviel19.lesson10HomeWorks.images;

public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable) {
        this.drawable = drawable;
    }

    public void show() {
        drawable.draw();
    }

    @Override
    protected Editor clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}