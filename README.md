Task -1 

1.Order Bean

	- order details
	-id,quantity,productid
2.Product Bean
	
	-id,name,quantity,description,price

3.ProductDBStore

	-Provides products list

4.OrderService

	-processorder(order order)
	will check the available quantity, if there are sufficient products, 
	order will be accepted