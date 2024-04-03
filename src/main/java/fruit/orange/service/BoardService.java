package fruit.orange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fruit.orange.mapper.BoardMapper;
import fruit.orange.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardMapper testMapper;

	public List<BoardVO> selectMember() {
		List<BoardVO> vos = testMapper.selectMember();
		return vos;
	}
}