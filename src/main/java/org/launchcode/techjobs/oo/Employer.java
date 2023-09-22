// TASK 1
// TODO: Review Employer class

package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer() {
        super();
    }
    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

}
