package Javacore.Oexception.runtime.test;

public class RunTImeExceptionTest01 {
    public static void main(String[] args) {
        // Checked and unchecked

        Object object = null;
        int[] nums = {1,2};
        System.out.println(nums[2]); // one more run time exception ,because the programmer code error
        System.out.println(object.toString()); //Run time exception !!!
    }
}
