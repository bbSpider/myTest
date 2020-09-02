package com.tmm.test.service.impl;

import com.tmm.test.entity.Student;
import com.tmm.test.mapper.StudentMapper;
import com.tmm.test.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceIml implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Student findById(int id) {
        return studentMapper.findById(id);
    }
}
