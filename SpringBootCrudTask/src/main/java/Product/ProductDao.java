package Product;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class ProductDao {
@Autowired
SessionFactory sf;

public ProductEntity info() {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		ProductEntity s = new ProductEntity();
		s.setName("Aditya");
		s.setPrice(20000);
		s.setProductId(5);
		session.save(s);
		tr.commit();
		session.close();
		return s;
	}

public List<ProductEntity> info3() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(ProductEntity.class);
	criteria.add(Restrictions.lt("yash",40000));
    List<ProductEntity>aj	= criteria.list();
	session.close();
	return aj;
}
	
}

	
		


		


