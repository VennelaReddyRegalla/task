package com.mtc.orderservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDBStore {

	List<ProductBean> products = new ArrayList<ProductBean>();
	int i = 1;

	public void addProduct() {
		ProductBean product = new ProductBean();
		Scanner input = new Scanner(System.in);

		product.setId(i);
		i++;
		System.out.print("Enter Product Name:  ");
		String name = input.nextLine();
		product.setName(name);
		System.out.print("Enter Product Description: ");
		String description = input.nextLine();
		product.setDescription(description);
		System.out.print("Enter Product Price: ");
		Float price = input.nextFloat();
		product.setPrice(price);
		System.out.print("Enter Product Quantity: ");
		int quantity = input.nextInt();
		product.setQuantity(quantity);

		products.add(product);

	}

}
