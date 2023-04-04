public class User {
    private String name;
    private String surname;
    private int id;
    private Boolean isWorking;

    public User(String name, String surname, int id, Boolean isWorking){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.isWorking=isWorking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }
}
