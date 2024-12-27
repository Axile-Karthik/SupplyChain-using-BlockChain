public class Participant {
    private String id;
    private String name;
    private String role; 

   
    public Participant(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role; 
    }

   
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role; 
    }
}