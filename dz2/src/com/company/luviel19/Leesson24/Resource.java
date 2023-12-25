package com.company.luviel19.Leesson24;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.io.IOException;

public class Resource implements AutoCloseable {
    public void resourceVoid() throws IOException{
        throw new IOException();
    }
    public void resourceVoid01() throws IOException{
        resourceVoid();
    }
    @Override
    public void close(){
        System.out.println("Логика связанная с закрытие роесурсов");
    }
}
