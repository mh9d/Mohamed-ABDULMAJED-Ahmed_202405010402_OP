public class main{
    public static void main(String[]args){
        student s = new student();
        s.setStudentID("CU12345");
        s.setName("wldoum");
        s.setCGPA(4.00);
        s.setProgramme("BCSSE");

        System.out.println("Student ID : "+ s.getStudentID());
        System.out.println("Name       : "+ s.getName());
        System.out.println("CGPA       : "+ s.getCGPA());
        System.out.println("Programme  : "+ s.getProgramme());
    }
}