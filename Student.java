 public class Student {
     public String studentId;
     public String name;
     private double gpa;

     public Student(String studentId, String name, double gpa) {
         this.studentId = studentId;
         this.name = name;
         this.gpa = 0.0;
         setGpa(gpa);
     }

     public void setGpa(double newGpa) {
         if (newGpa >= 0.0 && newGpa <= 4.0) {
             this.gpa = newGpa;
             System.out.println("[Success] " + this.name + "'s GPA updated to " + this.gpa + ".");
         } else {
             System.out.println("[Error] Invalid GPA (" + newGpa + ") for " + this.name + ". Must be between 0.0 and 4.0.");
         }
     }

     public void displayStudentInfo() {
         System.out.println("ID: " + this.studentId + " | Name: " + this.name + " | GPA: " + this.gpa);
     }


     public static void main(String[] args) {
         System.out.println("Step 2: Instantiate Two Student Objects");
         Student student1 = new Student("S101", "Alice", 3.8);
         Student student2 = new Student("S102", "Bob", 2.9);
         student1.displayStudentInfo();
         student2.displayStudentInfo();

         System.out.println("Step 3: Attempt Direct Modification");
         System.out.println("Direct assignment (student1.gpa = 5.5) is blocked by the Java compiler.");

         System.out.println("Step 4: Call setGpa(5.5) with Invalid Value");
         student1.setGpa(5.5);
         student1.displayStudentInfo();

         System.out.println("Step 5: Call setGpa(3.9) with Valid Value");
         student1.setGpa(3.9);
         student1.displayStudentInfo();
     }

 }

