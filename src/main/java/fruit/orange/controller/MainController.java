package fruit.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/orange")
	@ResponseBody
	public String index() {
		return "커몬요우~";
	}
	
}
