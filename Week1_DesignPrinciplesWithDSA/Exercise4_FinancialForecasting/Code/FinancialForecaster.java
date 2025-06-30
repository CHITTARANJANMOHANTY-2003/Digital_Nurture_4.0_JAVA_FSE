package FinancialForecasting;

public class FinancialForecaster {

    public static double forecast(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecast(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double pv = 10000.0; 
        double growthRate = 0.07;
        int years = 5;

        double futureValue = forecast(pv, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f%n", years, futureValue);
    }
}

