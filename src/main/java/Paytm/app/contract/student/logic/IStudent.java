package Paytm.app.contract.student.logic;

import Paytm.app.contract.student.logic.entity.Student;
import Paytm.app.contract.student.logic.entity.StudentResult;
import cn.hyperchain.contract.BaseContractInterface;

import java.util.List;

public interface IStudent extends BaseContractInterface {

    Boolean registerStudent(List<Student> students);

    Boolean changeStudent(Student student);

    Student getStudent(String id);

    List<Student> getStudents(List<String> ids);

    StudentResult isContains(Student student);
}
