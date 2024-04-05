package fruit.orange.repository;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import fruit.orange.dto.BoardDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
	
	private final SqlSessionTemplate sql;
	public void save(BoardDTO boardDTO) {
		sql.insert("Board.save", boardDTO);
	}
	 
	public List<BoardDTO> findAll(){
		return sql.selectList("Board.findAll");
	}
	
	public void updateHits(Long id){
		sql.update("Board.updateHits", id);
	}
	
	public BoardDTO findById(Long id){
		return sql.selectOne("Board.findById", id);
	}
	
	public void update(BoardDTO boardDTO){
		sql.update("Board.update", boardDTO);
	}
	
}