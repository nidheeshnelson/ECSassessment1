package com.read.excel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.read.excel.model.GetModel;
import com.read.excel.model.MainModel;
import com.read.excel.model.StudentModel;
import com.read.excel.service.MainService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainControl {
	@Autowired
	private MainService ms;
@GetMapping("/")
public String show() {
	System.out.println("in /");
	return "forexcel";
}
@PostMapping("/excelupload")
public String excelUpload(@RequestParam("file") MultipartFile file, HttpSession session, Model model) {
	System.out.println("in excelupload");
	 if (!file.isEmpty()) {
         // Process the file
		 System.out.println("in if ");
		List<MainModel> ls= ms.getData(file);
		session.setAttribute("exceldata", ls);
		 
		 System.out.println("near return");
		 return "redirect:/showexcelm";
     } else {
    	 return "error";
     }
}
@GetMapping("/showexcelm")
public String getData(HttpSession session, Model model) {
	model.addAttribute("ObjList", session.getAttribute("exceldata"));
	System.out.println("showexcelm"+model);
	return "showexcel";
}
@PostMapping("/search")
public String search (@RequestParam("searchType") String searchType, @RequestParam("keyword") String keyword, HttpSession session, Model model){
	System.out.println(searchType+" in search "+keyword);
	List<MainModel> ls=(List<MainModel>) session.getAttribute("exceldata");
	System.out.println("from session "+ls);
	List<StudentModel> lsm = ms.searchStudent(ls, searchType, keyword);
	System.out.println("in search list of students"+lsm);
	model.addAttribute("StudentList",lsm);
	return "searchresult";
}

}
