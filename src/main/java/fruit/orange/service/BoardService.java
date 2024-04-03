package fruit.orange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fruit.orange.repository.BoardDAO;
import fruit.orange.vo.BoardVO;

@Service
public class BoardService {
    @Autowired
    private BoardDAO boardDAO;


    public List<BoardVO> getBoardList(){

        return boardDAO.selectBoardList();

    }
}