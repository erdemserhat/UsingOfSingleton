public class AnotherClass {
 private SingletonUser singletonUser;

    public AnotherClass() {
        this.singletonUser = SingletonUser.getInstance();
    }

    public SingletonUser getSingletonUser() {

        return singletonUser;
    }

    public void setSingletonUser(SingletonUser singletonUser) {
        this.singletonUser = singletonUser;
    }
}
