package fruit.orange.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fruit.orange.vo.BoardVO;

@Repository
public class BoardDAO {
    public List<BoardVO> selectBoardList() {
    	/*
        List<BoardVO> boardList = sqlSession.selectList("board.getBoardList");
        return boardList;
        */    	
    	
        BoardVO board =  new BoardVO();
        board.setNo(1L);
        board.setTitle("게시판입니다.");
        board.setContents("안녕하세요. 첫 게시판 입니다.");
        board.setRegName("홍길동");
        board.setRegDate("2024-04-03");
        board.setHit(111);        
        board.setUserNo(1L);
        List<BoardVO> boardList = new ArrayList<>();
        boardList.add(board);
        return boardList;
        
    }
}
