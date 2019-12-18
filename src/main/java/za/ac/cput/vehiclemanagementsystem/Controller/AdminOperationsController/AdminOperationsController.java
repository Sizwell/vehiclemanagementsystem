package za.ac.cput.vehiclemanagementsystem.Controller.AdminOperationsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Domain.ResponseObj;
import za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory.AdminOperationFactory;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.AdminOperationsService;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements.AdminOperationsServiceImplements;

import java.awt.*;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("adminOperations/lookup/admin")
public class AdminOperationsController {
/*
    @Autowired
    private AdminOperationsService adminOperationsService;


    @RequestMapping("adminOperations/lookup/admin")
    @ResponseBody
    public AdminOperations create(@PathVariable String operationId, String operation)
    {
        AdminOperations adminOperations = AdminOperationFactory.getOperation(operationId, operation);
        return serviceImpl.create(adminOperations);
    }

   // @GetMapping
    @ResponseBody
    public AdminOperations read(@PathVariable String adminOperations)
    {
        return serviceImpl.read(adminOperations);
    }

    @PostMapping
    @ResponseBody
    public AdminOperations update(AdminOperations adminOperations)
    {
        return serviceImpl.update(adminOperations);
    }

  //  @GetMapping
    @ResponseBody

    public void delete(@PathVariable String adminOperations)
    {
        serviceImpl.delete(adminOperations);

    }

    @GetMapping
    @ResponseBody
    public Set<AdminOperations> getAll()
    {
        return (Set<AdminOperations>) serviceImpl.findAll();
    }
*/
    @Autowired
    private AdminOperationsService adminOperationsService;

  //  @PostMapping(value = "/create/{adminOperations}", produces = PageAttributes.MediaType.APPLICATION_JSON_VALUE)
  //  public ResponseEntity createGender(@PathVariable String gender){
   //     System.out.println("Entered value: " + gender);
     //   ResponseObj responseObj =

       // return ResponseEntity.ok();
    //}

}
