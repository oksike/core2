package task.collection;

import java.util.*;

public class Collection {

  //1
  public int findMaxElement(List<Integer> list) {
    int max = list.get(0);
    for (int i: list) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }
  // for (int i = 0; i < list.size(); i++) {
  //    int num = list.get(i);

  //2
  public List<Integer> removeDuplicates(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : list) {
      if (!result.contains(num)) { // Если элемент еще не добавлен
        result.add(num);         // Добавляем его
      }
    }
    return result;
  }

//3
  public List<Integer> sortDescending(List<Integer> list) {
    List<Integer> sortedList = new ArrayList<>(list);

    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - i - 1; j++) {
        if (sortedList.get(j) < sortedList.get(j + 1)) {
          int temp = sortedList.get(j);
          sortedList.set(j, sortedList.get(j + 1));
          sortedList.set(j + 1, temp);
        }
      }
    }

    return sortedList;
  }

//4
  public boolean containsElement(Set<Integer> set, int element) {
    for (int num : set) {
      if (num == element) {
        return true;
      }
    }
    return false;
  }

//5
  public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> intersection = new HashSet<>();
    for (int num : set1) {
      if (set2.contains(num)) {
        intersection.add(num);
      }
    }

    return intersection;
  }


//6
  public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> result = new HashSet<>();
    for (Integer num : set1) {
      // Если элемента нет в set2, добавляем его в результат
      if (!set2.contains(num)) {
        result.add(num);
      }
    }
    return result;
  }


  //7
  public boolean containsKey(Map<String, Integer> map, String key) {
    for (String currentKey : map.keySet()) {
      if (currentKey.equals(key)) {
        return true;
      }
    }
    return false;
  }

  //8
  public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
    if (map.containsKey(key)) {
      return map.get(key);
    } else {
      return List.of();  // неизменяемый пустой список
    }
  }


  //9
  public void removeEntriesByValue(Map<String, Integer> map, int value) {
    List<String> keysToRemove = new ArrayList<>();

    for (String key : map.keySet()) {
      if (map.get(key) == value) {
        keysToRemove.add(key);
      }
    }

    for (String key : keysToRemove) {
      map.remove(key);
    }
  }


  //10
  public void addToQueue(Queue<Integer> queue, int element) {
    if (queue instanceof LinkedList) {
      ((LinkedList<Integer>) queue).addLast(element);
    }
    else {
      queue.add(element);
    }
  }


  //11
  public Integer pollFromQueue(Queue<Integer> queue) {
    if (queue.isEmpty()) {
      return null;
    }

    if (queue instanceof LinkedList) {
      return ((LinkedList<Integer>) queue).removeFirst();
    }

    return queue.poll();

  }

  //12
  public boolean isQueueEmpty(Queue<Integer> queue) {
    try {
      queue.element();
      return false;
    } catch (NoSuchElementException e) {
      return true;
    }
  }


  //13

  public void printOrdersWithMaxAmount(List<Order> orders) {
    if (orders == null || orders.isEmpty()) {
      System.out.println("Список заказов пуст");
      return;
    }

    int maxAmount = Integer.MIN_VALUE;
    for (Order order : orders) {
      if (order.getTotalAmount() > maxAmount) {
        maxAmount = order.getTotalAmount();
      }
    }


    for (Order order : orders) {
      if (order.getTotalAmount() == maxAmount) {
        System.out.println(order);
      }
    }
  }

  public static int calculateTotalAmount(List<Order> orders) {
    int total = 0;
    for (Order order : orders) {
      total += order.getTotalAmount();
    }
    return total;
  }



  //14
  public int getTotalAmountOfOrders(List<Order> orders) {
    int total = 0;
    for (Order order : orders) {
      total += order.getTotalAmount();
    }
    return total;
  }

  //15
  public void printIncompleteTasks(List<Task> tasks) {
    for (Task task : tasks) {
      if (!task.isCompleted()) {
        System.out.println(task);
      }
    }
  }

  public List<Task> getTasksByTitle(List<Task> tasks, String title) {
    List<Task> result = new ArrayList<>();
    for (Task task : tasks) {
      if (task.getTitle().equalsIgnoreCase(title)) {
        result.add(task);
      }
    }
    return result;
  }

  public void printStudents(List<Student> students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  public List<Student> getStudentsOlderThan(List<Student> students, int age) {
    List<Student> result = new ArrayList<>();
    for (Student student : students) {
      if (student.getAge() > age) {
        result.add(student);
      }
    }
    return result;
  }

  //16
  public void printProductsWithZeroQuantity(List<Product> products) {
    for (Product product : products) {
      if (product.getQuantity() == 0) {
        System.out.println(product);
      }
    }
  }

  public int getTotalQuantityOfProducts(List<Product> products) {
    int total = 0;
    for (Product product : products) {
      total += product.getQuantity();
    }
    return total;
  }

  //17
  public void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
    if (students.isEmpty()) return;

    int minAttendance = 100;
    for (AttendanceStudent student : students) {
      int percent = Integer.parseInt(student.getAttendance().replace("%", ""));
      if (percent < minAttendance) {
        minAttendance = percent;
      }
  }
    for (AttendanceStudent student : students) {
      int percent = Integer.parseInt(student.getAttendance().replace("%", ""));
      if (percent == minAttendance) {
        System.out.println(student);
      }
    }
  }
  //18
  public double getAverageAttendance(List<AttendanceStudent> students) {
    int sum = 0;
    for (AttendanceStudent student : students) {
      String raw = student.getAttendance();
      int value = Integer.parseInt(raw.replace("%", ""));
      sum += value;
    }

    return (double) sum / students.size();
  }

}
//hch


