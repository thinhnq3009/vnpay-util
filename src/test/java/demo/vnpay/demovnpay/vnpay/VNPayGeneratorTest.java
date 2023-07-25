package demo.vnpay.demovnpay.vnpay;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VNPayGeneratorTest {

    @Test
    void toQueryUrl() {
        Map<String, String> map = new HashMap<>();

        map.put("vnp_Amount", "10000000");
        map.put("vnp_BankCode", "NCB");
        map.put("vnp_Command", "pay");

//        String queryUrl = new VNPayGenerator().toQueryUrl(map);

//        System.out.println(queryUrl);


    }
}