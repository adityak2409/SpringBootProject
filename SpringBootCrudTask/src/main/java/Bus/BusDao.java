package Bus;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Product.ProductEntity;

@Repository
public class BusDao {
@Autowired
SessionFactory sf;
  
public List<BusEntity> info1() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(BusEntity.class);
	criteria.add(Restrictions.lt("price",200));
    List<BusEntity>aj	= criteria.list();
	session.close();
	return aj;
}
}
