package Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentDao d;

	public StudentEntity m1() {
    StudentEntity ee = d.m1();
		return ee;
	}


}
