package com.read.excel.model;

public class StudentModel {
private String name;
private int admission;
private double percentage;
private double physicsmark;
private String physicsgrade;
private String Physicsgradepoint;
private double chemistrymark;
private String chemistrygrade;
private String chemistrygradepoint;
private double mathsmark;
private String mathsgrade;
private String mathsgradepoint;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAdmission() {
	return admission;
}
public void setAdmission(int admission) {
	this.admission = admission;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public double getPhysicsmark() {
	return physicsmark;
}
public void setPhysicsmark(double physicsmark) {
	this.physicsmark = physicsmark;
}
public String getPhysicsgrade() {
	return physicsgrade;
}
public void setPhysicsgrade(String physicsgrade) {
	this.physicsgrade = physicsgrade;
}
public String getPhysicsgradepoint() {
	return Physicsgradepoint;
}
public void setPhysicsgradepoint(String physicsgradepoint) {
	Physicsgradepoint = physicsgradepoint;
}
public double getChemistrymark() {
	return chemistrymark;
}
public void setChemistrymark(double chemistrymark) {
	this.chemistrymark = chemistrymark;
}
public String getChemistrygrade() {
	return chemistrygrade;
}
public void setChemistrygrade(String chemistrygrade) {
	this.chemistrygrade = chemistrygrade;
}
public String getChemistrygradepoint() {
	return chemistrygradepoint;
}
public void setChemistrygradepoint(String chemistrygradepoint) {
	this.chemistrygradepoint = chemistrygradepoint;
}
public double getMathsmark() {
	return mathsmark;
}
public void setMathsmark(double mathsmark) {
	this.mathsmark = mathsmark;
}
public String getMathsgrade() {
	return mathsgrade;
}
public void setMathsgrade(String mathsgrade) {
	this.mathsgrade = mathsgrade;
}
public String getMathsgradepoint() {
	return mathsgradepoint;
}
public void setMathsgradepoint(String mathsgradepoint) {
	this.mathsgradepoint = mathsgradepoint;
}
@Override
public String toString() {
	return "StudentModel [name=" + name + ", admission=" + admission + ", percentage=" + percentage + ", physicsmark="
			+ physicsmark + ", physicsgrade=" + physicsgrade + ", Physicsgradepoint=" + Physicsgradepoint
			+ ", chemistrymark=" + chemistrymark + ", chemistrygrade=" + chemistrygrade + ", chemistrygradepoint="
			+ chemistrygradepoint + ", mathsmark=" + mathsmark + ", mathsgrade=" + mathsgrade + ", mathsgradepoint="
			+ mathsgradepoint + "]";
}

}
