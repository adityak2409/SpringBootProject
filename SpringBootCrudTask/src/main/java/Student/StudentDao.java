package Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class StudentDao {
@Autowired
SessionFactory sf;



public StudentEntity m1() {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	StudentEntity s = new StudentEntity();
	s.setId(4);
	s.setEmail("om@gmail.com");
	s.setName("omkar");
    session.save(s);
	tr.commit();
	session.close();
	return s;
}


	
}
