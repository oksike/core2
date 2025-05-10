package task.collection;

public class AttendanceStudent {
  private String name;
  private String attendance;

  public AttendanceStudent(String name, String attendance) {
    this.name = name;

    this.attendance = attendance;
  }

  public String getName() {
    return name;
  }

  public String getAttendance() {
    return attendance;
  }

  @Override
  public String toString() {
    return "AttendanceStudent{name='" + name + "', attendance='" + attendance + "'}";
  }

}