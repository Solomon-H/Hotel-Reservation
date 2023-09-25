public class Food {
    private boolean hasBreakfast;
    private boolean hasLunch;
    private boolean hasDinner;

    public Food() {
        this.hasBreakfast = false;
        this.hasLunch = false;
        this.hasDinner = false;
    }

    public void addBreakfast() {
        this.hasBreakfast = true;
    }

    public void addLunch() {
        this.hasLunch = true;
    }

    public void addDinner() {
        this.hasDinner = true;
    }

    public double calculateFoodCost() {
        double totalCost = 0.0;
        if (hasBreakfast) {
            totalCost += 15.0;
        }
        if (hasLunch) {
            totalCost += 25.0;
        }
        if (hasDinner) {
            totalCost += 20.0;
        }
        return totalCost;
    }
}
