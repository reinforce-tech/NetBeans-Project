package Pizzaa.components;



import java.text.DecimalFormat;

public class Promo_Pizza {
    private int option;
    private int total;
    private DecimalFormat decimalFormat = new DecimalFormat("#,###");

    public Promo_Pizza() {
        // Constructor to initialize fields or perform other setup if needed
        this.total = 0;
    }

    public  void processPizzaOrder(int optionTextField) {
        option = optionTextField * 290;
        total += option;
    }

    public int getTotal() {
        return total;
    }

    public String getFormattedTotal() {
        return "₱ " + decimalFormat.format(total);
    }
}
