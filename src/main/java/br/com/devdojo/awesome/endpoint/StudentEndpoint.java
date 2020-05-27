package br.com.devdojo.awesome.endpoint;

import br.com.devdojo.awesome.model.Student;
import br.com.devdojo.awesome.util.DateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
import static java.util.Arrays.asList;

import java.time.LocalDateTime;


/**
 * Curso DevDojo - SpringBoot
 * 
 * @author Ana Gabriela Franco
 *
 */

@RestController  
@RequestMapping("student")

public class StudentEndpoint {
	
	@Autowired
	private DateUtil dateUtil;
	@RequestMapping(method = RequestMethod.GET,path = "/list")
	public List<Student> listAll(){
		System.out.println(dateUtil.formatLocalDateTimeToDateBaseStyle(LocalDateTime.now()));
		return asList(new Student("Ana"), new Student("Gabriela"));
	}

	
}
