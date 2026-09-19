class MembershipCard {
    // Static fields shared across all instances
    static String libraryName;
    static String validUntil;

    // Instance field unique to each student
    String studentName;

    // Static block that runs exactly once when the class is loaded
    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";
        System.out.println("Library info loaded");
    }

    // Constructor to initialize studentName
    public MembershipCard(String studentName) {
        this.studentName = studentName;
    }
}

public class LibraryRunner {
    public static void main(String[] args) {
        String[] names = {"Ananya", "Rohan", "Priya", "Arjun", "Sneha"};

        // Loop through student names and create a MembershipCard for each
        for (String name : names) {
            MembershipCard card = new MembershipCard(name);
            System.out.println("Membership card issued: " + card.studentName);
        }
    }
}