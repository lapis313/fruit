package fruit.orange.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;
import fruit.orange.vo.TestVO;

//@Mapper
public interface TestMapper {
	List<TestVO> selectMember();
}