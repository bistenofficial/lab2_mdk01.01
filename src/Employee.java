public class Employee extends Person
{
    public String position;
    public int sallary;
    public Employee(String position,String name,int sallary)
    {
        super(name);
        this.position = position;
        this.sallary = sallary;
    }
public void Report()
{
    System.out.print("Имя - "+getName()+"\nНазвание должности");
}
}
