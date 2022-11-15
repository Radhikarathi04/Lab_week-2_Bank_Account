import java.time.LocalDate;
import java.time.Month;

public class BankAccount {

//    BANK ACCOUNT CLASS
//    Variables

    String firstName;
    String lastName;
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 8);
    int accountNumber;
    double balance;
    double interest;


//    CONSTRUCTOR
    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDate, int inputAccountNumber, double inputBalance) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.date = inputDate;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
    }

    public String generateBio() { return "Your name is " + this.firstName + this.lastName ;}

//    METHODS
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

//    Add INTEREST Method





//    GETTERS & SETTERS
//    Getter & Setter for First name
    public String getFirstName() { return this.firstName; }

    public void setFirstName(String newFirstName) { this.firstName = newFirstName;}

//    Getter & Setter for Last Name
    public String getLastName() { return this.lastName; }

    public void setLastName(String newLastName) { this.lastName = newLastName; }

//    Getter & Setter for Date
    public LocalDate getDate() { return this.date; }

    public void setDate(LocalDate newDate) { this.date = newDate; }

//    Getter & Setter for Account Number
    public int getAccountNumber() { return this.accountNumber; }

    public void setAccountNumber(int newAccountNumber) { this.accountNumber = newAccountNumber; }

//    Getter & Setter for Balance
    public double getBalance() { return this.balance; }

    public void setBalance(double newBalance) { this.balance = newBalance; }



//    EXTENSION




}
