/**
 * 
 */
package com.sany.helloboot.hellobootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanya_s
 *
 */
@RestController
public class HelloController {	
	@GetMapping("/hello")
	public String getHello(){
		return "say hello to u from me have faith huoijpo";
	}
}
