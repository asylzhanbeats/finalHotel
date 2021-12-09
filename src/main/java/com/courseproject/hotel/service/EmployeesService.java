package com.courseproject.hotel.service;

import com.courseproject.hotel.model.EmployeeModel;
import com.courseproject.hotel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeesService {

//    @Autowired
//    private EmployeesRepository employeesRepo;
//
//    public List<EmployeesModel> listAll() {
//        return employeesRepo.findAll();
//    }
//
//    public void save(EmployeesModel employeesModel) {
//        employeesRepo.save(employeesModel);
//    }
//
//    public EmployeesModel get(Integer eid) {
//        return employeesRepo.findById(eid).get();
//    }
//
//    // DO WE NEED THIS?
//    public void delete(Integer eid) {
//        employeesRepo.deleteById(eid);
//    }
}
