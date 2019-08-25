package za.ac.cput.payroll.Repository;

public interface IRepository <R, ID>
{
    R create(R r);
    R read(ID id);
    R update(R r);
    void delete(ID id);
}
