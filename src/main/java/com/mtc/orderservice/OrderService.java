package com.mtc.orderservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
	static ProductDBStore store = new ProductDBStore();
	static OrderService service = new OrderService();
	List<OrderBean> orders = new ArrayList<OrderBean>();

	int ordId = 1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = 0;
		while (p == 0) {
			System.out.println("-------------------------------");
			System.out.println("Select from the following Menu");
			System.out.println("-------------------------------");
			System.out.println("1. Add Product");
			System.out.println("2. Place Order");
			System.out.println("3. Exit");

			System.out.print("Enter Your Choice : ");

			int i = input.nextInt();
			switch (i) {

			case 1:
				store.addProduct();

				break;

			case 2:
				service.addOrder();

				break;

			case 3:
				p = 1;

				break;

			}
		}
	}

	public void addOrder() {
		int k = 0;
		OrderBean order = new OrderBean();
		Scanner input = new Scanner(System.in);
		
		while (k == 0) {
			boolean flag = false;
			System.out.flush();
			List<ProductBean> products = store.products;
			System.out.println("---------------------------------------");
			System.out.println("Place the order from following Products");
			System.out.println("---------------------------------------");

			for (ProductBean product : products) {
				System.out.println("ID: " + product.getId() + " Name: " + product.getName() + " Price: "
						+ product.getPrice() + " Available Quantity: " + product.getQuantity() + " Description: "
						+ product.getDescription());
			}

			System.out.println("Enter the product id you want to order: ");
			int prodid = input.nextInt();
			System.out.println("Enter the quantity you want to order");
			int quant = input.nextInt();
			for (ProductBean product : products) {
				if (product.getId() == prodid) {
					if (product.getQuantity() >= quant) {
						flag = true;
						product.setQuantity(product.getQuantity() - quant);
						store.products = products;
					}
				}
			}
			
			if (flag == false)
				System.out.println(
						"We cannot place the order. Your required quantity is greater that available quantity");
			else {
				System.out.println("your order is placed");
				order.setId(ordId);
				ordId++;
				order.setProductid(prodid);
				order.setQuantity(quant);
				orders.add(order);
				System.out.println("Your order details are Order ID: " + order.getId() + " Product ID: "
						+ order.getProductid() + " Quantity: " + order.getQuantity());
				System.out.println("---------------------------------------");
				System.out.println("Available Products after your order");
				System.out.println("---------------------------------------");

				for (ProductBean product : products) {
					System.out.println("ID: " + product.getId() + " Name: " + product.getName() + " Price: "
							+ product.getPrice() + " Available Quantity: " + product.getQuantity() + " Description: "
							+ product.getDescription());
				}

			}

			System.out.println( "press 0 to place another order, 1 to return to main menu: ");
			k = input.nextInt();
		}
		

	}

}
