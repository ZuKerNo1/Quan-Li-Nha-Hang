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
    public List<Customer> find(String find_354) throws SQLException{
        return managerCus_354.findCustomer_354(find_354);
    }
}
