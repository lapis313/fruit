package fruit.orange.board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class BoardRepositoryTest {

	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new Date();
	String nowTime = sdf1.format(now);

	BoardRepository boardRepository = new BoardRepository();
	
	@AfterEach
	void afterEach() {
		boardRepository.clearMboard();
	}
	
	@Test
	void save() {
		//given
		//Board board = new Board("testA","김길동",nowTime);
		Board board = new Board();
		
		//when
		Board saveBoard = boardRepository.save(board);
		
		//then
		Board findBoard = boardRepository.findById(board.getId());
		Assertions.assertThat(findBoard).isEqualTo(saveBoard);
		
	}
	
	@Test
	void findAll() {
		//given
		//Board board = new Board("testB","이길동",nowTime);
		Board board1 = new Board();
		//Board board = new Board("testC","박길동",nowTime);
		Board board2 = new Board();
		
		//when
		boardRepository.save(board1);
		boardRepository.save(board2);
		
		//then
		List<Board> result = boardRepository.findAll();
	}
	
	@Test
	void updateBoard() {
		//given
		//Board board = new Board("testB", "이길동", nowTime);
		Board board = new Board();
		
		Board saveBoard = boardRepository.save(board);
		Long boardId = saveBoard.getId();
		
		//when
		//Board updateParam = new Board("testC", "박길동", nowTime);
		Board updateParam = new Board();
		boardRepository.update(boardId, updateParam);
		
		//then
		Board findBoard = boardRepository.findById(boardId);
		Assertions.assertThat(findBoard.getBoardName()).isEqualTo(updateParam.getBoardName());
		Assertions.assertThat(findBoard.getRegName()).isEqualTo(updateParam.getRegName());
		Assertions.assertThat(findBoard.getRegDate()).isEqualTo(updateParam.getRegDate());
		
	}
	
}
