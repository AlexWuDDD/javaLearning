package v1ch04.PackageTest;

import v1ch04.PackageTest.com.horstmann.corejava.Employee;
import static java.lang.System.*;

public class PackageTest
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Alex Wu", 1000000,
                2013,7,15);
        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());

    }

}
