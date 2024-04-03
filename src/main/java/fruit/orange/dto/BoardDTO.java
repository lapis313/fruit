package fruit.orange.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	private Long id;			//글 번호
	private String regName;		//작성자
	private String regPw;		//비밀번호
	private String title;		//제목
	private String contents;	//내용
	private int hits;			//조회수
	private String regDate;		//등록일	
}
