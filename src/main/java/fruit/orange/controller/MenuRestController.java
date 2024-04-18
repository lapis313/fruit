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

	//String
	@GetMapping("/list2")
	public String findTreeStr() {
		String rtn = menuService.findTreeStr();
		return rtn;
	}

	/**테스트2(ArrayList)
	@GetMapping("/list2")
	public List<MenuDTO> findTreeList() {
		List<MenuDTO> rtn = menuService.findTreeArrayList();
		System.out.println("test : "+rtn);
		return rtn;
	}
	*/

}
