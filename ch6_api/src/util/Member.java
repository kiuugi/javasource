package util;

import static java.lang.Math.pow;

import java.util.Objects;

public class Member {

  //멤버변수
  private String id;

  private String name;

  // getset구문들
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // defalt 생성자
  public Member() {}

  @Override
  public String toString() {
    return "Member [id=" + id + ", name=" + name + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;

      return this.name.equals(member.name) && this.id.equals(member.id); // name, id 둘 다 같으면 중복처리
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}
