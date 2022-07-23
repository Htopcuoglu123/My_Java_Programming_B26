package day48_encapsulation.FlightTicket;

public class FlightTicket {
    /*
    Task
        FlightTicket
            instance variables:
                type (first, business, economy)
                departure location
                arrival location

            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields
     */
   private String ticketType;
   private String depLocation;
   private String arrivalLocation;

    public FlightTicket(String ticketType,String depLocation,String arrivalLocation){
        setTicketType(ticketType);
        setDepLocation(depLocation);
        setArrivalLocation(arrivalLocation);
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        if(ticketType.equalsIgnoreCase("first")||ticketType.equalsIgnoreCase("business")||ticketType.equalsIgnoreCase("economy")){
            this.ticketType = ticketType;
        }else{
            System.out.println("Please enter a valid ticket type");
        }

    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "ticketType='" + ticketType + '\'' +
                ", depLocation='" + depLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }
}
