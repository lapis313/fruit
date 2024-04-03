package fruit.orange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fruit.orange.mapper.TestMapper;
import fruit.orange.vo.TestVO;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;

	public List<TestVO> selectMember() {
		List<TestVO> vos = testMapper.selectMember();
		return vos;
	}
}