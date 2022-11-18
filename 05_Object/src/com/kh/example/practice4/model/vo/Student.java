package com.kh.example.practice4.model.vo;

public class Student {
	
	
		
		private int grade=1;
		private int classroom=2;
		private String name="태환";
		private double height=120.2;
		private char gender='남';
		
		
		public Student() {
			

			
		}
		
		

		
		public void setGrade(int grade) {
			
			this.grade = grade;
		}
		
		public void setClassroom(int classroom) {
			
			this.classroom = classroom;
		}
		public void setName(String name) {
			
			this.name = name;
		}
		public void setHeight(double height) {
			
			this.height = height;
		}
		public void setGender(char gender) {
			
			this.gender = gender;
		}
		
		public int getGrade() {
			
			return grade;
		}
		public int getClassroom() {
			
			return classroom;
		}
		public String getName() {
			
			return name;
		}
		public double getHeight() {
			
			return height;
		}
		
		public char getGender() {
			
			return gender;
		}
		public String information() {
			
			return grade+"학년 "+classroom+"반, 이름은 "+name+", 키는 "+height+" 성별은 "+gender;
		}


}
