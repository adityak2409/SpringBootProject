package Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   @Autowired
   ProductDao d;
   
   ProductEntity info() {
		  ProductEntity aa = d.info();
		  return aa;
		  }
   
   ProductEntity info1() {
	   ProductEntity ab= d.info();
	   return ab;
   }
   
}
