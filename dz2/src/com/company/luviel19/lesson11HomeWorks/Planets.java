package com.company.luviel19.lesson11HomeWorks;

public enum Planets {
    Mercury(4879,330,"Меркурий"),

    Venus(12103,4868,"Венера"),
    Earth(12742,5973,"Земля"),
    Mars(6780,641,"Марс"),
    Jupiter(139822,1898600,"Юпитер"),
    Saturn(116464,568460,"Сатурн"),
    Uranus(50724,86832,"Уран"),
    NeptuneNeptune(49244,102430,"Нептун");

    @Override
    public String toString() {
        return
                "Название Планеты = " + name +
        ", Диаметр Планеты = " + diametre +
                ", Вес = " + weight
                ;
    }

    private double diametre;
    private String  name;


        Planets(double diametre, double weight,String name) {
            this.diametre = diametre;
            this.weight = weight;
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiametre() {
        return diametre;
    }

        this.diametre = diametre;
    }

    public double getWeight() {
        return weight;
    }

        this.weight = weight;
    }

}
