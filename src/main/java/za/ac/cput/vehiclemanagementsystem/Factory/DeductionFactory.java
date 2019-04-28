package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;

public class DeductionFactory {

    public static Deductions getDeduction(String dedType, double dedAmount) {
        return new Deductions.Builder()
                .deductType(dedType)
                .deductAmount(dedAmount)
                .build();
    }
}
