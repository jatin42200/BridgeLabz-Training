public class Distribution_of_pens {
    public static void main(String[] args) {
        // Initialize total pens 
        int tPens=14;
        int student=3;
        int pensPerStudent=tPens/student;//pens per student
        int remainingPens=tPens%student;//remaining non distributed 
        System.out.println("The Pen Per Student is " +pensPerStudent+" and the remaining pen not distributed is " +remainingPens);
    }
}