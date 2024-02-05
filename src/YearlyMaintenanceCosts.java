import java.util.Scanner;

public class YearlyMaintenanceCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maintenance cost for Spring: $");
        double springCost = scanner.nextDouble();

        System.out.print("Enter maintenance cost for Summer: $");
        double summerCost = scanner.nextDouble();

        System.out.print("Enter maintenance cost for Autumn: $");
        double autumnCost = scanner.nextDouble();

        System.out.print("Enter maintenance cost for Winter: $");
        double winterCost = scanner.nextDouble();

        double yearlyTotal = springCost + summerCost + autumnCost + winterCost;

        System.out.println("\nSeasonal Maintenance Costs:");
        System.out.printf("Spring: $%.2f%n", springCost);
        System.out.printf("Summer: $%.2f%n", summerCost);
        System.out.printf("Autumn: $%.2f%n", autumnCost);
        System.out.printf("Winter: $%.2f%n", winterCost);

        System.out.printf("\nTotal Yearly Maintenance Costs: $%.2f%n", yearlyTotal);
        
        scanner.close();
    }
}
