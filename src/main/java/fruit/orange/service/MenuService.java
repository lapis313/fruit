package fruit.orange.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fruit.orange.dto.MenuDTO;
import fruit.orange.repository.MenuRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {
	
	private final MenuRepository menuRepository;
	
	public List<MenuDTO> findAll(){
		return menuRepository.findAll();
	}
	
}
