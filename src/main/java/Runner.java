import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Radhika", "Rathi", LocalDate.of(2022, 11, 15), 782404, 1000);

        System.out.println("First name: " + acc1.getFirstName());
        System.out.println("Last name: " + acc1.getLastName());
        System.out.println(acc1.getDate());
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Initial Balance " + acc1.getBalance());

//        System.out.println(acc1.generateBio());


        acc1.deposit(2000);
        System.out.println("Balance after deposit " + acc1.getBalance());


        acc1.withdrawal(1500);
        System.out.println("Balance after withdrawal " + acc1.getBalance());

        acc1.deposit(500);
        System.out.println("Balance after deposit " + acc1.getBalance());

    }

}
