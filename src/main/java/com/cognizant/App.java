package com.cognizant;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.dao.StudentDao;
import com.cognizant.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project is starting ....................." );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
//        JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        
        // insert query
//       String query ="INSERT INTO records(id,fname,lname) values (?,?,?)";
        
        //fire the query
        
//       int result=template.update(query,1,"Rahul","Kumar");
//       System.out.println("Line no 29" +result);
        
        
//        Student student=new Student();
//        student.setId(2);
//        student.setfName("Md");
//        student.setlNameString("kumar");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added "+result);
        
//        Student student=new Student();
//        student.setId(2);
//        student.setfName("Aman");
//        student.setlNameString("kumar");
//        
//        int result = studentDao.update(student);
//        System.out.println("student updated "+result);
        
//        int result=studentDao.delete(1);
//        System.out.println("Record deleted "+result);
        
//        Student student = studentDao.getStudent(2);
//        System.out.println(student);
        
        List<Student> students=studentDao.getAllStudent();
        for(Student stu:students) {
        	System.out.println(stu);
        }
        
        
    }
}
