package za.ac.cput.payroll.Service;

public interface IService <I, ID>
{
    I create(I i);
    I read(ID id);
    I update(I i);
    void delete(ID id);
}
