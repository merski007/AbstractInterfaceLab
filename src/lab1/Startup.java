package lab1;

/**
 *
 * @author mjmersenski
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse c1 = new IntroToProgrammingCourse();
        ProgrammingCourse c2 = new IntroJavaCourse();
        ProgrammingCourse c3 = new AdvancedJavaCourse();
        
        c1.setCourseInfo("Intro To Programming", "101-125");
        c2.setCourseInfo("Intro To Java", "152-131");
        c3.setCourseInfo("Advanced Java", "152-150");
        
        
        /**
         * Why do I need the subclasses for IntroToProgramming, IntroJavaCourse, and AdvancedJavaCourse?
         * Could I just use my SchoolCourse and SchoolCourseWithPrerequisites classes to create
         * instances for each one? 
         * 
         * Because I'm not using any abstract methods, I should set my superclass to a Concrete
         * class, but i'll leave as an abstract class for the time being since that was 
         * in the instructions.
         * 
         * 
         * 
         * The Liskov Substitution principle helps make the above code very flexible.
         * For example, perhaps the intro java course no longer has a prerequisites course.
         * The code variable pr1 could quickly be created as a SchooCourse object
         * without having to change any other code.
         */
    }
}
