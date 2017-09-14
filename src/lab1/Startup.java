package lab1;

/**
 *
 * @author mjmersenski
 */
public class Startup {
    public static void main(String[] args) {
        SchoolCourse c1 = new IntroToProgrammingCourse();
        SchoolCourse c2 = new IntroJavaCourse();
        SchoolCourse c3 = new AdvancedJavaCourse();
        SchoolCourseWithPrerequisites c4 = new IntroJavaCourse();
        
        c1.setCourseInfo("Intro To Programming", "101-125");
        c2.setCourseInfo("Intro To Programming", "152-131");
        c3.setCourseInfo("Advanced Java", "152-150");
        
        c4.setPrerequisites("Intro To Programming");
        
        
        /**
         * Why do I need the subclasses for IntroToProgramming, IntroJavaCourse, and AdvancedJavaCourse?
         * Could I just use my SchoolCourse and SchoolCourseWithPrerequisites classes to create
         * instances for each one?
         * 
         * I guess the only reason I would want to keep them around is incase I need to add properties
         * or methods specific to the classes.
         */
    }
}
