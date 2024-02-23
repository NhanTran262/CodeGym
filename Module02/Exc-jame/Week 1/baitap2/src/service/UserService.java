package service;

import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserService {
    public static Scanner sc = new Scanner(System.in);
    protected static List<User> users = new ArrayList<>();

    private static void addInfoToUser(User user, int id) {
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        user.setPassword(password);
        System.out.println("Nhập name: ");
        String name = sc.nextLine();
        user.setName(name);
        user.setId(id);

        if (user instanceof Customer) {
            long soDu = new Long(sc.nextLine());
            ((Customer) user).setSoDu(soDu);
        } else if (user instanceof Seller) {
            String nameStore = sc.nextLine();
            String doanhSo = sc.nextLine();
            ((Seller) user).setNameStore(nameStore);
            ((Seller) user).setDoanhSo(doanhSo);
        } else if (user instanceof Manager) {
            String luong = sc.nextLine();
            ((Manager) user).setLuong(luong);
        }

    }

//    private static Customer inputCustomer() {
////      System.out.println("Nhập id: ");
////      String id = sc.nextLine();
////      System.out.println("Nhập password: ");
////      String password = sc.nextLine();
////      System.out.println("Nhập name: ");
////      String name = sc.nextLine();
//        input();
//        System.out.println("Nhập số dư: ");
//        long soDu = sc.nextLong();
//        sc.nextLine();
//        Customer customer = new Customer(User.getId(),User.getPassword(),User.getName(),soDu);
//        return customer;
//    }

//    private static Admin inputAdmin() {
////        System.out.println("Nhập id: ");
////        String id = sc.nextLine();
////        System.out.println("Nhập password: ");
////        String password = sc.nextLine();
////        System.out.println("Nhập name: ");
////        String name = sc.nextLine();
//        input();
//        Admin admin = new Admin(User.getId(), User.getPassword(), User.getName());
//        return admin;
//    }
//
//    private static Seller inputSeller() {
////        System.out.println("Nhập id: ");
////        String id = sc.nextLine();
////        System.out.println("Nhập mật khẩu: ");
////        String password = sc.nextLine();
////        System.out.println("Nhập tên: ");
////        String name = sc.nextLine();
//        input();
//        System.out.println("Nhập tên cửa hàng");
//        String nameStore = sc.nextLine();
//        System.out.println("Nhập doanh số: ");
//        String doanhSo = sc.nextLine();
//        Seller seller = new Seller(User.getId(),User.getPassword(),User.getName(), nameStore, doanhSo);
//        return seller;
//    }
//
//    private static Manager inputManager() {
////        System.out.println("Nhập id: ");
////        String id = sc.nextLine();
////        System.out.println("Nhập mật khẩu: ");
////        String password = sc.nextLine();
////        System.out.println("Nhập tên: ");
////        String name = sc.nextLine();
//        input();
//        System.out.println("Nhập lương: ");
//        String luong = sc.nextLine();
//        Manager manager = new Manager(User.getId(), User.getPassword(), User.getName(), luong);
//        return manager;
//    }

    public static void addListUser() {

        User user;
        int index = 0;
        while (true) {
            System.out.println("Nhập user: ");
            String input = sc.nextLine();

            switch (input) {
                case "Customer": {
                    user = new Customer();
                    break;
                }
                case "Admin": {
                    user = new Admin();
                    break;
                }
                case "Seller": {
                    user = new Seller();
                    break;
                }
                case "Manager": {
                    user = new Manager();
                    break;
                }
                default: {
                    user = new User();
                    break;
                }
            }
            addInfoToUser(user,index);
            UserService.addToArray(user);
            index++;

        }
    }

    public static void addToArray(User user) {
        users.add(user);
    }

    public static User getUser(int index) {
        return users.get(index);
    }

    public static void printList() {
        for (User user : users) {
            System.out.println(user);
        }
    }
//      public static void printList(){
//      for (int index=0; index<users.size();index++){
//         System.out.println(users.get(index));
//      }
//      }
//      public static void printList(){
//      int index = 0;
//      while (index<users.size()){
//         System.out.println(users.get(index));
//         index++;
//      }
//      }
//      public static void printList(){
//      int index = 0;
//      do {
//         System.out.println(users.get(index));
//         index++;
//      } while (index<users.size());
//      }
}




