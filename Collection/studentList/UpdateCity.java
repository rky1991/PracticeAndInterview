package studentList;

import java.util.ArrayList;

public class UpdateCity {
	
	/**
	 * Write a method to update the city attribute of Student object array list passed as an input parameter. If the city is “Mumbai” then change it to “Delhi”. The method should return how many student records were updated.
	 */
	
    /**
     * Updates the city of students in the list from "Mumbai" to "Delhi".
     *
     * @param students The list of Student objects
     * @return The number of student records that were updated
     */
    public static int updateCity(ArrayList<Student> students) {
        int updateCount = 0;

        for (Student student : students) {
            if ("Mumbai".equals(student.getCity())) {
                student.setCity("Delhi");
                updateCount++;
            }
        }

        return updateCount;
    }
    
    
    public static void main(String[] args) {
        // Example list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Mumbai"));
        students.add(new Student("Alice", "Delhi"));
        students.add(new Student("Bob", "Mumbai"));
        students.add(new Student("Sophia", "Chennai"));

        System.out.println("Original List: " + students);

        // Update city and get the count of updates
        int updatedCount = updateCity(students);

        System.out.println("Updated List: " + students);
        System.out.println("Number of records updated: " + updatedCount);
    }

}
