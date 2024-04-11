package com.read.excel.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.read.excel.model.MainModel;

@Service
public class MainService {
	
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
}
