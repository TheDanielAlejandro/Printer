package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer1 = new Printer(10,true);                                                       // . Creating a new Object type Printer, setting the parameters.


        printer1.addToner(100);                                                                                         // . Calling the method addToner.
        printer1.printingPage(2);                                                                                 // . Calling the method printPage.
        System.out.println(printer1.getPagesPrinted());                                                                 // . Printing the result of the method getPagesPrinted.

    }
}
