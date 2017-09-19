package lab1;

/**
 *
 * @author mjmersenski
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse c1 = new IntroToProgrammingCourse("Intro To Programming", "101-125");
        ProgrammingCourse c2 = new IntroJavaCourse("Intro To Java", "152-131");
        ProgrammingCourse c3 = new AdvancedJavaCourse("Advanced Java", "152-150");
        
        
        /**
         * The Liskov substitution method helps keep this code very flexible because
         * it allows for polymorphism.
         */
    }
}
