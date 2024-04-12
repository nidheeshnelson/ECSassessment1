package com.read.excel.model;

import org.apache.poi.ss.usermodel.Cell;

public class GetModel {
private Cell name;
private Cell admission;
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
@Override
public String toString() {
	return "GetModel [name=" + name + ", admission=" + admission + "]";
}

}
