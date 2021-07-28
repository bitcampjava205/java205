package service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class MemberRegService {
	
	private MemberRegService() {}
	private static MemberRegService service = new MemberRegService();
	public static MemberRegService getInstance() {
		return service;
	}
	
	public int regMember(HttpServletRequest request) throws FileUploadException {
		
		int resultCnt = 0;
		
		
		
		
		// 1. multipart 여부 확인
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		
		if(isMultipart){
			
			// 2. 파일을 저장할 Factory 객체 생성
			DiskFileItemFactory factory = new DiskFileItemFactory();
			
			// 3. 요청 처리를 (form 안에 있는 input 들을 분리 ) 위해서 ServletFileUpload 생성
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			// 4. 사용자 요청을 파싱(분리 : 원하는 형태로 분리  input => FileItem)
			// FileItem -> input 데이터를 저장하고 있는 객체
			List<FileItem> items = upload.parseRequest(request);
			
			Iterator<FileItem> itr = items.iterator();
			
			while(itr.hasNext()){
				
				FileItem item = itr.next();  // text, checkbox, hidden, password, file
				
				// file과 file이외의 폼을 구분
				if(item.isFormField()){
					// 회원 아이디, 회원 이름, 비밀번호
					
				} else {
					// 사진 데이터 처리
							
				}
				
				
			}
			
		}
		
		//////////////////////////////////////
		// DB insert
		
		
		
		
		
		
		
		
		
		
		return resultCnt;
		
	}

}
