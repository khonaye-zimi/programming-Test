public abstract class Consoles {
    private String ConsoleType;
    private String StoreName;
    private int totalSales;

    public Consoles(String consoleType, String storeName, int totalSales){
        this.ConsoleType = consoleType;
        this.StoreName = storeName;
        this.totalSales = totalSales;
    }
    public String getConsoleType() {
        return ConsoleType;
    }

    public String getStoreName() {
        return StoreName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
