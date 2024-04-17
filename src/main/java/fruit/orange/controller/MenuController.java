package fruit.orange.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fruit.orange.dto.MenuDTO;
import fruit.orange.service.MenuService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	private final MenuService menuService;
	
	@GetMapping("/list")
	public String findAll(Model model){
		List<MenuDTO> menuDTOList = menuService.findAll();
		model.addAttribute("menuList", menuDTOList);
		System.out.println("menuDTOList = " + menuDTOList);
		return "menu/list";
	}
	/**
	@GetMapping("/menu/list")
	public String findTree() throws Exception {
		String rtn = "";
		rtn = menuService.findTree();
		return rtn;
	}
	*/
}
