package Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
  @Autowired
  ProductService sm;
  
  @PostMapping("/sendrecord")
  ProductEntity info() {
	  ProductEntity aa = sm.info();
	  return aa;
	}
  
  @GetMapping("/getrecord")
  ProductEntity info1() {
  ProductEntity ab= sm.info1();
  return ab;
  }
  
	
}
