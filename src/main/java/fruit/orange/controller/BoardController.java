package fruit.orange.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "redirect:/board/list";
	}
	
	@GetMapping("/board/list")
	public String findAll(Model model){
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		System.out.println("boardDTOList = " + boardDTOList);
		return "/board/list";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id, Model model){
		//조회수 처리
		boardService.updateHits(id);
		
		//상세내용 가져오기
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		System.out.println("boardDTO = " + boardDTO);
		return "/board/detail";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Long id, Model model){
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "/board/update";
	}
	
	@PostMapping("/update/{id}")
	public String update(BoardDTO boardDTO, Model model){
		boardService.update(boardDTO);
		BoardDTO dto = boardService.findById(boardDTO.getId());
		model.addAttribute("board",dto);
		return "/board/detail";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id){
		boardService.delete(id);
		return "redirect:/board/list";
	}
	
}
