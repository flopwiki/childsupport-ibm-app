package org.ibm.payment.processor.childsupport;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ChildsupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChildsupportApplication.class, args);

	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
			return "Child Support App: Payment Service is running! 🚀";
	}

	@GetMapping("/")
	public String home() {
		return "redirect:/hello";
	}


	@GetMapping("/error")
	public String errorPage() {
		return ("This is a test error message");
	}



}
