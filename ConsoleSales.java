public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String StoreName, int totalSales) {
        super(consoleType, StoreName, totalSales);
    }

    public void printReport() {
        System.out.println("-------------------");
        System.out.println("console sales report");
        System.out.println("-----------");
        System.out.println("console type" + getConsoleType());
        System.out.println("store name" + getStoreName());
        System.out.println("total sales" + getTotalSales());
    }
}
