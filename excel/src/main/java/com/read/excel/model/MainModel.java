package com.read.excel.model;

import org.apache.poi.ss.usermodel.Cell;

public class MainModel {
private Cell name;
private Cell admission;
private Cell physics;
private Cell chemistry;
private Cell maths;
public Cell getName() {
	return name;
}
public void setName(Cell name) {
	this.name = name;
}
public Cell getAdmission() {
	return admission;
}
public void setAdmission(Cell admission) {
	this.admission = admission;
}
public Cell getPhysics() {
	return physics;
}
public void setPhysics(Cell physics) {
	this.physics = physics;
}
public Cell getChemistry() {
	return chemistry;
}
public void setChemistry(Cell chemistry) {
	this.chemistry = chemistry;
}
public Cell getMaths() {
	return maths;
}
public void setMaths(Cell maths) {
	this.maths = maths;
}
@Override
public String toString() {
	return "MainModel [name=" + name + ", admission=" + admission + ", physics=" + physics + ", chemistry=" + chemistry
			+ ", maths=" + maths + "]";
}
}
