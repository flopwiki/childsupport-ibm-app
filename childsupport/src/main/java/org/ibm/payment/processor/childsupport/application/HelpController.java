package org.ibm.payment.processor.childsupport.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {
    @GetMapping("/help")
    public String help(Model model) {
        model.addAttribute("message", "Help for Child Support Services. All government customers must complete an application and may be required to pay a $15 application fee.");
        return "help";
    }
}
