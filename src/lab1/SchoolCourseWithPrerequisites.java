package lab1;

import javax.swing.JOptionPane;

/**
 * This class is being added for subclasses
 * that have prerequisites, and all the
 * properties of the superclass, SchoolCourse
 *
 * @author      mmersenski
 * @version     1.00
 */
public class SchoolCourseWithPrerequisites extends SchoolCourse {
    private String prerequisites;
    
        public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
