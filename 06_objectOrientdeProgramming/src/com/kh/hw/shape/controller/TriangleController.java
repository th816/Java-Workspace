package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double widht) {
		
		s = new Shape(3 , height, widht);
		return widht * height;
		
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
		
		
	}
	
	public String print() {
		
		return "삼각형 "+ s.information();
		
	}

}
