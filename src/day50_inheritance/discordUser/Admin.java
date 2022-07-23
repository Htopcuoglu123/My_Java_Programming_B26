package day50_inheritance.discordUser;

public class Admin extends DiscordUser{
    public Admin(String role,String name,String id){
        super("Admin",name,id);
    }

    public void createChannel(){
        System.out.println("Creating new discord channel");
    }


}
