package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.javafx.webkit.KeyCodeMap.Entry;

import pl.edu.agh.mwo.invoice.product.Product;







public class Invoice {
	
	HashMap<Product, Integer> invoice =  new HashMap<Product, Integer>();
	private BigDecimal subtotal;
	private 
	
	
	
	
	
	
	public void addProduct(Product product) {
		invoice.put(product, 1);
		
		
		
	}

	public void addProduct(Product product, Integer quantity) {
		invoice.put(product, quantity);
	}

	public BigDecimal getSubtotal() {
			subtotal = new BigDecimal(0);
			Iterator<Entry<Product, Integer>> iter = productList.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<Product, Integer> entry = iter.next();
				subtotal = subtotal
						.add((new BigDecimal(entry.getValue()))
								.multiply(entry.getKey().getPrice()));
			}
			return subtotal;
		}
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}
}
