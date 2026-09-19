class ParkingTicket {
    String vehicleNo;
    double ratePerMinute;

    // Constructor
    public ParkingTicket(String vehicleNo, double ratePerMinute) {
        this.vehicleNo = vehicleNo;
        this.ratePerMinute = ratePerMinute;
    }

    // Final method to calculate fine - cannot be overridden by subclasses
    public final double calculateFine(int overstayMinutes) {
        return overstayMinutes * ratePerMinute;
    }

    // Final method to print receipt - cannot be overridden by subclasses
    public final void printReceipt(int overstayMinutes) {
        double fine = calculateFine(overstayMinutes);
        System.out.println(vehicleNo + " - Fine: Rs " + fine);
    }
}

public class ParkingRunner {
    public static void main(String[] args) {
        String[] vehicleNos = {"TN09AB1234", "TN22CD5678", "TN09EF9012", "TN10GH3456"};
        double[] ratePerMinute = {2, 2, 3, 2};
        int[] overstayMinutes = {15, 0, -5, 8};

        // Loop over parallel arrays
        for (int i = 0; i < vehicleNos.length; i++) {
            ParkingTicket ticket = new ParkingTicket(vehicleNos[i], ratePerMinute[i]);

            if (overstayMinutes[i] > 0) {
                ticket.printReceipt(overstayMinutes[i]);
            } else {
                System.out.println(vehicleNos[i] + " - No fine, within allotted time");
            }
        }
    }
}