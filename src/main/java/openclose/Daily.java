package openclose;

import java.util.HashMap;
import java.util.Map;

public class Daily implements MobilePlan {

    public static final String EXPIRATION_DATE = "24 hrs";
    public Map<String,String> availableOptions = new HashMap<String, String>();

    @Override
    public void offerMobilePlans() {
        availableOptions.put("2 Bs","50 MB");
        availableOptions.put("4 Bs","100 MB and 5 minutes");
        availableOptions.put("6 Bs","200 MB and 10 SMS");
        availableOptions.put("10 Bs","400 MB, 5 minutes and 5 SMS");

        availableOptions.forEach(
                (price, offer) ->
                        System.out.println(
                                String.format("Get %s with %s will expire in %s", offer, price, EXPIRATION_DATE))
        );
    }
}
