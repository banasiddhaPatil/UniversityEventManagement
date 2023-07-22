package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.model.type;
import com.geekster.UniversityEventManagement.service.UEMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class UEMController {
    @Autowired
    UEMService uemService;

    // Student
    //read
    @GetMapping("/Students")
    public Iterable<Student> GetAllStudents(){
        return uemService.GetAllStudents();
    }
    //post
    @PostMapping("/NewStudent")
    public String addStudent(@RequestBody Student student){
        return uemService.addStudent(student);
    }
    @DeleteMapping("/DeleteStudent")
    public String deleteStudent(@RequestParam Integer id){
        return uemService.deleteStudent(id);
    }
    //read
    @GetMapping("/Student/{id}")
    public Student studentById(@PathVariable Integer id){

        return uemService.studentById(id);
    }
    //put
    @PutMapping("/updateStudentDept[{id}")
    public String UpdateDept(@PathVariable Integer id , @PathVariable type Type){
        return uemService.UpdateDept(id,Type);
    }

    // Event
    @PostMapping("/NewEvent")
    public String addEvent(@RequestBody Event event){
        return uemService.addEvent(event);
    }

    @DeleteMapping("/RemoveEvent")
    public String removeEvent(@PathVariable Integer id){
        return uemService.removeEvent(id);
    }
    @GetMapping("/Event{data}")
    public List<Event> getEventsByDate(@PathVariable LocalDate date){
        return uemService.getEventByData(date);
    }
    @PutMapping("/UpdateEvent{id}")
    public String updateEvent(@PathVariable Integer id , @RequestParam String name, @RequestParam String loc, @RequestParam LocalDate d, @RequestParam LocalTime st,@RequestParam LocalTime et){
       return  uemService.updateEvent(id,name,loc,d,st,et);
    }
}
