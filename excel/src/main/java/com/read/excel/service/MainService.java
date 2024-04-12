package com.read.excel.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.read.excel.component.MainComponent;
import com.read.excel.model.GradeModel;
import com.read.excel.model.MainModel;
import com.read.excel.model.StudentModel;

@Service
public class MainService {
	@Autowired
	private MainComponent mc;
	
	public List<MainModel> getData(MultipartFile file)
	{
		System.out.println("in getdata");
		List<MainModel> rowdata = new ArrayList<>();
        // Create a Workbook from the Excel file
        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())) 
        {
        	System.out.println("in try");
            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);
            
            for (Row row : sheet) {
                
                MainModel mm = new MainModel();
                mm.setName(row.getCell(0));
                mm.setAdmission(row.getCell(1));
                mm.setPhysics(row.getCell(2));
                mm.setChemistry(row.getCell(3));
                mm.setMaths(row.getCell(4));
                System.out.println(mm);
                rowdata.add(mm);
            }
            System.out.println(rowdata);
        }
            catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return rowdata;
    }
	public List<StudentModel> searchStudent(List<MainModel> ls, String searchType, String keyword){
		List<StudentModel> lsm = new ArrayList<StudentModel>();
		System.out.println("In searchStudent");
		try {
			if(searchType.equals("name")) {
				System.out.println("in if name");
				for(MainModel mm : ls) {
					StudentModel sm = new StudentModel();
					String s = mm.getName().toString();
					if(s.equals(keyword)) {
						GradeModel gm = new GradeModel();
						System.out.println("in keyword equels in name");
						sm.setName(s);
						sm.setAdmission((int)mm.getAdmission().getNumericCellValue());
						double physics = mm.getPhysics().getNumericCellValue();
						sm.setPhysicsmark(physics);
						gm=mc.grade(physics);
						sm.setPhysicsgrade(gm.getGrade());
						sm.setPhysicsgradepoint(gm.getGradepoint());
						double chemistry = mm.getChemistry().getNumericCellValue();
						sm.setChemistrymark(chemistry);
						gm=mc.grade(chemistry);
						sm.setChemistrygrade(gm.getGrade());
						sm.setChemistrygradepoint(gm.getGradepoint());
						double maths = mm.getMaths().getNumericCellValue();
						sm.setMathsmark(maths);
						gm=mc.grade(maths);
						sm.setMathsgrade(gm.getGrade());
						sm.setMathsgradepoint(gm.getGradepoint());
						sm.setPercentage(mc.percentage(new double[]{physics,chemistry,maths}));
						lsm.add(sm);
					}
					
				}
			}
			else if(searchType.equals("admissionNumber")) {
				System.out.println("in if admissionNumber ");
				for(MainModel mm : ls) {
					StudentModel sm = new StudentModel();
					String admissionid1=mm.getAdmission().toString();
					String admissionid=admissionid1.split("\\.")[0];
					String s = mm.getName().toString();
					if(admissionid.equals(keyword)) {
						GradeModel gm = new GradeModel();
						sm.setName(s);
						sm.setAdmission((int)mm.getAdmission().getNumericCellValue());
						double physics = mm.getPhysics().getNumericCellValue();
						sm.setPhysicsmark(physics);
						gm=mc.grade(physics);
						sm.setPhysicsgrade(gm.getGrade());
						sm.setPhysicsgradepoint(gm.getGradepoint());
						double chemistry = mm.getChemistry().getNumericCellValue();
						sm.setChemistrymark(chemistry);
						gm=mc.grade(chemistry);
						sm.setChemistrygrade(gm.getGrade());
						sm.setChemistrygradepoint(gm.getGradepoint());
						double maths = mm.getMaths().getNumericCellValue();
						sm.setMathsmark(maths);
						gm=mc.grade(maths);
						sm.setMathsgrade(gm.getGrade());
						sm.setMathsgradepoint(gm.getGradepoint());
						sm.setPercentage(mc.percentage(new double[]{physics,chemistry,maths}));
						lsm.add(sm);
					}
					
				}
			}
			else {
				System.out.println("not defined");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(lsm);
		return lsm;
	}
}
