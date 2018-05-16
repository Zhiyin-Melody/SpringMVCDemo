package com.lianjia.SpringMVCDemo.SpringMVC_Dao;

import com.lianjia.SpringMVCDemo.SpringMVC_Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Aauthor:
 * @Date:2018/5/1416:07
 * @Description:实现StudentDao接口；
 */
    /*Repository注解就是将数据访问层（DAO层）的类标识为Spring bean，只需将该注解标注在DAO类上即可；*/
    @Repository
    public class StudentDaoImpl implements StudentDao{
    /*用List模拟数据库存储数据类；*/
        @Override
        public List<Student> getAllStudents(){
            List<Student> students = new ArrayList<Student>();

            Student stu1 = new Student();
            stu1.setId(1);
            stu1.setName("zhang san");
            students.add(stu1);


            Student stu2 = new Student();
            stu2.setId(1);
            stu2.setName("li si");
            students.add(stu2);
            return students;
        }



}

