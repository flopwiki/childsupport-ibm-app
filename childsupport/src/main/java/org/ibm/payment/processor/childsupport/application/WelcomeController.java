package org.ibm.payment.processor.childsupport.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("messge", "Contact your local Child Support Office or call 1-800-332-6347");
        return "hello";
    }

    @GetMapping("/help")
    public String help(Model model) {
        model.addAttribute("message", "Application for Child Support Services. All customers must complete an application and may be required to pay a $15 application fee.");
        return "help";
    }
}
