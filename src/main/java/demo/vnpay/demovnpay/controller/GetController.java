package demo.vnpay.demovnpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController {
    @GetMapping("")
    public String vnpay() {
        return "payment";
    }
}
