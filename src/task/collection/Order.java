package task.collection;
 public class Order {
    private final int id;
    private final String customer;
    private final int totalAmount;

    public Order(int id, String customer, int totalAmount) {
      this.id = id;
      this.customer = customer;
      this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
      return totalAmount;
    }

    @Override
    public String toString() {
      return "Order: " + id + " | " + customer + " | " + totalAmount + " ₽";
    }
  }