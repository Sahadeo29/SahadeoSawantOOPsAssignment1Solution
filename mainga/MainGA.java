package com.greatlearning.gradedassignment.mainga;
import com.greatlearning.gradedassignment.admindepartment.AdminDepartment;
import com.greatlearning.gradedassignment.hrdepartment.HRDepartment;
import com.greatlearning.gradedassignment.techdepartment.TechDepartment;

//Driver Class of Graded Assignment
public class MainGA {
		public static void main(String[] args) {
			
			AdminDepartment admin = new AdminDepartment();   //Object Admin Department created
			admin.departmentName();
			admin.getTodaysWork();
			admin.getWorkDeadline();
			admin.isTodayAHoliday();
			admin.getABlank();
			
			HRDepartment hr = new HRDepartment();           //Object HR Department created
			hr.departmentName();
			hr.doActivity();
			hr.getTodaysWork();
			hr.getWorkDeadline();
			hr.isTodayAHoliday();
			hr.getABlank();
			
			TechDepartment tech = new TechDepartment();     //Object Tech Department created
			tech.departmentName();
			tech.getTodaysWork();
			tech.getWorkDeadline();
			tech.getTechStackInformation();
			tech.isTodayAHoliday();
			tech.getABlank();
		}
}