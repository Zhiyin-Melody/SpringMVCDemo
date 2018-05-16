package com.lianjia.SpringMVCDemo.SpringMVC_Controller;


import com.lianjia.SpringMVCDemo.SpringMVC_Model.Student;
import com.lianjia.SpringMVCDemo.SpringMVC_Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Aauthor:
 * @Date:2018/5/14 16:03
 * @Description:控制层，action模块；
 */
/*Controller注解Action，在springMVC开发中直接注解Controller
* Spring会自动创建一个StudentController类的对象*/

@Controller
@RequestMapping("/studentModule")
//http://localhost:8080/studentModule/getStudentInfo
//访问的地址；
/*RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
默认的是value的值*/

public class StudentController {
     @Autowired           //自动注入，自动装配；

     StudentService managerService;

    @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
    /*public String  getStudentInfo(Model model){
        List<Student> allStudents = managerService.getAllStudents();//用List模拟数据库存储；
        model.addAttribute("students", allStudents);
        return "showStudentInfo";//这里是字符串的话，直接跳转到showStudentInfo.jsp页面了；
    }*/

    /*@Responsebody 注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中，
      一般在异步获取数据时使用，通常是在使用 @RequestMapping 后，返回值通常解析为跳转路径，
      加上 @Responsebody 后返回结果不会被解析为跳转路径，而是直接写入HTTP 响应正文中。
      作用： 该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为
      指定格式后，写入到Response对象的body数据区。
      使用时机： 返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；*/

    @ResponseBody
      public List<Student> getStudentInfo(){
        List<Student> allStudents = managerService.getAllStudents();
        System.out.println("result返回的是："+allStudents);
        return allStudents;
    }
    /*直接将获取到的数据返回；*/
}
