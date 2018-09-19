package singleresponsability;

import java.util.Calendar;

public class ViewSales {

    public Double calculateSalesPerDay(Product product){
        Calendar calendar = Calendar.getInstance();
        int monthMaxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Double salesPerMonth = getTotalSalesPerMonth(product, calendar.get(Calendar.MONTH));
        return salesPerMonth/monthMaxDays;
    }

    public Double getTotalSalesPerMonth(Product product, int month) {
        SalesManager salesManager = new SalesManager();
        Calendar calendar = Calendar.getInstance();
        Double totalSalesPerMonth = 0.00;

        for (Sales sales: salesManager.getSalesList()){
            Product productInList = sales.getProduct();

            if(productInList.getName() == product.getName()){
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
