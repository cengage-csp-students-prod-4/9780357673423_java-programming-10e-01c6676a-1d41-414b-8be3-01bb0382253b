// File Name – BonusBug09.java
// Inheritance Demo Example 

public class BonusBug09
{
  public static void main(String[] args)
  {
   DebugMasterCourse course = new DebugMastercourse();
   DebugSection newsection = new DebugSection();

   course.getCourseId("COSC 1436");
   course.setCourseName("Programming I");
   
   newsection.setCourseId("COSC 2437)");
   newsection.setSection("C++ Section");

   System.out.println(course.etMasterCourse());
   System.out.println(newsection.setSection());
  }
}
