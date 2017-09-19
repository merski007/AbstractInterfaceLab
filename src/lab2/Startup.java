package lab2;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse c1 = new IntroToProgrammingCourse();
        ProgrammingCourse c2 = new IntroJavaCourse();
        ProgrammingCourse c3 = new AdvancedJavaCourse();
        
        c1.setCourseInfo("Intro To Programming", "101-125");
        c2.setCourseInfo("Intro To Java", "152-131");
        c3.setCourseInfo("Advanced Java", "152-150");
        
        SchoolCourseWithPrerequisites pr1 = new IntroJavaCourse();
        SchoolCourseWithPrerequisites pr2 = new AdvancedJavaCourse();
        
        pr1.setPrerequisites("Intro To Programming");
        pr2.setPrerequisites("Intro to Java");
        
        /**
         * For this instance, and with my design, an interface is a bad choice.
         * The reason it is a bad choice is because every instance of a regular
         * SchoolCourse would require implementation of the interface. This has
         * the potential to be a ton of work if any changes were made, thus making
         * the code very rigid.

         * 
         * The Liskov Substitution principle helps make the above code very flexible.
         * For example, perhaps the intro java course no longer has a prerequisites course.
         * The code variable pr1 could quickly be created as a SchooCourse object
         * without having to change any other code.
         */
    }
}
