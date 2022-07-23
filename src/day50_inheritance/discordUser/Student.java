package day50_inheritance.discordUser;

public class Student extends DiscordUser {
    public Student(String role,String name,String id){
        super("Student",name,id);
    }
    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
