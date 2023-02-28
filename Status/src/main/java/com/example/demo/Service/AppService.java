package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppRepository;
import com.example.demo.toDoApp.details;

@Service
public class AppService {
@Autowired
AppRepository repository;


public String deleteDetails(int id) {
	repository.deleteById(id);
	return "deleted";
}
public String update(details dt) 
{
   repository.save(dt);
   return "Updated";
}
}
