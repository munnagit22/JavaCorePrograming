package streamString;

import java.util.Objects;

public class Employee {

    int id;

    public Employee(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object emp) {

        if (this == emp)
            return true;
        if (!(emp instanceof Employee))
            return false;

        Employee e = (Employee) emp;
        return id == e.id;
    }
    public int hashCode(){
    return Objects.hash(id);
    }
}
