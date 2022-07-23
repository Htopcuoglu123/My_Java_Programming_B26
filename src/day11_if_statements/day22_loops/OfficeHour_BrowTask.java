package day11_if_statements.day22_loops;

public class OfficeHour_BrowTask {
    public static void main(String[] args) {
        String browserName="safari";
        String operatingSystem="mac";
        boolean isBrowserOpen=false;
        if(!isBrowserOpen){
            switch(browserName){
                case "chrome":
                case "chrome-headless":
                case "firefox-headless":
                case "firefox":
                case "remote-chrome":
                    System.out.println("Browser is already opened with"+browserName+" in "+operatingSystem);
                    break;
                case"ie":
                case"edge":
                    if(operatingSystem.equals("windows")){
                        System.out.println("Browser is already opened with "+browserName+" in "+operatingSystem);
                    }else{
                        System.out.println("Your "+operatingSystem+" doesn't support "+browserName);
                    }
                    break;
                case"safari":
                    if(operatingSystem.equals("safari")){
                        System.out.println("Browser is already opened with"+browserName+" in "+operatingSystem);
                    }else{
                        System.out.println("Your "+operatingSystem+" doesn't support "+browserName);
                    }
                    break;

            }


        }else{
            System.out.println("Browser is already opened with "+browserName+" in "+operatingSystem);
        }
    }
}
