package com.xworkz.interface2;

public class LuluMall implements MallRule {

    @Override
    public void validId() {
        System.out.println("Valid ID: Lulu Mall accepts Government IDs.");
    }
}
