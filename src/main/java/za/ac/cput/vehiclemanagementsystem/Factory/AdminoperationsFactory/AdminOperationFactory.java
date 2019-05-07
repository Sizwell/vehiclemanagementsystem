package za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;

public class AdminOperationFactory {

    public static AdminOperations getValidation(String name, String surname) {
        return new AdminOperations.Builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
