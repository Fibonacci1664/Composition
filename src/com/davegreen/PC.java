package com.davegreen;

/**
 * Created by daveg on 16/06/2017.
 */
public class PC                                 // Instead of using the keyword extends we have instead created
{                                               // other classes for certain components that make up a PC
    private Case theCase;                       // by using the keyword extend you are limited to only being able
    private Monitor monitor;                    // to inherit from one particular class but by using this method we
    private Motherboard motherboard;            // can inherit to the PC class all that comprises within the Case,
                                                // Monitor and Motherboard classes.
    public PC(Case theCase, Monitor monitor, Motherboard motherboard)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp()
    {
        getTheCase().pressPowerButton();                                // Unlike below this method uses the getter
        drawLogo();                                                     // to access the class.
    }

    private void drawLogo()
    {
        //getMonitor().drawPixelAt(1200, 50, "yellow");                  // Both of these would work fine
        monitor.drawPixelAt(1200, 50, "blue");              // the latter accesses the variable monitor
    }                                                                    // directly as opposed to using the getter.
    private Case getTheCase()
    {
        return theCase;
    }
//
//    private Monitor getMonitor()
//    {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard()
//    {
//        return motherboard;
//    }
}
