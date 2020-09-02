package com.tmm.test.mapper;


import com.tmm.test.entity.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有数据
    List<Student> selectAll();

    //根据id删除
    int  delete(int id);

    //根据id修改
    int update(Student student);

    //添加
    int insert(Student student);

    //通过id查找
    Student findById(int id);

}
