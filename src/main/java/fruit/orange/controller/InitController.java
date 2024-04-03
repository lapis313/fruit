package fruit.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {
	@GetMapping("/")
	public String index() {
		System.out.println("InitController.index");
		return "index";
	}
}
