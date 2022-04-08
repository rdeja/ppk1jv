public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(100);
        System.out.println(account.withdraw(30));
        // next change
        System.out.println("Hello");
    }
}
