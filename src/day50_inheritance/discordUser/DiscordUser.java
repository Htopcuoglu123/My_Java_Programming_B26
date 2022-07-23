package day50_inheritance.discordUser;

public class DiscordUser {
    String role;
    String name;
    String id;

    public DiscordUser(String role,String name,String id){
        this.role=role;
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
