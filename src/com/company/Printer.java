package com.company;

public class Printer {                                                                                                  // . Create class Printer

    private int tonerLevel;                                                                                             // . Initializing instance variables.
    private int pagesPrinted;
    private Boolean isDuplex;


    // CONSTRUCTOR

    public Printer(int tonerLevel, Boolean isDuplex){                                                                   // . Constructor with 3 parameters.
        if(tonerLevel < 0){                                                                                             // . If the value is lower than 0 set it to 0.
            tonerLevel = 0;
        }

        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }


    // GET METHODS


    public int getPagesPrinted() {                                                                                      // . Get method for the pagesPrinted instance.
        return pagesPrinted;
    }


    // OTHER METHODS

    public void addToner(int toner){                                                                                    // . Creating method addToner, with one parameter type int "toner".
        int amountLeft = (100 - this.tonerLevel);                                                                       // . Creating a variable to store the amount that can be filled in the printer by the toner value.
        if(toner > 0 && toner <= amountLeft){                                                                           // . Checking if the value in toner is enough and lower than the amount calculated before.
            this.tonerLevel += toner;                                                                                   // . Adding the amount obtained in the tonerLevel.
            System.out.println("Added : " + toner + "% of toner.");                                                     // . Printing a String.
        }else{
            System.out.println("Invalid amount of toner.");                                                             // . If the value doesn't match the criteria print the String.
        }
    }


    public void printingPage(int pages){                                                                                // . Creating method printingPage, with one parameter type int "pages".
        if(pages > 0){                                                                                                  // . Checking if the value in the parameter is higher than 0.
            if(this.isDuplex){                                                                                          // . If yes, checking if the boolean istance is True.
               pages = (pages / 2) + (pages % 2);                                                                       // . If yes, it means that we have to divide the pages printed by 2 (since it's going to print front-back) and than add that result to the reminder of it. (5 /2 = 2  + 5 % 2 = 1 == 3).
            }
            this.pagesPrinted += pages;                                                                                 // . Add the pages obtained and add it to the instance.
            System.out.println(pages + " pages have been printed.");                                                    // . Printing a String.
        }else{
            System.out.println("No pages printed.");                                                                    // . Printing a String.
        }
    }

}
