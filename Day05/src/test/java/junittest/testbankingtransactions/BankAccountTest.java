package junittest.testbankingtransactions;

import junit.testingbankingtransactions.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(100.0); // Initial balance = $100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be updated after deposit");
    }

    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), "Balance should decrease after withdrawal");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5.0));
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-50.0));
        assertEquals("Initial balance cannot be negative", exception.getMessage());
    }
}
