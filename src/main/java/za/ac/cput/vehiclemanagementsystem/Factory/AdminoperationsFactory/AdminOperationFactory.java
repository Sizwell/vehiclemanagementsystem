package za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;

public class AdminOperationFactory {

    public static AdminOperations getOperation(String operationID, String operation) {
        return new AdminOperations.Builder()
                .operationID(operationID)
                .operation(operation)
                .build();
    }
}
