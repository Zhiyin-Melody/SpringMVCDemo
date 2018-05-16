package com.lianjia.SpringMVCDemo.SpringMVC_Dao;

import com.lianjia.SpringMVCDemo.SpringMVC_Model.Student;
import java.util.List;

/**
 * @Aauthor:
 * @Date:2018/5/1416:07
 * @Description:用户dao接口；
 */


public interface StudentDao {
   /*提供一个存放Student类的方法接口，用list模拟数据库存放；*/
   public List<Student> getAllStudents();
}
