package com.lwl.pattern.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        UnixFactory unixFactory = new UnixFactory();
        Button unixButton = unixFactory.createButton();
        unixButton.click();
        Text unixText = unixFactory.createText();
        unixText.edit();

        WinFactory winFactory = new WinFactory();
        Button winButton = winFactory.createButton();
        winButton.click();
        Text winText = winFactory.createText();
        winText.edit();
    }
}
