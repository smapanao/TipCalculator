/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.model;

/**
 *
 * @author seanmapanao
 */
public class Bill {
    public final double HST_RATE = .13;
 
    private double billAmt;         // amount on the bill
    private double tipPercent;      // the tip percentage
 
    /**
     * Constructs a Bill object with a specific bill amount. The bill amount
     * must be 0 or greater, otherwise an exception is thrown.
     *
     * @param amt the total amount on the bill
     * @throws Exception if the bill amount is invalid
     */
    public Bill(double amt) throws Exception {
 
        // make sure amount is valid
        setBillAmt(amt);
    }
 
    /**
     * Constructs a Bill object with a specific bill amount and tip percentage.
     * Both bill amount and tip percentage must be 0 or greater, otherwise an
     * exception is thrown.
     *
     * @param amt the total amount on this bill
     * @param tip the percentage of tip the customer wants
     * @throws Exception if bill amount or tip percentage are invalid
     */
    public Bill(double amt, double tip) throws Exception {
 
        // make sure amount and tip are valid
        setBillAmt(amt);
        setTipPercent(tip);
    }
 
    /**
     * Attempts to assign a valid bill amount on this bill object. The specified
     * amount must be 0 or greater, otherwise an exception is thrown.
     *
     * @param amt the programmer-specified amount on this bill
     * @throws Exception if the bill amount is invalid
     */
    public void setBillAmt(double amt) throws Exception {
 
        // set amount if it's valid
        if (amt >= 0) {
            billAmt = amt;
        } else {  // amount isn't valid
            throw new Exception("Error: Bill amount must be"
                + " 0 or more.");
        }
    }
 
    /**
     * Retrieves the total bill amount of this bill object.
     *
     * @return this bill's amount
     */
    public double getBillAmt() {
        return billAmt;
    }
 
    /**
     * Attempts to assign a valid tip percentage on this bill object. The
     * specified percentage must be 0 or greater, otherwise an exception is
     * thrown.
     *
     * @param amt the programmer-specified tip percentage on this bill
     * @throws Exception if the tip percentage is invalid
     */
    public void setTipPercent(double tip) throws Exception {
       
        // set the percentage if it's valid
        if (tip >= 0) {
            tipPercent = tip;
        } else {  // tip percentage is invalid
            throw new Exception("Error: Tip percentage must be"
                + " 0 or more.");
        }
 
    }
 
    /**
     * Retrieves the tip percentage on this bill.
     *
     * @return the customer's tip percentage
     */
    public double getTipPercent() {
        return tipPercent;
    }
 
    /**
     * Determines the total tip amount to add to the bill total.  The
     * tip amount is based on the customer's tip percentage and the total
     * amount on the bill.
     *
     * @return the tip amount to add
     */
    public double calcTip() {
        return tipPercent / 100 * billAmt;
    }
 
    /**
     * Gets the bill object as a formatted String.  The string includes
     * the bill amount, tip amount, and the total amount due.
     *
     * @return this bill object as a string
     */
    @Override
    public String toString() {
       
        // using tip twice, so calculate it once and store
        double tipAmt = calcTip();
       
        // build a formatted string for this bill
        return String.format("%-12s %6.2f%n%-12s %6.2f%n%-12s %6.2f%n",
            "Bill Amount:", billAmt, "Tip Amount:", tipAmt,
            "Total Due: ", billAmt + tipAmt);
    }
}
    


    

