package org.ibm.payment.processor.childsupport.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Contact your local Child Support Office or call 1-800-332-6347");
        return "home";
    }

}
