package day12_if_Statements.day20_strings;

public class SMSParts2 {
    public static void main(String[] args) {
        String msg="Sender:<James Bond>.From Number:[202-123-3456].+ Message:{I love programming and problem solving}";
        int senderStart=msg.indexOf('<');
        int senderEnd=msg.indexOf('>');
        int numberStart=msg.indexOf('[');
        int numberEnds=msg.indexOf(']');
        int messageStarts=msg.indexOf('{');
        int messageEnds=msg.indexOf('}');
        System.out.println("Sender is:"+msg.substring(senderStart+1,senderEnd));
        System.out.println("Phone number: "+msg.substring(numberStart+1,numberEnds));
        System.out.println("Message: "+msg.substring(messageStarts+1,messageEnds));
    }
}
