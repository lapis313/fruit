package fruit.orange.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import fruit.orange.dto.MenuDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MenuRepository {
	
	private final SqlSessionTemplate sql;
	
	public List<MenuDTO> findAll(){
		return sql.selectList("Menu.findAll");
	}
	
	public List<MenuDTO> findTree(){
		return sql.selectList("Menu.findTree");
	}
	
}
