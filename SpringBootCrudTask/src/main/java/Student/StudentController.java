package Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
StudentService sm;

   @PostMapping("/senddata")
   StudentEntity m1() {
   StudentEntity ee = sm.m1();
   return ee;
   
   }
   
}
