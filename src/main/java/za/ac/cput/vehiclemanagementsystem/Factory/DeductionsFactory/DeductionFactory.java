package za.ac.cput.vehiclemanagementsystem.Factory.DeductionsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;

public class DeductionFactory {

    public static Deductions getDeduction(String no,String dedType, double dedAmount) {
        return new Deductions.Builder()
                .deductionNo(no)
                .deductType(dedType)
                .deductAmount(dedAmount)
                .build();
    }
}
