package day44_custom_classes;

public class OfferVersion2 {

        String location;
        String company;
        double salary;
        boolean isFullTime;
        int numOfPTO;

        public OfferVersion2(String company,String location){
            this.company=company;
            this.location=location;
        }
        public OfferVersion2(String company,String location,double salary){
            this(company,location);
            this.salary=salary;
        }
        public OfferVersion2(String company,String location,double salary,boolean isFullTime,int numOfPTO){
            this(company,location,salary);
            this.isFullTime=isFullTime;
            this.numOfPTO=numOfPTO;
        }
        public String toString(){
            String offer="Company: "+company+
                    "\nLocation: "+location;
            if(salary!=0){
                offer+="\nSalary: "+salary;
            }
            if(!isFullTime){
                offer+="\nIs full time: "+isFullTime;
            }
            if(numOfPTO!=0){
                offer+="\nPTO: "+numOfPTO;
            }
            return offer;
        }

    }
