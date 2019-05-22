package za.ac.cput.vehiclemanagementsystem.Domain.Position;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Position {

    private int roleID;
    private String positionDescription;

    private Position()
    {

    }

    public Position(Builder builder)
    {
        this.roleID = builder.roleID;
        this.positionDescription = builder.positionDescription;
    }

    public static class Builder
    {
        private int roleID;
        private String positionDescription;
        
        public Builder roleId(int id)
        {
            this.roleID = id;
            return this;
        }
        
        public Builder positionDesc(String desc)
        {
            this.positionDescription = desc;
            return this;
        }

        public Builder copyPosition(Position position)
        {
            this.roleID = position.roleID;
            this.positionDescription = position.positionDescription;

            return this;
        }
        
        public Position build()
        {
            return new Position(this);
        }
    }

    public int getRoleID() 
    {
        return roleID;
    }

    public String getPositionDescription()
    {
        return positionDescription;
    }

    @Override
    public String toString() {
        return "------ PositionFactory ------\n" +
                "Role ID: " + getRoleID() +
                "\nPotion Description: '" + getPositionDescription() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return roleID == position.roleID &&
                positionDescription.equals(position.positionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleID, positionDescription);
    }
}
