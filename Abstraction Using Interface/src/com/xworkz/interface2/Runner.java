package com.xworkz.interface2;

public class Runner {

    public static void main(String[] args) {
        TrafficRule trafficRule = new BangaloreTraffic() {}; // Anonymous class for abstract class
        MallRule mallRule = new LuluMall();
        PGRules pgRules = new VarshiniPG();

    
        trafficRule.licenceNo();
        mallRule.validId();
        pgRules.costPerMonth();
        pgRules.wifi();
    }
}
