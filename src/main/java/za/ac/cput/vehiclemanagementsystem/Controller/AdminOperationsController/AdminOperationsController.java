package za.ac.cput.vehiclemanagementsystem.Controller.AdminOperationsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory.AdminOperationFactory;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements.AdminOperationsServiceImplements;

import java.util.List;

@RestController
@RequestMapping("/vehiclemanagementsystem/adminoperations")
public class AdminOperationsController {

    @Autowired
    private AdminOperationsServiceImplements serviceImpl;

    @GetMapping("/creat/{operations}")
    public @ResponseBody
    AdminOperations create(@PathVariable String operationId, String operation)
    {
        AdminOperations adminOperations = AdminOperationFactory.getOperation(operationId, operation);
        return serviceImpl.create(adminOperations);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<AdminOperations> findAll()
    {
        return serviceImpl.findAll();
    }

}
