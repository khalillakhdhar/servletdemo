package com.elite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
@GetMapping("/api")
public String getId(@RequestParam String id)
{
	return "id="+id;
	
}
@GetMapping("/user")
public String getFullName(@RequestParam String nom,@RequestParam(required = false) String prenom)
{
return "bonjour, "+nom+" "+prenom;	

}
}
