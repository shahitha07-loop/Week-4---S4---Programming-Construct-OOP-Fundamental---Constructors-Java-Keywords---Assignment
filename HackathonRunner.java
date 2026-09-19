class Participant {
    String name;
    String teamName;
    boolean registered;

    // Two-argument constructor setting all three fields directly
    public Participant(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.registered = true;
    }

    // Single-argument constructor chaining via this(...) to set teamName to "Unassigned"
    public Participant(String name) {
        this(name, "Unassigned");
    }

    // Method to print details on one line
    public void printStatus() {
        System.out.println(this.name + " | " + this.teamName + " | Registered: " + this.registered);
    }
}

public class HackathonRunner {
    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya"};
        String[] teamNames = {"ByteBusters", "", "CodeCrafters", ""};

        // Loop over parallel arrays
        for (int i = 0; i < names.length; i++) {
            Participant p;
            
            // Check if teamNames[i] is empty to choose the right constructor
            if (teamNames[i].isEmpty()) {
                p = new Participant(names[i]);
            } else {
                p = new Participant(names[i], teamNames[i]);
            }

            // Print status for each participant
            p.printStatus();
        }
    }
}