package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;
public class StudentMain {

	static Student data[] =new Student[10];
	
	static
	{
		for(int i=0 ; i<data.length ; i++)
		{
			data [0] = new Student("Sekar", new int[] {35, 35, 35});
			data [1] = new Student(null, new int[] {11, 22, 33});
			data [2] = null;
			data [3] = new Student("Manoj", null);
			
			//TC1
			data [4] = new Student("sarthak", new int[] {90, 90, 95});
			//TC2
			data [5] = new Student("rishabh", new int[] {60, 50, 36});
			//TC3
			data [6] = new Student("vikas", new int[] {8, 9, 10});
			//TC4
			data [7] =null;
			//TC5
			data [8] = new Student(null, new int[] {8, 9, 10});
			//TC6
			data [9] = new Student("sahil", null);
			
		}
	}
	
	public static void main(String[] args)
	{
		StudentReport studentReport=new StudentReport();
		String result;
		
		for(int i=0;i<data.length;i++)
		{
			try
			{
				result=studentReport.validate(data[i]);
			}
			catch(NullMarksArrayException e)
			{
				result = e.toString();
			}
			catch(NullNameException e)
			{
				result = e.toString();
			}
			catch(NullStudentException e)
			{
				result = e.toString();
			}
			System.out.println("Student Grade = "+result);
			
		}
		StudentService studentService=new StudentService();
		System.out.println("Number of null marks"+studentService.findNumberOfNullMarks(data));
		System.out.println("Number of null names"+studentService.findNumberOfNullNames(data));
		System.out.println("Number of null object"+studentService.findNumberOfNullObjects(data));
		
		//TC7
		System.out.println("Number of null name"+studentService.findNumberOfNullNames(data));
		//TC8
		System.out.println("Number of null marks"+studentService.findNumberOfNullMarks(data));
		//TC9
		System.out.println("Number of null object"+studentService.findNumberOfNullObjects(data));
	}
}
