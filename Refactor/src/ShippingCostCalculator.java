public class ShippingCostCalculator {

    public double calculateShippingCost(String location, double orderAmount, boolean isExpress) {
        double shippingCost;

        if (location.equals("Domestic")) {
            if (orderAmount > 100) {
                shippingCost = isExpress ? 10 : 5;
            } else {
                shippingCost = isExpress ? 15 : 10;
            }
        } else if (location.equals("International")) {
            if (orderAmount > 100) {
                shippingCost = isExpress ? 30 : 20;
            } else {
                shippingCost = isExpress ? 40 : 25;
            }
        } else {
            throw new IllegalArgumentException("Invalid location");
        }

        return shippingCost;
    }
}


public class ShippingCostCalculator {

    public double calculateShippingCost(String location, double orderAmount, boolean isExpress) {
        if (location.equals("Domestic")) {
            return calculateDomesticShipping(orderAmount, isExpress);
        } else if (location.equals("International")) {
            return calculateInternationalShipping(orderAmount, isExpress);
        } else {
            throw new IllegalArgumentException("Invalid location");
        }
    }

    private double calculateDomesticShipping(double orderAmount, boolean isExpress) {
        if (orderAmount > 100) {
            return isExpress ? 10 : 5;
        } else {
            return isExpress ? 15 : 10;
        }
    }

    private double calculateInternationalShipping(double orderAmount, boolean isExpress) {
        if (orderAmount > 100) {
            return isExpress ? 30 : 20;
        } else {
            return isExpress ? 40 : 25;
        }
    }

    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        System.out.println("Shipping Cost: " + calculator.calculateShippingCost("Domestic", 120, true));
    }
}


