// // public class Array {
// //     public static void main(String[] args) {

// //         // int num[] = {1,2,3,4};
// //         // System.out.println(num[1]);

// //         // int num[] = new int[4];
// //         // // all 0 right now

// //         // num[0] = 1;
// //         // num[1] = 3232;
// //         // num[2] = 4556;
// //         // num[3] = 5656;

// //         // for (int i = 0; i < num.length; i++) {
// //         // System.out.println(num[i]);
// //     }
// // }

// // MULTI DIMENSIONAL ARRAY

// public class Array {

//     public static void main(String[] args) {
//         int num1[][] = new int[2][];//Jagged array

//         num1[0] = new int[3];
//         num1[1] = new int[4];
//         num1[2] = new int[4];

//         // int k = 0;
//         // for (int i = 0; i < 2; i++) {
//         //     for (int j = 0; j < 3; j++) {
//         //         num1[i][j] = k;
//         //         k++;
//         //     }
//         //     k= k*2;
//         // }
//         // for (int i = 0; i < 2; i++) {
//         //     for (int j = 0; j < 3; j++) {
//         //         System.out.print(num1[i][j] + " ");
//         //     }
//             System.out.println("");
//         }
//     }

// // DRAWBACKS OF ARRAY

class Student {
    int roll_no;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "ravi";
        s2.marks = 78;

        Student s3 = new Student();
        s3.roll_no = 03;
        s3.name = "arin";
        s3.marks = 58;


        Student student[] = new Student[3]; 
        // it is not object it just the refernce address of the objects in an array

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student n:student){
            System.out.println(n.name + ":" + n.marks);
        }
    }

}