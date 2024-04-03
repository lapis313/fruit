package fruit.orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fruit.orange.service.BoardService;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private BoardService boardService;  	
    @RequestMapping("/board")
    public String getBoardList(Model model){
        return "view/board";
    }   
}

