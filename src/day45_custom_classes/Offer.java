package day45_custom_classes;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public Offer(String company,String location){
        this.company=company;
        this.location=location;
    }
    public Offer(String company,String location,double salary){
        this.company=company;
        this.location=location;
        this.salary=salary;
    }
    public Offer(String company,String location,double salary,boolean isFullTime,int numOfPTO){
        this.company=company;
        this.location=location;
        this.salary=salary;
        this.isFullTime=isFullTime;
        this.numOfPTO=numOfPTO;
    }
    public String toString(){
        String offer="\nCompany: "+company+
                " - Location: "+location;
        if(salary!=0){
            offer+=" - Salary: "+salary;
        }
        if(isFullTime!=false){
            offer+=" - Is full time: "+isFullTime;
        }
        if(numOfPTO!=0){
            offer+=" - PTO: "+numOfPTO;
        }
        return offer;
    }
}
