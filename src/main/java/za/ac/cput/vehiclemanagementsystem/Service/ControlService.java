package za.ac.cput.vehiclemanagementsystem.Service;

public interface ControlService <TYPE, ID>
{
    TYPE create(TYPE type);
    TYPE read (ID id);
    TYPE update (TYPE type);
    void delete (ID id);
}
