package JavaKampiOdev3Hafta3;

import java.util.ArrayList;
import java.util.List;

import JavaKampiOdev3Hafta3.business.CourseManager;
import JavaKampiOdev3Hafta3.core.logging.FileLogger;
import JavaKampiOdev3Hafta3.core.logging.ILogger;
import JavaKampiOdev3Hafta3.dataAcsses.HibernateDao;

import JavaKampiOdev3Hafta3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Course course = new Course(1, "C#", 10.0);
		Course course1 = new Course(1, "Java", 10.0);
		Course course2 = new Course(1, "Java", 10.0);

		List<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course1);
		courses.add(course2);
		ILogger[] loggers = { new FileLogger() };
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, courses);
		courseManager.add(course);
		courseManager.add(course1);
		//courseManager.add(course2);

		////////////////////////////////////////////////////////////////////
	}
}