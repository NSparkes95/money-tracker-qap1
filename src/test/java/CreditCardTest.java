import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    private CreditCard card;

    @BeforeEach
    void setUp() {
        Address address = new Address("123 Main St", "Toronto", "ON", "A1B 2C3");
        Person owner = new Person("John", "Doe", address);
        Money limit = new Money(1000.0);
        card = new CreditCard(owner, limit);
    }

    @Test
     void testChargeWithinLimit() {
        card.charge(new Money(100));
        Assertions.assertEquals(100.0, card.getBalance().getAmount(), 0.001);
    }
}
