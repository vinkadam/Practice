package com.example.readers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.example.model.Customer;
import com.example.model.CustomerAddress;

public class JAXBExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("Vinay");
		customer.setAge(26);
		customer.setId(1);
		
		List<CustomerAddress> addresses = new ArrayList<CustomerAddress>();
		CustomerAddress address = new CustomerAddress();
		address.setCity("Pune");
		address.setPincode(411061);
		address.setId(11);
		
		CustomerAddress address2 = new CustomerAddress();
		address2.setCity("Mumbai");
		address2.setPincode(400024);
		address2.setId(12);
		
		addresses.add(address);
		addresses.add(address2);
		
		customer.setAddress(addresses);
		
		try {
			
			File file = new File("C:\\CME\\file.xml");
			
			JAXBContext context = JAXBContext.newInstance(Customer.class);
			
			/*Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customer, System.out);
			
			marshaller.marshal(customer, file);*/
			
			Unmarshaller unmarshal = context.createUnmarshaller();
			Customer customer2 =  (Customer) unmarshal.unmarshal(file);
			System.out.println(customer2);
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		

	}

}
