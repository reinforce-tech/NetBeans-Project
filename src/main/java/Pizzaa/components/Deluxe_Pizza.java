package Pizzaa.components;



import java.text.DecimalFormat;

public class Deluxe_Pizza {
    private int option;
    private int total;
    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    public Deluxe_Pizza() {                                                    // Constructor to initialize fields or perform other setup if needed
        this.total = 0;
    }

    public int processPizzaOrder(int optionTextField) {                        // public static void or just return the updated value
        option = optionTextField * 185;
        total += option;
        return total;
    }   

    public int getTotal() {
        return total;
    }

    public String getFormattedTotal() {
        return "₱ " + decimalFormat.format(total);
    }
}
