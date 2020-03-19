package eng2020_1_a01;

import java.util.List;
import java.util.ArrayList;

public class Bascara {
    private double valueA;
    private double valueB;
    private double valueC;

    public List calculateBascara() {
        List result = new ArrayList();
        double X1 = (-this.valueB + Math.sqrt( Math.pow(this.valueB, 2) - (4 * this.valueA * this.valueC) ) ) / (2 * this.valueA);
        double X2 = (-this.valueB - Math.sqrt( Math.pow(this.valueB, 2) - (4 * this.valueA * this.valueC) ) ) / (2 * this.valueA);
        result.add(X1);
        result.add(X2);
        return result;
    }
}