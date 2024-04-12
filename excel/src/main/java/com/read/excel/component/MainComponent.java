package com.read.excel.component;

import org.springframework.stereotype.Component;

import com.read.excel.model.GradeModel;

@Component
public class MainComponent {
public GradeModel grade(double d) {
	GradeModel gm = new GradeModel();
	if(d>0 && d<=20) {
		gm.setGrade("E2");
		gm.setGradepoint("C");
	}
	else if(d>20 && d<=32) {
		gm.setGrade("E1");
		gm.setGradepoint("C");
	}
else if(d>32 && d<=40) {
	gm.setGrade("D");
	gm.setGradepoint("4.0");
	}
else if(d>40 && d<=50) {
	gm.setGrade("C2");
	gm.setGradepoint("5.0");
}
else if(d>50 && d<=60) {
	gm.setGrade("C1");
	gm.setGradepoint("6.0");
}
else if(d>60 && d<=70) {
	gm.setGrade("B2");
	gm.setGradepoint("7.0");
}
else if(d>70 && d<=80) {
	gm.setGrade("B1");
	gm.setGradepoint("8.0");
}
else if(d>80 && d<=90) {
	gm.setGrade("A2");
	gm.setGradepoint("9.0");
}
else if(d>90 && d<=100) {
	gm.setGrade("A1");
	gm.setGradepoint("10.0");
}
else {
	System.out.println("Not defined");
}
	
	return gm;
}
public double percentage(double[] d) {
	double a =0;
	int i=0;
	for(double db : d) {
		a+=db;
		i++;
	}
	a=a/i;
	return a;
}
}
