import example.model.AccountHolder;
import example.model.SimpleBankAccountWithAtm;

import org.junit.jupiter.api.*;

/**
 * The test suite for testing the SimpleBankAccountWithATM implementation.
 */
public class SimpleBankAccountWithAtmTest extends AbstractBankAccountWithFeeTest {

    @BeforeEach
    void beforeEach() {
        this.accountHolder = new AccountHolder("Mario", "Rossi", 1);
        this.bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
        this.fee = this.bankAccount.getFee();
    }
}