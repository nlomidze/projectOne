import java.time.LocalDateTime;

public class GeneralTask {
    private String name;
    private String userName;

    public GeneralTask(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public void print(){
        System.out.println("name: "+name);
        System.out.println("userName: "+userName);
        System.out.println("type: "+this.getClass().getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
