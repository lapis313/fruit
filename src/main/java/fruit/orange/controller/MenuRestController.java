package fruit.orange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fruit.orange.dto.MenuDTO;
import fruit.orange.service.MenuService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/menu")
public class MenuRestController {

	private final MenuService menuService;

	@GetMapping("/list2")
	public String findTree() {
		String rtn = menuService.findTree();
		System.out.println("test : "+rtn);
		return rtn;
	}
	/**
	@GetMapping(value="/list2", produces="application/json")
	public String findTree(){
		String rtn = menuService.findTree();
		return rtn;
	}
	*/
	/**
	public String findTree() throws Exception {
	//public String findTree(@RequestBody MenuDTO menuDTO) throws Exception {
		String rtn = "";
		rtn = menuService.findTree();
		return rtn;
	}
	*/
}
