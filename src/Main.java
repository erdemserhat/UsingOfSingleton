public class Main {
    public static void main(String[] args) {
        User user = new User("Serhat","Erdem",3451,false);
        SingletonUser singletonUser =SingletonUser.getInstance();
        singletonUser.setUser(user);
        AnotherClass ac = new AnotherClass();
        System.out.println(ac.getSingletonUser().getUser().getName());




    }
}