package day07_unary_operators;
/*
create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount,
and your salary after all taxes
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary=100_000;
        double stateTaxRate=0.08;
        double stateTax=salary*stateTaxRate;
        double federalTaxRate=0.21;
        double federalTax=salary*federalTaxRate;
        double totalTax=federalTax+stateTax;
        double salaryAfterTax=salary-totalTax;
        String taxReport="State tax rate: "+stateTaxRate+", Federal tax rate: "+federalTaxRate+", salary:$ "+salary+"\nTax amounts: "+stateTax+" for state tax and "+
                federalTax+ " for a total of "+totalTax+"\nAfter tax your salary is "+salaryAfterTax;
        System.out.println(taxReport);
        System.out.println("\nMy salary is $"+salary);
        System.out.println("The amount fo tax for state is $"+stateTax);
        System.out.println("The amount of federal tax is $"+federalTax);
        System.out.println("The total amount of taxes is $"+totalTax);
        System.out.println("My salary after all taxes is $"+salaryAfterTax);
    }
}
