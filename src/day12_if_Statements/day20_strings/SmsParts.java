package day12_if_Statements.day20_strings;

public class SmsParts {
    public static void main(String[] args) {
        String message="Sender:<James Bond>.From Number:[202-123-3456].+ Message:I love programming and problem solving";
        System.out.println(message.substring(0,7)+message.substring(8,18));
        System.out.println(message.substring(25,32)+message.substring(33,45));
        System.out.println(message.substring(49,56)+message.substring(56,95));
    }
}
