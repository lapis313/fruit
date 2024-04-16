package fruit.orange.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fruit.orange.dto.MenuDTO;
import fruit.orange.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Service
@RequiredArgsConstructor
@ToString
public class MenuService {
	
	private final MenuRepository menuRepository;
	
	public List<MenuDTO> findAll(){
		List<MenuDTO> list = menuRepository.findAll();
		TreeMake tree = new TreeMake();
		List<MenuDTO> rtn = tree.formatTree(list);		
		return rtn;
		//String jsonString = "";	//json으로 넘길 때
		/**
		try {
			
			List<MenuDTO> result = new ArrayList<MenuDTO>();	//데이터 그릇
			List<MenuDTO> list = menuRepository.findAll();		//DB데이터
			int i = 0;
			for(MenuDTO menuDTO : list) {
			//for(int i=0; i<list.size(); i++) {
				MenuDTO node = list.get(i);
				node.setNode_id(node.getId());
				node.setNode_pid(node.getParent_id());
				node.setMenu_name(node.getMenu_name());
				result.add(node);
				i++;
			}
			TreeMake tree = new TreeMake();
			List<MenuDTO> rtn = tree.formatTree(result);

			
			//json으로 넘길 때
			//ObjectMapper objectMapper = new ObjectMapper();		//json
			//jsonString = objectMapper.writeValueAsString(out);	//json
			return rtn;
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		return menuRepository.findAll();
		*/
		//return jsonString;	//json
	}
	
}
