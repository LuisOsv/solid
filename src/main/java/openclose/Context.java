package openclose;

public class Context {

    private MobilePlan  mobilePlan;

    public Context(MobilePlan mobilePlan){
        this.mobilePlan = mobilePlan;
    }

    public void printPlans(){
        mobilePlan.offerMobilePlans();
    }
}
