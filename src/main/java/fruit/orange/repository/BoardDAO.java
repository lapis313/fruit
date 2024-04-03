package fruit.orange.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fruit.orange.vo.BoardVO;

@Repository
public class BoardDAO {
    public List<BoardVO> selectBoardList() {
        BoardVO board =  new BoardVO();
        board.setNo(1L);
        board.setTitle("게시판입니다.");
        board.setContents("안녕하세요. 첫 게시판 입니다.");
        board.setRegName("홍길동");
        board.setRegDate("2019-11-16");
        board.setHit(111);        
        board.setUserNo(1L);
        List<BoardVO> boardList = new ArrayList<>();
        boardList.add(board);
        return boardList;
    }
}
