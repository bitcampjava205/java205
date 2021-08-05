package com.bitcamp.firstSpring;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	final String UPLOAD_URI = "/uploadfile";

	@RequestMapping("/upload/uploadForm")
	public String getUploadForm() {
		return "upload/uploadForm";
	}
	
	@RequestMapping(value="/upload/upload1")
	public String upload(
			
			@RequestParam("sno") String sno,
			@RequestParam("sname") String sname,
			@RequestParam("report") MultipartFile report,
			Model model,
			HttpServletRequest request
			
			) throws IllegalStateException, IOException {
		
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + sname);
		System.out.println("파일 : " + report.getOriginalFilename());
		
		model.addAttribute("sno", sno);
		model.addAttribute("sname", sname);
		model.addAttribute("reportfile", report.getOriginalFilename());
		
		// 저장 경로 : 시스템 경로
		String saveDir = request.getSession().getServletContext().getRealPath(UPLOAD_URI);
		
		// 새롭게 저장할 파일
		File newFile = new File(saveDir, report.getOriginalFilename());
		
		// 파일 저장
		report.transferTo(newFile);
		
		
		
		return "upload/upload";
	}
	
}
