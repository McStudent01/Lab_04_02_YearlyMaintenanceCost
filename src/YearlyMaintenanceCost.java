public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {

        double springCost = 250.00;
        double summerCost = 1000.50;
        double fallCost = 75.00;
        double winterCost = 425.00;
        double totalCost = springCost + fallCost + winterCost + summerCost;

        System.out.println("The total yearly cost is " +totalCost + " and this was found by adding all the costs from spring maintenance of " +springCost + ", the summer maintenance of " +summerCost + ", the fall maintenance of " +fallCost + ", and the winter maintenance of " +winterCost + " together.");
    }
}