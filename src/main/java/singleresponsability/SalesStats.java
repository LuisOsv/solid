package singleresponsability;

import java.util.Calendar;

public class SalesStats {

    public static Double getSalesPerDayOfProduct(Product product){
        Calendar calendar = Calendar.getInstance();
        int monthMaxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Double salesPerMonth = getTotalSalesPerMonthOfProduct(product, calendar.get(Calendar.MONTH));
        return salesPerMonth/monthMaxDays;
    }

    public static Double getTotalSalesPerMonthOfProduct(Product product, int month) {
        SalesBuilder totalSales = new SalesBuilder();
        Calendar calendar = Calendar.getInstance();
        Double totalSalesPerMonth = 0.00;

        for (Sales sales: totalSales.getSalesOfProduct()){
            Product productInList = sales.getProduct();

            if(productInList.getName().equals(product.getName())){
                calendar.setTime(sales.getSalesDate());
                int monthOfProduct = calendar.get(Calendar.MONTH);

                if(monthOfProduct == month){
                    totalSalesPerMonth = totalSalesPerMonth + productInList.getPrice();
                }
            }
        }

        return totalSalesPerMonth;
    }

}
