package fruit.orange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	/*
    @Autowired
    private BoardService boardService;

    @RequestMapping("/main") //
    public String getBoardList(Model model){
        List<BoardVO> boardList =  boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "views/board/board"; // board.html 파일 경로매핑
    }
    */
}
//참고 -> https://dbjh.tistory.com/11