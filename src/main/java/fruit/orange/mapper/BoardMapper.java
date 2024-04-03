package fruit.orange.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;
import fruit.orange.vo.BoardVO;

//@Mapper
public interface BoardMapper {
	List<BoardVO> selectMember();
}