package lab2;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse c1 = new IntroToProgrammingCourse("Intro To Programming", "101-125");
        ProgrammingCourse c2 = new IntroJavaCourse("Intro To Java", "152-131");
        ProgrammingCourse c3 = new AdvancedJavaCourse("Advanced Java", "152-150");
        
        
        
        /**
         * Each class has to implement the interface and set the properties
         * and methods.
         * 
         * The Liskov Substitution principle helps make the above code very flexible.
         * For example, perhaps the intro java course no longer has a prerequisites course.
         * The code variable pr1 could quickly be created as a SchooCourse object
         * without having to change any other code.
         */
    }
}
