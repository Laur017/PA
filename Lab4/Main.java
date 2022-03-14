package com.example.Compulsory;

public class Main {
    public static void main(String[] args) {

        Router v1 = new Router ("v1","00:25:96:FF:FE:12:34:67","Router A");
        Router v2 = new Router ("v2","0025:96FF:FE12:3467","Router B");

        Network n1 = new Network();

       n1.addNodes(v1);
       n1.addNodes(v2);
       n1.printNodes();


    }
}
