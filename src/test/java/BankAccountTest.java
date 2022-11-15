import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankaccount;

    @BeforeEach
    public void setUp() { bankaccount = new BankAccount("Radhika", "Rathi", LocalDate.of(2022,11,15),782404,1000); }

    @Test
    public void hasFirstName() {
        assertThat(bankaccount.getFirstName()).isEqualTo("Radhika");
    }

    @Test
    public void hasLastName() {
        assertThat(bankaccount.getLastName()).isEqualTo("Rathi");
    }

    @Test
    public void canSetFirstName() {
        bankaccount.setFirstName("Helen");
        assertThat(bankaccount.getFirstName()).isEqualTo("Helen");
    }

    @Test
    public void testDeposit() {
        bankaccount.deposit(500);
        assertThat(bankaccount.getBalance()).isEqualTo(1500);
    }

    @Test
    public void testWithdrawal() {
        bankaccount.withdrawal(800);
        assertThat(bankaccount.getBalance()).isEqualTo(200);
    }

}

