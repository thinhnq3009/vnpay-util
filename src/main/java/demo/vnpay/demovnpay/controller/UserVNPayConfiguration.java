package demo.vnpay.demovnpay.controller;

import lombok.Getter;
import lombok.Setter;

public class UserVNPayConfiguration {
    @Setter
    @Getter
    public static String vnp_TmnCode = "TNI0OT3G";
    @Setter
    @Getter
    public static String vnp_HashSecret = "LCMWDWKCNVRHYUDSUJHVKGCFUTYFYBNW";
    public static String vnp_Returnurl = "localhost:8080/payment/done";
}
