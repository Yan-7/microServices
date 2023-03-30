package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerA {

    @GetMapping("/service/a")
    public String handleA() {
        return "handling service A";
    }
}
