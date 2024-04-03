package fruit.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fruit.orange.dto.BoardDTO;
import fruit.orange.service.BoardService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("/board/save")	//주소
	public String save() {		//저장할 메소드
		return "/board/save";	//리턴할 화면의 이름
	}
	
	@PostMapping("/board/save")	//save.html에서 method="post"라서 post로 받는다
	public String save(@ModelAttribute BoardDTO boardDTO){//@ModelAttribute는 생략도 가능하다(생략해도 상관X)
		System.out.println("boardDTO=" + boardDTO);
		boardService.save(boardDTO);
		return "index";
	}
	
}
