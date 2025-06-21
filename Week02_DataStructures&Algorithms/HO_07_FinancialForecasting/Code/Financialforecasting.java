 public class Financialforecasting {
    public static void main(String[] args) {
        int[] pastData = {100, 120, 130, 150, 170, 200};
        double growthRate = 10.2; 
        int years = 5;

        System.out.println("Setting Sample growth rate to "+growthRate+"% and years to "+years+"...");

        System.out.println("Calculating future value based on past data...");
        System.out.println("Output using recursive function: "+calculateFutureValue(pastData[pastData.length-1], growthRate/100, years));
    }
    public static double calculateFutureValue(int pastvalue, double growthrate, int years) {
        if (years == 0)
            return pastvalue;
        else
            return calculateFutureValue(pastvalue, growthrate, years - 1)*(growthrate+1);
    }
}
