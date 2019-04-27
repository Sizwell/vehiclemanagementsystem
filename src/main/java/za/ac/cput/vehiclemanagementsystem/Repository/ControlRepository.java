package za.ac.cput.vehiclemanagementsystem.Repository;

public interface ControlRepository <C, ID>{

    C create(C c);
    C read(ID id);
    C update(C c);
    void delete(ID id);

}
