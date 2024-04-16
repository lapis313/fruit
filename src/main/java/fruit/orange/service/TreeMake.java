package fruit.orange.service;

import java.util.ArrayList;
import java.util.List;

import fruit.orange.dto.MenuDTO;

public class TreeMake {
	
	public List<MenuDTO> formatTree(List<MenuDTO> list) {	
		MenuDTO root = new MenuDTO();
		MenuDTO node = new MenuDTO();		
		List<MenuDTO> treelist = new ArrayList<MenuDTO>();
		List<MenuDTO> parentnodes = new ArrayList<MenuDTO>();		
		if (list != null && list.size() > 0){			
			root = list.get(0);
			//for문을 순회하며, root노드와 id값이 일치하는지 여부를 확인 후에, 자식노드로 넣는다. 
			for (int i = 1; i < list.size(); i++) {				
				node = list.get(i);
				if (node.getParent_id().equals(root.getId())) {
					parentnodes.add(node);
					root.getChildren().add(node);
				} else {
					getChildrenNodes(parentnodes, node);
					parentnodes.add(node);
				}				
			}			
		}
		treelist.add(root);		
		return treelist;		
	}

	//현재까지 들어온 노드 중에서 부모노드를 찾아 해당하는 부모노드의 자식으로 넣는다
	private static void getChildrenNodes(List<MenuDTO> parentnodes, MenuDTO node) {	
		for (int i = parentnodes.size() - 1; i >= 0; i--) {
			MenuDTO pnode = parentnodes.get(i);
			if (pnode.getId().equals(node.getParent_id())) {				
				pnode.getChildren().add(node);
				return;			
			} else {
			}
		}
	} 	
	
}
