package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Joanna";
        String lastName ="Blake";
        char gender = 'F';
        int age = 35;
        String companyName = "Cydeo";
        boolean isFullTime = true;
        String jobTitle = "PO";
        double salary =110_000.89;
        int numOfPTO = 17;
        boolean isMarried =true;
        char suite ='A';
        System.out.println(""+name +" "+lastName + " is a  " + age +" years old "+ companyName +" " +jobTitle);
        System.out.println("Her salary is " + salary + " and she has "+ numOfPTO +"days of PTO.");

        String fullScript="\n"+name +" "+lastName + " is a  " + age +" years old "+ companyName +" " +jobTitle +"\nHer salary is " +salary+ " and she has "+numOfPTO+" days of PTO.";
        System.out.println(fullScript);

        /*
        We do not have to declare the variables separetely. we can just do the same types together and then we need to assign them one by one

         String name,lastName,companyName;
         boolean isMarried, isFullTime;

         name="Hilal";
         lastName="Topcuoglu";
         companyName="Cydeo";

         isMarried=true;
         isFullTime=true;

         */
    }
}
