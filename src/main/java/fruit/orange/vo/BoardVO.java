package fruit.orange.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data				//getter / setter / toString() 메서드 사용이 가능하다.
@NoArgsConstructor	//파라미터가 없는 기본 생성자를 생성해준다.
@AllArgsConstructor	//모든 필드에 대한 생성자를 생성한다. 의존성 주입 할 대상이 많아졌을 때 훨씬 깔끔하다
public class BoardVO {
    private Long no;
    private String title;
    private String contents;    
    private String regName;
    private String regDate;
    private int hit;
    private int groupNo;
    private int orderNo;
    private int depth;
    private Long parentNo;
    private Long userNo;  
}