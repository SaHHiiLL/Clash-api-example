package com.github.SaHHiiLL;

import com.lycoon.clashapi.core.ClashAPI;
import com.lycoon.clashapi.core.exception.ClashAPIException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ClashAPIException, IOException {
        System.out.println("Hello world!");
        ClashAPI c = new ClashAPI("email", "password");
        System.out.println(c.getPlayer("2pp").getName());
    }
}