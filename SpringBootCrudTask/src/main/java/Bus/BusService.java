package Bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Product.ProductEntity;
@Service
public class BusService {
@Autowired
BusDao d;
 
List<BusEntity> info1() {
	   List<BusEntity> ab= d.info1();
	   return ab;
}
	

}
