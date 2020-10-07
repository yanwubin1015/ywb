package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.bean.Student;
import org.lanqiao.bean.StudentVo;

public interface StudentDao {
	public List<Student> getAllStudents();
	public Student  tStudentById(int id);
	public void addStudent(Student student);
	public void removeStudent(int id);
	public void updateStudent(Student student);
	public List<Student> searchStudent(StudentVo vo);
}
