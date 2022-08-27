package com.github.SaHHiiLL;

import com.lycoon.clashapi.core.ClashAPI;
import com.lycoon.clashapi.core.Credentials;
import com.lycoon.clashapi.core.exception.ClashAPIException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClashAPIException, IOException {
        System.out.println("Hello world!");
        ClashAPI c = new ClashAPI((List.of(new Credentials("email", "password"))));

        System.out.println(c.getPlayer("2pp").getName());
    }
}