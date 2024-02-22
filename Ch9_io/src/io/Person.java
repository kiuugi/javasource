package io;

import java.io.Serializable;

// java.io.NotSerializableException: io.Person

public class Person implements Serializable { // implements Serializable 직렬화시키기

  private String name;
  private String job;
  private transient String tel; // transient : 직렬화 대상에서 제외 / 입출력 금지.

  public Person(String name, String job, String tel) {
    this.name = name;
    this.job = job;
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", job=" + job + ", tel=" + tel + "]";
  }
}
