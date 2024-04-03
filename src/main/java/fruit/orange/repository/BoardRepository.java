package fruit.orange.repository;

import org.springframework.stereotype.Repository;

import fruit.orange.dto.BoardDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
/*
	private final SqlSessionTemplate sql;
	public void save(BoardDTO boardDTO) {
		sql.insert("Board.save", boardDTO);
	}
*/
}
