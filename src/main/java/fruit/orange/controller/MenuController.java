package fruit.orange.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@GetMapping("/list2")
	public String findTreeView(){
		return  "menu/list2";
	}

	@GetMapping("/list2-data")
	@ResponseBody
	public String findTreeStr(){
		String rtn = "";
		rtn = menuService.findTreeStr();
		return  rtn;
	}

	@GetMapping("/list2-allData")
	@ResponseBody
	public List<MenuDTO> findAllData(){
		List<MenuDTO> menuDTOList = menuService.findTree();
		return menuDTOList;
	}

/*
	@GetMapping("/list2")
	@ResponseBody
	public String findTreeStr2() throws IOException{
		String rtn = "";
		rtn = menuService.findTreeStr();
		return rtn;
	}
*/
}
