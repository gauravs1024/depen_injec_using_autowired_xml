package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Main {
public static void main(String[] args) {
	
	// the project contains multiple xml file showing the example of byName,byType ...etc types of autowired using xml file
	//String config_file_loc="resources/applicationContextbyType2.xml";   // autowired byType having mutliple bean object
	//String config_file_loc="resources/applicationContextbyName.xml";	  // autowired byName 
	//String config_file_loc="resources/applicationContextbyType.xml";	  // autowired byType
	String config_file_loc="resources/applicationContextbyConstr.xml";	  // autowired by Constrution


	ApplicationContext context=new ClassPathXmlApplicationContext(config_file_loc);
	Student std=(Student)context.getBean("studId");
	std.display();
}
}
