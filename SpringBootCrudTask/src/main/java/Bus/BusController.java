package Bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Product.ProductEntity;

@RestController
public class BusController {
@Autowired
BusService sm;

@GetMapping("/getrecord")
List<BusEntity> info1() {
	List<BusEntity> ab= sm.info1();
  return ab;
  }
 
   
}
