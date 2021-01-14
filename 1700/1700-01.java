import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> dqStudent = new ArrayDeque<Integer>(); 
        for (int s: students) {
            dqStudent.add(s);
        }
        Deque<Integer> dqSandwich = new ArrayDeque<Integer>();
        for (int s: sandwiches) {
            dqSandwich.add(s);
        }
        
        if (countIt(dqStudent, 1) == countIt(dqSandwich, 1)) return 0;
        
        while (dqSandwich.size() > 0) {
            if (countIt(dqStudent, dqSandwich.peek()) == 0) break;
            
            Integer student = dqStudent.pop();
            if (dqSandwich.peek() == student) {
                dqSandwich.removeFirst();
            } else {
                dqStudent.add(student);
            }
        }
        return dqStudent.size();
    }
    
    private int countIt(Deque<Integer> arr, int target) {
        int count = 0;
        for (int a: arr) {
            if (a == target) count++;
        }
        return count;
    }
}