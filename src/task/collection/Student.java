package task.collection;
import java.util.Objects;

public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
  }


@Override
public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Student)) return false;
  Student student = (Student) o;
  return age == student.age && name.equals(student.name);
}

@Override
public int hashCode() {
  return Objects.hash(name, age);
}
}
