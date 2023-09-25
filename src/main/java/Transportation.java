public class Transportation {
    private String transportationType;
    private String carType;
    private int numberOfDays;

    public enum CarType {
    sedan, mid_size, suv,
   }

    public Transportation() {
        this.transportationType = "";
        this.carType = "";
        this.numberOfDays = 0;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double calculateTransportationCost() {
        double dailyRate;
        switch (CarType.valueOf(carType)) {
            case sedan:
                dailyRate = 30.0;
                break;
            case mid_size:
                dailyRate = 35.0;
                break;
            case suv:
                dailyRate = 45.0;
                break;
            default:
                dailyRate = 0.0; 
        }

        double totalCost = dailyRate * numberOfDays;

        if (numberOfDays >= 30) {
            totalCost *= 0.95;
        }

        return totalCost;
    }
}
