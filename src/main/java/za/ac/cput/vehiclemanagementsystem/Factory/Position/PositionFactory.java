package za.ac.cput.vehiclemanagementsystem.Factory.Position;

import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;

public class PositionFactory {
    public static Position getFactory(int id, String desc)
    {
        return new Position.Builder()
                .roleId(id)
                .positionDesc(desc)
                .build();
    }
}
