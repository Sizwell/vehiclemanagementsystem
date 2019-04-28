package za.ac.cput.vehiclemanagementsystem.Domain;

public class AdminOperations {

    private String name;
    private String surname;
   /* private String designation;
    private String destinationRoute;*/

    private AdminOperations() {

    }

    private AdminOperations(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        /*this.designation = builder.designation;
        this.destinationRoute = builder.destinationRoute;*/
    }

    public static class Builder {
        private String name;
        private String surname;
        /*private String designation;
        private String destinationRoute;*/

        public Builder name(String fName) {
            this.name = fName;
            return this;
        }

        public Builder surname(String lName) {
            this.surname = lName;
            return this;
        }

        /*public Builder designation(String desig)
        {
            this.designation = desig;
            return this;
        }*/

       /* public Builder destinationRoute(String destine)
        {
            this.destinationRoute = destine;
            return this;
        }*/


        public AdminOperations build() {
            return new AdminOperations(this);
        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

   /* public String getDesignation() {
        return designation;
    }

    public String getDestinationRoute() {
        return destinationRoute;
    }*/

    public String toString() {
        String str;
        str = " Name: " + getName() + " Surname: " + getSurname() +
                " Designation: " /*+ getDesignation() + " Destination: " + getDestinationRoute()*/;
        return str;
    }


}
