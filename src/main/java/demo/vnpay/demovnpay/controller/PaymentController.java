package demo.vnpay.demovnpay.controller;

import demo.vnpay.demovnpay.vnpay.VNPayGenerator;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.*;

@RestController
public class PaymentController {


    @PostMapping("/payment")
    @ResponseBody
    public ResponseEntity<?> vnpayPost(HttpServletRequest req) throws UnsupportedEncodingException {

        UUID uuid = UUID.randomUUID();

        VNPayGenerator vnPay = new VNPayGenerator(UserVNPayConfiguration.vnp_HashSecret, UserVNPayConfiguration.vnp_TmnCode);

        vnPay.setIpAddress(req);
        vnPay.setAmount(1000000);
        vnPay.setOrderType("topup");
        vnPay.setTxnRef(uuid.toString());
        vnPay.setOrderInfo( "Thanh toan don hang" + uuid);
        vnPay.setReturnUrl(UserVNPayConfiguration.vnp_Returnurl);

        String payUrl = vnPay.generateUrl();

        return ResponseEntity.ok(payUrl);

    }


    @GetMapping("/payment/done")
    @ResponseBody
    public String vnpayDone(
            // All of these parameters are required
            HttpServletRequest request
    ) {
        StringBuilder str = new StringBuilder();
        request.getParameterMap().forEach((key, value) -> {
            str.append(key).append(": ").append(value[0]).append("<br>");
        });

        return str.toString();
    }

}
