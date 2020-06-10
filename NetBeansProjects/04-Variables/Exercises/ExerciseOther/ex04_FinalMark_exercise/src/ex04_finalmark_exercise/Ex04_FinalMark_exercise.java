/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04_finalmark_exercise;

/**
 *
 * @author 533210
 */
public class Ex04_FinalMark_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String studentName = "Mark";
        double finalGrade;
        double quiz1Grade, quiz1Percent = 0.30;
        double quiz2Grade, quiz2Percent = 0.30;
        double remainingGrade, remaingPercent = 0.40;

        double hW1Grade, hW1Percent = 0.40;
        double hW2Grade, hW2Percent = 0.40;
        double aHGrade, aHPercent = 0.20;

        quiz1Grade = 75;
        quiz2Grade = 80;

        hW1Grade = 80;
        hW2Grade = 90;
        aHGrade = 100;
        remainingGrade = remaingPercent * (hW1Grade * hW1Percent + hW2Grade * hW2Percent + aHGrade * aHPercent);

        System.out.println("Mark got " + quiz1Grade + "% on Quiz 1" + " which is worth " + quiz1Percent * 100 + "% of total mark");
        System.out.println("Mark got " + quiz2Grade + "% on Quiz 2" + " which is worth " + quiz2Percent * 100 + "% of total mark");
        System.out.println();
        System.out.println("Remaing Marks are worth 40% of total mark:");
        System.out.println();
        System.out.println("     " + hW1Grade + "% HW1" + " which is worth " + hW1Percent * 100 + "% of Remainder");
        System.out.println("     " + hW2Grade + "% HW2" + " which is worth " + hW2Percent * 100 + "% of Remainder");
        System.out.println("     " + aHGrade + "% on Attendance" + " which is worth " + aHPercent * 100 + "% of Remainder");

        finalGrade = quiz1Grade * quiz1Percent + quiz2Grade * quiz2Percent + remainingGrade;

        System.out.println();
        System.out.println("Mark's Final Grade was " + finalGrade + "%");

    }

}
