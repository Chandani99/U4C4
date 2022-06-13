package Question4;
import java.util.*;

public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList(Product product) {
		if(productList.contains(product)) {
			System.out.println("Product already exists.");
			int count1=product.getCount();
			product.count=product.getCount()+count1;
		}
		else {
			productList.add(product);
			System.out.println("Product Added successfully.");
		}
	}
	
	List<Product> showAllProduct(){

		return productList;
		
	}
}
