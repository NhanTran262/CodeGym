package service.impl;

import constant.Constants;
import constant.EDepartment;
import constant.EPosition;
import entity.*;
import service.ISender;

import java.io.*;
import java.util.*;

public class UserService implements Serializable {
    private static List<User> users;
    private static ISender sendMail;
    private static int userId;
    private static final String FILE_USER;
    private static final Scanner scanner;


    static {
        userId = 1000;
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
        FILE_USER = "src/data/user_data.csv";
    }

    public UserService(ISender isender) {
        sendMail = isender;
    }

    public static void createAdminAccount() {
        userId++;
        User user = new Admin(userId, "admin", "admin");
        users.add(user);


    }

    public static void writeFile(String data) {
        try {
           File file = new File(FILE_USER);
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
           bufferedWriter.write(users.toString());
           bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void loadToFile() throws RuntimeException {
        if (FILE_USER.length() != 0) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_USER));
                users = (List<User>) objectInputStream.readObject();
                objectInputStream.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void addUserEmployeeToList(int userId, String username, String password, String name, EDepartment department, EPosition position, long salary) {
        User user = createUserEmployee(userId, username, password, name, department, position, salary);
        users.add(user);
//        saveToFile();
//        sendMail.send("tranhoangnhan262@gmail.com");

    }


    public static void addUserCustomerToList(int userId, String username, String password, String name, int idCard, Address address) {
        User user = createUserCustomer(userId, username, password, name, idCard, address);
        users.add(user);
//        saveToFile();
    }

    public static User createUserEmployee(int userId, String username, String password, String name, EDepartment department, EPosition position, long salary) {
        return new Employee(userId, username, password, name, department, position, salary);
    }

    public static Address createAddress() {
        Address address;
        System.out.println("Enter house number: ");
        String number = scanner.nextLine();
        System.out.println("Enter district: ");
        String district = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        address = new Address()
                .number(number)
                .district(district)
                .city(city);
        return address;
    }

    public static void displayEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Employee) {
                employees.add((Employee) user);
            }
        }
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty.");
        } else {
            System.out.println("Employee list:");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }

    }

    public static User createUserCustomer(int userId, String username, String password, String name, int idCard, Address address) {
        return new Customer(userId, username, password, name, idCard, address);
    }

    public static void displayCustomer() {
        List<Customer> customers = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Customer) {
                customers.add((Customer) user);
            }
        }
        if (customers.isEmpty()) {
            System.out.println("Customer list is empty.");
        } else {
            System.out.println("Customer list:");
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        }
    }

    public static User loginInByUser(String username, String password) {
        for (User user : users) {
            if ((user.getUsername().equals(username))
                    && (user.getPassword().equals(password))) {
                return user;
            }
        }
        return null;
    }

    public static boolean isEmployeeInPosition(EDepartment department, EPosition position, String employeeName) {
        for (User user : users) {
            if (user instanceof Employee) {
                if (((Employee) user).getDepartment().equals(department)
                        && ((Employee) user).getPosition().equals(position)
                        && user.getName().equals(employeeName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isUsernameDuplicate(String username) {
        for (User user : users) {
            if (user != null) {
                if (user.getUsername().equals(username)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static User findSaleStaffByName(String staffName) {
        for (User user : users) {
            if (user instanceof Employee)
                if (user.getName().equals(staffName)
                        && ((Employee) user).getDepartment() == EDepartment.SALE
                        && ((Employee) user).getPosition() == EPosition.STAFF) {
                    return user;
                }
        }
        return null;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserService.userId = userId;
    }
}

