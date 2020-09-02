package com.tmm.test.controller;

import com.tmm.test.entity.Student;
import com.tmm.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("/select")
    public String list(Model model){
        List<Student> student=studentService.selectAll();
        model.addAttribute("student", student);
        return "/show";
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){ //@PathVariable 映射 URL 绑定的占位符
        int count = studentService.delete(id);
        System.out.println("count："+count);
        return "redirect:/student/select";
    }

    /**
     * 新增
     * @param student
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Student student){
        studentService.insert(student);
        return "redirect:/student/select";
    }

    /**
     * 跳转修改页面，需要先通过id查找到此条数据
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/toUpdate/{id}")
    public String findById(Model model, @PathVariable int id){
        Student student = studentService.findById(id);
        model.addAttribute("s",student);//通过id查找到此条数据
        return "/update"; //update.jsp页面
    }


    @RequestMapping("/update")
    public String update(Student student){
        studentService.update(student);
        return "redirect:/student/select";
    }


}
