package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {


  public static <T> T getFirstElement(List<T> list) {
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    return list.get(0);
  }

  public static <T> T getLastElement(List<T> list) {
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("Список пуст или равен null");
    }
    return list.get(list.size() - 1);
  }

  public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
    if (list1 == null || list2 == null) {
      throw new IllegalArgumentException("Один из списков равен null");
    }
    List<T> result = new ArrayList<>();
    for (T item : list1) {
      result.add(item);
    }
    for (T item : list2) {
      result.add(item);
    }
    return result;
  }

  public static <T> List<T> getUniqueElements(List<T> list) {
    if (list == null) {
      throw new IllegalArgumentException("Список равен null");
    }
    List<T> unique = new ArrayList<>();
    for (T item : list) {
      if (!unique.contains(item)) {
        unique.add(item);
      }
    }
    return unique;
  }
}
