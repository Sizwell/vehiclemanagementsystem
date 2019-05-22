package za.ac.cput.vehiclemanagementsystem.Controller.AdminOperationsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory.AdminOperationFactory;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements.AdminOperationsServiceImplements;

import java.util.List;

@RestController
@RequestMapping("/domain/controller/adminoperations")
public class AdminOperationsController {

    @Autowired
    private AdminOperationsServiceImplements serviceImpl;

    @GetMapping("/create/")
    public @ResponseBody
    AdminOperations create(@PathVariable String operationId, String operation)
    {
        AdminOperations adminOperations = AdminOperationFactory.getOperation(operationId, operation);
        return serviceImpl.create(adminOperations);
    }

    @GetMapping
    @ResponseBody
    public AdminOperations read(String adminOperations)
    {
        return serviceImpl.read(adminOperations);
    }

    @GetMapping
    @ResponseBody
    public AdminOperations update(AdminOperations adminOperations)
    {
        return serviceImpl.update(adminOperations);
    }

    @GetMapping
    @ResponseBody
    public void delete(String adminOperations)
    {
        serviceImpl.delete(adminOperations);

    }

}
