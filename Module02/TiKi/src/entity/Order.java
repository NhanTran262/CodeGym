package entity;

import service.CustomerService;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private List<OrderLine> orderLines;
    private Address address = new Address();
    private int orderId;
    private long total;
    private int customerId;

    public Order(List<OrderLine> orderLines, Address address, int orderId, long total, int customerId) {
        this.orderLines = orderLines;
        this.address = address;
        this.orderId = orderId;
        this.total = total;
        this.customerId = customerId;
    }


    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "address=" + address +
                ", orderLines=" + orderLines +
                ", orderId=" + orderId +
                ", total=" + total +
                ", customer=" + CustomerService.getCustomerById(customerId).getUsername() +
                '}';
    }
}
