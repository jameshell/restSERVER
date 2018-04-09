/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Pregunta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import org.o7planning.restfulcrud.model.Employee;

/**
 *
 * @author james
 */
public class preguntaDAO {
     
    private static final Map<Integer, Pregunta> empMap = new HashMap<Integer, Pregunta>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
//        Employee emp1 = new Employee(" E01", "Smith", "Clerk");
//        Employee emp2 = new Employee("E02", "Allen", "Salesman");
//        Employee emp3 = new Employee("E03", "Jones", "Manager");
 
//        empMap.put(emp1.getEmpNo(), emp1);
//        empMap.put(emp2.getEmpNo(), emp2);
//        empMap.put(emp3.getEmpNo(), emp3);
    }
 
    public static Pregunta getPregunta(int empNo) {
        return empMap.get(empNo);
    }
 
    public static Pregunta addPregunta(Pregunta emp) {
        empMap.put(emp.getNumero(), emp);
        return emp;
    }
 
    public static Pregunta updatePregunta(Pregunta emp) {
        empMap.put(emp.getNumero(), emp);
        return emp;
    }
 
    public static void deletePregunta(int empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Pregunta> getAllPreguntas() {
        Collection<Pregunta> c = empMap.values();
        List<Pregunta> list = new ArrayList<Pregunta>();
        list.addAll(c);
        return list;
    }
     
    List<Pregunta> list;
 
}
