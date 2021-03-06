package com.widebidders.models.db;

import java.util.List;
import java.util.Map;

import com.widebidders.models.entities.Customer;
import com.widebidders.models.entities.LoginEntity;

public interface CustomerDao {
	public List getCustomers();
	public int addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);
	public void updateCustomer(Customer customer);
	public String getCustomerByEmail(String email);
	public Customer loginAuthentication(LoginEntity login);
	public String getMailId(int id);
}
