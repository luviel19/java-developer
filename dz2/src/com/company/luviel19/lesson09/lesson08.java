package com.company.luviel19.lesson09;

public class lesson08 {
    Departament departament01 = new Departament(); // директор
    Departament departament02 = new Departament();
    Departament departament03 = new Departament();
    Departament departament04 = new Departament();
    Departament departament05 = new Departament();
    departament02.setHead(departament01);
     departament03.setHead(departament02);
      departament04.setHead(departament02);
      departament05.setHead(departament01);
}

class Departament {
    private String name;
    //кол-во сотрудников
    private int staff;
    //подчинение
    private Departament head;
}

