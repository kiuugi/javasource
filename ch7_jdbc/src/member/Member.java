package member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok 도구(외부 다운로드)로 get,set,constructor 등 편하게 생성함. JAVA PROJECTS 에서 Referenced Libraries 에서 추가함.

//~DTO : 생성자, getter, setter, toString
// @Data : toString, Getter, Setter, defalt 생성자, equals

//@Data
@Getter
@Setter
@ToString
@NoArgsConstructor // degault 생성자
@AllArgsConstructor // 멤버 변수 모두 포함 생성자
public class Member {

  private String id;
  private String name;
  private String password;
}
