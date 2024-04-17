package fruit.orange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fruit.orange.service.MenuService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/menu")
public class MenuRestController {

	private final MenuService menuService;

	@GetMapping("/list2")
	public String findTree() throws Exception {
		String rtn = "";
		rtn = menuService.findTree();
		return rtn;
	}

}
