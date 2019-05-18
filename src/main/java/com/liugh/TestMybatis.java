package com.liugh;

import com.liugh.bean.User;
import com.liugh.mapper.UserMapper;
import com.liugh.sqlSession.MySqlsession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
@ComponentScan(value = "com.liugh")
public class TestMybatis {
	
    public static void main(String[] args) {  
        MySqlsession sqlsession=new MySqlsession();  
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);  
        List<User> user = mapper.getUserById("2");
        System.out.println(user);
        //ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:FactoryBeanDemo.xml");
        ApplicationContext ac=new AnnotationConfigApplicationContext("com.liugh");
//        System.out.println(((AnnotationConfigApplicationContext) ac).getBeanFactory());
//        System.out.println(((ClassPathXmlApplicationContext) ac).getBeanFactory());
//        System.out.println(ac.getBean("user"));
        System.out.println(ac.getBean("factory"));
        System.out.println(ac.getBean("&factory"));
    }

}
