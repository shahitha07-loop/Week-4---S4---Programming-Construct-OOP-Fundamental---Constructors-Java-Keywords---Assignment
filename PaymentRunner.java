class Payment {
    public double pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
        return amount;
    }
}

class CardPayment extends Payment {
    public double payWithProcessingFee(double amount) {
        double totalAmount = amount + (amount * 0.02); // Adds a 2% fee
        System.out.println("Charged (card, incl. fee): Rs " + totalAmount);
        return totalAmount;
    }
}

public class PaymentRunner {

    // Processes individual transactions using instanceof and type casting
    public static double processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            return cardPayment.payWithProcessingFee(amount);
        } else {
            return payment.pay(amount);
        }
    }

    public static void main(String[] args) {
        // Build a Payment[] array of 5 references (3 CardPayment, 2 plain Payment)
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        // Matching transaction amounts
        double[] amounts = {100, 50, 200, 75, 120};

        double totalCollected = 0.0;

        // Loop through the transactions and update the running total
        for (int i = 0; i < payments.length; i++) {
            totalCollected += processTransaction(payments[i], amounts[i]);
        }

        // Print final accumulated total
        System.out.println("Total Collected: Rs " + totalCollected);
    }
}