package fruit.orange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fruit.orange.service.MenuService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/menu")
public class MenuController {
	
	private final MenuService menuService;
	
	
	@GetMapping("/menu/list")
	public String findAll() throws Exception {
		String rtn = "";
		rtn = menuService.findAll();
		return rtn;
	}
	
	/**
	@GetMapping("/list")
	public String findAll(Model model){
		List<MenuDTO> menuDTOList = menuService.findAll();
		model.addAttribute("menuList", menuDTOList);
		System.out.println("menuDTOList = " + menuDTOList);
		return "menu/list";
	}
	 * */
	
}
