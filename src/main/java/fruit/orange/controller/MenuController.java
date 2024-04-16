package fruit.orange.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import fruit.orange.dto.MenuDTO;
import fruit.orange.service.MenuService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/menu")
public class MenuController {
	
	private final MenuService menuService;
	@PostMapping("/list")
	public String findAll(@RequestBody List<MenuDTO> menuDTO) throws JsonProcessingException {
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
