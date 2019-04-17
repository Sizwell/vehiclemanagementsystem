package za.ac.cput.vehiclemanagementsystem.Domain;

public class Report {

    private String tourDetails;

    public Report()
    {

    }

    public Report(Builder builder)
    {
        this.tourDetails = builder.tourDetails;
    }

    public static class Builder
    {
        private String tourDetails;

        public Builder tourDetails(String tour)
        {
            this.tourDetails = tour;
            return this;
        }

        public Report build()
        {
            return new Report(this);
        }
    }

    public String getTourDetails() {
        return tourDetails;
    }

    @Override
    public String toString()
    {
        return "------ Report ------\n" +
                "Tour Details : '" + tourDetails + '\'' ;
    }
}
