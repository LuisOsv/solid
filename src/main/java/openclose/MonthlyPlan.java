package openclose;

import java.util.HashMap;
import java.util.Map;

public class MonthlyPlan implements MobilePlan {

    public static final String EXPIRATION_DATE = "30 days";
    public Map<String,String> availableOptions = new HashMap<String, String>();

    @Override
    public void offerMobilePlans() {

        availableOptions.put("20 Bs","200 MB, 20 SMS and 15 minutes");
        availableOptions.put("40 Bs","350 MB, 25 SMS and 20 minutes");
        availableOptions.put("50 Bs","600 MB, 30 SMS and 35 minutes");

        availableOptions.forEach(
                (price, offer) ->
                        System.out.println(
                                String.format("Get %s with %s will expire in %s", offer, price, EXPIRATION_DATE))
        );
    }
}
