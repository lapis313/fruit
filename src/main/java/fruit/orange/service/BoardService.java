package fruit.orange.service;

import org.springframework.stereotype.Service;

import fruit.orange.dto.BoardDTO;
import fruit.orange.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;

	public void save(BoardDTO boardDTO) {
		//boardRepository.save(boardDTO);		
	}
}
