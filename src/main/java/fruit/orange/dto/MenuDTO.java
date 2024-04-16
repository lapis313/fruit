package fruit.orange.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuDTO {
	private Long id;			//id
	private Long parent_id;		//부모의 id
	private String menu_cd;		//메뉴코드
	private String menu_name;	//메뉴이름
	private String menu_url;	//주소
	private Long list_order;	//정렬번호
	private List<MenuDTO> children = new ArrayList<MenuDTO>();
}
