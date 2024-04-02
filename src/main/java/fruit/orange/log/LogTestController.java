package fruit.orange.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/log-test")
	public String logTest() {
		String name = "Spring";
		
		//System.out.println("name = " + name);
		
		log.trace("trace log={}", name);	//
		log.debug("debug log={}", name);	//디버그 할 때 보는 것(개발서버 같은 곳에서)
		log.info(" info log={}", name);		//비즈니스 정보(운영시스템에서 봐야할 정보)
		log.warn(" warn log={}", name);		//경고
		log.error(" error log={}", name);	//이슈
		
		return "ok";
	}
	
}
