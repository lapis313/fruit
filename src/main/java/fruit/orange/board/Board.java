package fruit.orange.board;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Board {

	private Long id;
	private String boardName;
	private String regName;
	private Date regDate;
	
	public Board() {		
	}

	public Board(String boardName, String regName, Date regDate) {
		//super();
		this.boardName = boardName;
		this.regName = regName;
		this.regDate = regDate;
	}	
	
	
	
}
