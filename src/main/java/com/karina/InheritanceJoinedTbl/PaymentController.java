package com.karina.InheritanceJoinedTbl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@Autowired
	PaymentRepository prepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"program tested";
	}
	/*@RequestMapping("/save")
	public String save()
	{
		
	}*/

}
