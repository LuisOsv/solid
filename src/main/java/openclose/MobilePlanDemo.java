package openclose;

public class MobilePlanDemo {

    public static void main(String [] args){
        System.out.println(" DAILY PLANS");
        ClientPlan clientPlan = new ClientPlan(new DailyPlan());
        clientPlan.printPlans();

        System.out.println(" WEEKLY PLANS");
        clientPlan = new ClientPlan(new WeeklyPlan());
        clientPlan.printPlans();

        System.out.println(" MONTHLY PLANS");
        clientPlan = new ClientPlan(new MonthlyPlan());
        clientPlan.printPlans();
    }
}
