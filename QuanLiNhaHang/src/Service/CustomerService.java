/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Manager.ManagerCus;
import java.sql.SQLException;
import java.util.List;
import model.Customer;

/**
 *
 * @author AD
 */
public class CustomerService {
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
}
