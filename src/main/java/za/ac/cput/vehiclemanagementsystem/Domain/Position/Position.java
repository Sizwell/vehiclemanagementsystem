package za.ac.cput.vehiclemanagementsystem.Domain.Position;

public class Position {

    private int roleID;
    private String positionDescription;

    private Position()
    {

    }

    private Position(Builder builder)
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
}
