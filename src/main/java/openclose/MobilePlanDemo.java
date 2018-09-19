package openclose;

public class MobilePlanDemo {

    public static void main(String [] args){
        System.out.println(" DAILY PLANS");
        Context context = new Context(new Daily());
        context.printPlans();

        System.out.println(" WEEKLY PLANS");
        context = new Context(new Weekly());
        context.printPlans();

        System.out.println(" MONTHLY PLANS");
        context = new Context(new Monthly());
        context.printPlans();
    }
}
