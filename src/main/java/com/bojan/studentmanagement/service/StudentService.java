package com.bojan.studentmanagement.service;

import com.bojan.studentmanagement.dto.StudentDTO;
import com.bojan.studentmanagement.model.Student;
import com.bojan.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(student -> new StudentDTO(student.getName(), student.getAge(), student.getEmail()))
                .collect(Collectors.toList());
    }

    public StudentDTO getStudentById(String id) {
        Student student = studentRepository.findById(id).orElse(null);
        return (student != null) ? new StudentDTO(student.getName(), student.getAge(), student.getEmail()) : null;
    }

    public Student addStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getName(), studentDTO.getAge(), studentDTO.getEmail());
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getName(), studentDTO.getAge(), studentDTO.getEmail());
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

}
