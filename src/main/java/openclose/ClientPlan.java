package openclose;

public class ClientPlan {

    private MobilePlan  mobilePlan;

    public ClientPlan(MobilePlan mobilePlan){
        this.mobilePlan = mobilePlan;
    }

    public void printPlans(){
        mobilePlan.offerMobilePlans();
    }
}
