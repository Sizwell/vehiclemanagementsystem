package za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class RoadWorthyTest {

    private String vinNo;
    private String model;
    private String testResults;

    public RoadWorthyTest() {

    }

    public RoadWorthyTest(Builder builder) {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
        this.testResults = builder.testResults;
    }


    public static class Builder {
        private String vinNo;
        private String model;
        private String testResults;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder testResults(String results)
        {
            this.testResults = results;
            return this;
        }

        public Builder copy(RoadWorthyTest test)
        {
            this.vinNo = test.vinNo;
            this.model = test.model;

            return this;
        }

        public RoadWorthyTest build() {
            return new RoadWorthyTest(this);
        }
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getModel() {
        return model;
    }

    public String getTestResults()
    {
        return this.testResults;
    }

    @Override
    public String toString() {
        return "------ Vehicle Road Worthy Test ------\n" +
                "Vin No: '" + getVinNo() + '\'' +
                "\nModel: '" + getModel() + '\'' +
                "\nTest Results: '" + getTestResults() + '\'';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadWorthyTest)) return false;
        RoadWorthyTest that = (RoadWorthyTest) o;
        return vinNo.equals(that.vinNo) &&
                model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, model);
    }
}
