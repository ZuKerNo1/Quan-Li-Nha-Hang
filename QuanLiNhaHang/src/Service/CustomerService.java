/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Manager.ManagerCus;
import java.sql.SQLException;
import java.util.List;
import model.Customer;
<<<<<<< HEAD
=======
import model.DatBan;
>>>>>>> DatBan

/**
 *
 * @author AD
 */
public class CustomerService {
<<<<<<< HEAD
    private ManagerCus managerCus_354;
    public CustomerService(){
        managerCus_354 = new ManagerCus();
    }
    public List<Customer> getAllCustomers() throws SQLException{
        return managerCus_354.getAllCustomers_354();
    }
    public void addCustomer(Customer customer_354) throws SQLException{
        managerCus_354.addCustomer_354(customer_354);
    }
    public void deleteCustomer(String id_354) throws SQLException{
        managerCus_354.deleteCustomer_354(id_354);
    }
    public void updateCustomer(Customer customer_354) throws SQLException{
        managerCus_354.updateCustomer_354(customer_354);
    }
    public Customer getCustomerById(String sdt_354) throws SQLException{
        return managerCus_354.getCustomerById_354(sdt_354);
    }
    public Customer find(String find_354) throws SQLException{
        return managerCus_354.findCustomer_354(find_354);
    }
=======
    private ManagerCus managerCus;
    public CustomerService(){
        managerCus = new ManagerCus();
    }
    public List<Customer> getAllCustomers() throws SQLException{
        return managerCus.getAllCustomers();
    }
    public void deleteCustomer(String id) throws SQLException{
        managerCus.deleteCustomer(id);
    }
    public void updateCustomer(Customer customer) throws SQLException{
        managerCus.updateCustomer(customer);
    }
    public Customer getCustomerById(String sdt) throws SQLException{
        return managerCus.getCustomerById(sdt);
    }
    public Customer find(String find) throws SQLException{
        return managerCus.findBook(find);
    }

    public void addCustomer(Customer customer) throws SQLException {
        managerCus.addCustomer(customer);
    }

    
>>>>>>> DatBan
}
