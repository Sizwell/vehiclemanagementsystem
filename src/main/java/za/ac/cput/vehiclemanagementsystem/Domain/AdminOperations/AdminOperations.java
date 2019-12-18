package za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AdminOperations {

    @Id
    private String operationID;
    @Column(name = "Operation")
   // @OneToMany()
    private String operation;
   /* private String designation;
    private String destinationRoute;*/

    private AdminOperations() {

    }

    private AdminOperations(Builder builder) {
        this.operationID = builder.operationID;
        this.operation = builder.operation;
        /*this.designation = builder.designation;
        this.destinationRoute = builder.destinationRoute;*/
    }

    public static class Builder {
        private String operationID;
        private String operation;
        /*private String designation;
        private String destinationRoute;*/

        public Builder operationID(String operationID) {
            this.operationID = operationID;
            return this;
        }

        public Builder operation(String operation) {
            this.operation = operation;
            return this;
        }

        public Builder copy(AdminOperations adminOperations)
        {
            this.operationID = adminOperations.operationID;
            this.operation = adminOperations.operation;

            return this;
        }

        public AdminOperations build() {
            return new AdminOperations(this);
        }

    }

    public String getOperationID() {
        return operationID;
    }

    public String getOperation() {
        return operation;
    }


    public String toString() {
        String str;
        str = "Operation ID " + getOperationID() + " Operation: " + getOperation();
        return str;
    }


}
