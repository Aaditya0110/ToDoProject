package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Repository.AppRepository;
import com.example.demo.Service.AppService;
import com.example.demo.toDoApp.details;

@RestController
public class Controller {
	
  @Autowired
  AppRepository servicerepository;
  @Autowired
  AppService service;
  
  @GetMapping("/getValues")
  List<details> getList(){
	  return servicerepository.findAll();
  }
  
  @PostMapping("/post")
  public details create(@RequestBody details dt)
  {
	return servicerepository.save(dt);
  }
  @PutMapping("/put")
  public String putting(@RequestBody details dt) 
  {
	  return service.update(dt);
  }

@DeleteMapping("/delete")
public String delete(@RequestParam int id) {
	return service.deleteDetails(id);
}
}
