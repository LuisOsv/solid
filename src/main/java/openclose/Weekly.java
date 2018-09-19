package openclose;

import java.util.HashMap;
import java.util.Map;

public class Weekly implements MobilePlan {

    public static final String EXPIRATION_DATE = "5 days";
    public Map<String,String> availableOptions = new HashMap<String, String>();

    @Override
    public void offerMobilePlans() {

        availableOptions.put("15 Bs","150 MB and 10 SMS");
        availableOptions.put("25 Bs","250 MB, 15 SMS and 10 minutes");
        availableOptions.put("30 Bs","500 MB, 20 SMS and 15 minutes");

        availableOptions.forEach(
                (price, offer) ->
                        System.out.println(
                                String.format("Get %s with %s will expire in %s", offer, price, EXPIRATION_DATE))
        );
    }
}
