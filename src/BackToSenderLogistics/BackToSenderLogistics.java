package BackToSenderLogistics;

public class BackToSenderLogistics {

    public int packagesPerDay() {
        return 500 * 100;
    }

    public int amountEarned(int packages) {
        double percentage = ((double) packages / 100) * 100;
        int totalDeliveries = 0;
        if (packages < 0){
            throw new IllegalArgumentException("Fuck you thief!");
        }
        if (percentage < 50) {
            totalDeliveries = packages * 160 + 5000;
        } else if (percentage > 50 && percentage < 60) {
            totalDeliveries = packages * 200 + 5000;
        } else if (percentage > 60 && percentage < 70) {
            totalDeliveries = packages * 250 + 5000;
        } else if (percentage >= 70) {
            totalDeliveries = packages * 500 + 5000;
        }

        return totalDeliveries;

    }
}
