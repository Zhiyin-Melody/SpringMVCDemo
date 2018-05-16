package com.lianjia.SpringMVCDemo.SpringMVC_Service;

import com.lianjia.SpringMVCDemo.SpringMVC_Dao.StudentDao;
import com.lianjia.SpringMVCDemo.SpringMVC_Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Aauthor:
 * @Date:2018/5/14 16:10
 * @Description:实现了StudentService接口；
 */
/*Service注解，创建了StudentService的bean；
这样在StudentController中使用StudentService的时候，就可以直接把StudentService注入到Controller层；
进行调用的时候，会声明一个service对象，并且在其上面用@Resource进行注解；
* */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired  //自动装载；
    StudentDao dao;

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

}
