package streamString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class TestImmutableClass {

    private final int id;
    private final List<String> name;
    private final Date dob;

    TestImmutableClass(int id, List<String> name, Date dob) {
        this.id = id;
        this.name = new ArrayList<>(name); // defenshib copy
        this.dob = new Date();
    }

    int getId() {
        return this.id;
    }

    String getName(int i) {
        return this.name.get(i);
    }

    Date getDob() {
        return this.dob;
    }
}

