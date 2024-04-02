package fruit.orange.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {

	private static final Map<Long, Board> mboard = new HashMap<>();	//static
	private static long sequence = 0L; //static
	
/*
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new Date();
	String nowTime = sdf1.format(now);	
 */
	
	public Board save(Board board) {
		board.setId(++sequence);
		mboard.put(board.getId(),board);
		return board;
	}

	public Board findById(Long id) {
		return mboard.get(id);
	}
	
	public List<Board> findAll(){
		return new ArrayList<>(mboard.values());
	}

	public void update(Long boardId, Board updateParam) {
		Board findBoard = findById(boardId);
		findBoard.setBoardName(updateParam.getBoardName());
		findBoard.setRegName(updateParam.getRegName());
		findBoard.setRegDate(updateParam.getRegDate());
	}

	public void clearMboard() {
		mboard.clear();
	}
	
}
