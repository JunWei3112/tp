package tutoraid.model.lesson;

import static java.util.Objects.requireNonNull;
import static tutoraid.commons.util.AppUtil.checkArgument;

/**
 * Represents a Lesson's timing in TutorAid.
 * Guarantees: immutable; is valid as declared in {@link #isValidTiming(String)}
 */
public class Timing {

    public static final String MESSAGE_CONSTRAINTS =
            "Timing must not be empty and can include alphanumeric, forward slash, hyphen and space";
    public static final String VALIDATION_REGEX = "^[a-zA-Z\\d-\\s/]+$";
    public final String timing;

    /**
     * Constructs a {@code Timing}.
     *
     * @param timing A valid timing.
     */
    public Timing(String timing) {
        requireNonNull(timing);
        checkArgument(isValidTiming(timing), MESSAGE_CONSTRAINTS);
        this.timing = timing;
    }

    /**
     * Returns true if a given string is a valid timing.
     */
    public static boolean isValidTiming(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return timing;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Timing // instanceof handles nulls
                && timing.equals(((Timing) other).timing)); // state check
    }

    @Override
    public int hashCode() {
        return timing.hashCode();
    }

}
