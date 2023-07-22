package com.geekster.UniversityEventManagement.repostroy;

import com.geekster.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
}
