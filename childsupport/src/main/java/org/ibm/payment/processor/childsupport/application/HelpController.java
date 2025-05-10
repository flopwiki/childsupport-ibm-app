package org.ibm.payment.processor.childsupport.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {

    @GetMapping("/help")
    public String getHelpPage() {
        return "help"; // Returns the "help.html" template
    }
}
