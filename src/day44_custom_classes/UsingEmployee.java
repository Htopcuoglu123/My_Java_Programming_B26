package day44_custom_classes;

import day44_custom_classes.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee("James","PO",3333,90000);
        employee1.goToMeeting();
        Employee employee2=new Employee("Katy","Developer",1234,100000);
        employee2.goToMeeting();
        Employee employee3=new Employee("David","Teacher",3462,78000);
        employee3.goToMeeting();
        Employee employee4=new Employee("Jennifer","Doctor",7645,260000);
        employee4.goToMeeting();
        ArrayList<Employee>list=new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
        System.out.println("The list is: "+list);

        double maxSalary=list.get(0).salary;
        for(Employee each:list){
            if(each.salary>maxSalary){
                maxSalary= each.salary;
            }

        }
        System.out.println("Max salary: "+maxSalary);
        System.out.println("________________________________________________");

        ArrayList<Employee>salaryOver100k=new ArrayList<>();
        for(Employee each:list) {
            if (each.salary >= 100000) {
                salaryOver100k.add(each);
            }
        }
            System.out.println("Salary over 100K: "+salaryOver100k);
            System.out.println("__________________________________________________________");
        ArrayList<String>listIT=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                if(list.get(i).jobTitle.equals("SDET")||list.get(i).jobTitle.equals("QA")||list.get(i).jobTitle.equals("QA Engineer")||
                list.get(i).jobTitle.equals("Developer")||list.get(i).jobTitle.equals("PO")){
                    listIT.add(list.get(i).jobTitle);
                }

            }
        System.out.println("List of IT jobs: "+listIT);
        }



        }
