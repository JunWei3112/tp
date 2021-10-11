package seedu.address.model.lesson;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

/**
 * Represents a Lesson in the TutorAid.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Lesson {

    // Identity Fields
    private final Name name;

    // Data Fields
    private final Capacity capacity;
    private final Price price;
    private final Students students;
    private final Timing timing;

    /**
     * Every field must be present and not null.
     */
    public Lesson(Name name, Capacity capacity, Price price, Students students, Timing timing) {
        requireAllNonNull(name, capacity, price, students, timing);
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.students = students;
        this.timing = timing;
    }

    public Name getName() {
        return name;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public Price getPrice() {
        return price;
    }

    public Students getStudents() {
        return students;
    }

    public Timing getTiming() {
        return timing;
    }

    /**
     * Returns true if both lessons have the same name.
     * This defines a weaker notion of equality between two lessons.
     */
    public boolean isSameLesson(Lesson otherLesson) {
        if (otherLesson == this) {
            return true;
        }

        return otherLesson != null
                && otherLesson.getName().equals(this.getName());
    }

    /**
     * Returns true if both lessons have the same identity and data fields.
     * This defines a stronger notion of equality between two lessons.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Lesson)) {
            return false;
        }

        Lesson otherLesson = (Lesson) other;
        return otherLesson.getName().equals(getName())
                && otherLesson.getCapacity().equals(getCapacity())
                && otherLesson.getPrice().equals(getPrice())
                && otherLesson.getStudents().equals(getStudents())
                && otherLesson.getTiming().equals(getTiming());
    }
}