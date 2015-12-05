package org.oobp.learning.task1;

/**
 * Created by Dagmara on 2015-12-05.
 */
public class Calculator {

    private int digitA;
    private int digitB;

    //Constructor methods take the same name as the class
    Calculator(){}

    public int sum() {
        return digitA + digitB;
    }

    public int getDigitA() {
        return digitA;
    }
    public void setDigitA(int digitA) {
        this.digitA = digitA;
    }

    public int getDigitB() {
        return digitB;
    }
    public void setDigitB(int digitB) {
        this.digitB = digitB;
    }
}
