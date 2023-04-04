public class SingletonUser {
    private User user;
    public static SingletonUser singletonUser;

    private SingletonUser() {

    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static SingletonUser getInstance() {
        if (singletonUser == null) {
            singletonUser = new SingletonUser();
            return singletonUser;
        }
        return singletonUser;
    }
}