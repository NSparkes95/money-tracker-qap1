public class CreditCardDemo {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Person owner = new Person("John", "Doe", new Address("123 Main St", "Toronto", "ON", "A1B2C3"));

        CreditCard card = new CreditCard(owner, LIMIT);

        System.out.println("Owner:" + card.getPersonal());
        System.out.println("Balance:" + card.getBalance());
        System.out.println("Credit Limit:" + card.getCreditLimit());
        System.out.println();

        System.out.println("Attempt to charge" + FIRST_AMOUNT);
        card.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to charge: " + SECOND_AMOUNT);
        card.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        card.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        card.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + card.getBalance());
    }
}
