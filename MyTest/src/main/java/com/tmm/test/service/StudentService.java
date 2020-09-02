package com.tmm.test.service;

import com.tmm.test.entity.Student;

import java.util.List;

public interface StudentService {
    //查询所有数据
    public List<Student> selectAll();

    //根据id删除
    public int  delete(int id);

    //根据id修改
    public int update(Student student);

    //添加
    public int insert(Student student);

    //通过id查找
    public Student findById(int id);
}
