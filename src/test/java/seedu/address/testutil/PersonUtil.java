package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_PARENT_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PARENT_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STUDENT_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STUDENT_PHONE;

import seedu.address.logic.commands.AddStudentCommand;
import seedu.address.model.student.Student;

/**
 * A utility class for Student.
 */
public class PersonUtil {

    /**
     * Returns an add command string for adding the {@code student}.
     */
    public static String getAddCommand(Student student) {
        return AddStudentCommand.COMMAND_WORD + " " + getPersonDetails(student);
    }

    /**
     * Returns the part of command string for the given {@code student}'s details.
     */
    public static String getPersonDetails(Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_STUDENT_NAME + student.getStudentName().fullName + " ");
        sb.append(PREFIX_STUDENT_PHONE + student.getStudentPhone().value + " ");
        sb.append(PREFIX_PARENT_NAME + student.getParentName().fullName + " ");
        sb.append(PREFIX_PARENT_PHONE + student.getParentPhone().value + " ");

        return sb.toString();
    }
}
