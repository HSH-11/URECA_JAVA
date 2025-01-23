package ch05;

import java.util.Scanner;

public class prac09 {
	public static void main(String[] args) {
	    boolean run = true;
	    int num = 0;
	    int[] scores = null;
	    
	    Scanner scanner = new Scanner(System.in);
	    while(run) {
	        System.out.println("--------------------------------------------------------------");
	        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	        System.out.println("--------------------------------------------------------------");
	        System.out.print("선택> ");
	    
	        int select = Integer.parseInt(scanner.nextLine());
	        
	        switch(select) {
	            case 1:
	                System.out.print("학생수> ");
	                num = Integer.parseInt(scanner.nextLine());
	                scores = new int[num];
	                break;
	            case 2:
	                for(int i = 0; i < scores.length; i++) {
	                    System.out.print("scores[" + i + "]> ");
	                    scores[i] = Integer.parseInt(scanner.nextLine());
	                }
	                break;
	            case 3:
	                for(int i = 0; i < scores.length; i++) {
	                    System.out.println("scores[" + i + "]: " + scores[i]);
	                }
	                break;
	            case 4:
	                int max = 0;
	                int sum = 0;
	                double avg = 0;
	        
	                for(int i = 0; i < scores.length; i++) {
	                    max = (max < scores[i]) ? scores[i] : max;
	                    sum += scores[i];
	                }
	                avg = (double) sum / num;
	                System.out.println("최고 점수: " + max);
	                System.out.println("평균 점수: " + avg);
	                break;
	            case 5:
	                run = false;
	                break;
	            default:
	                System.out.println("다시 입력해주세요.");
	        }
	    }
	    System.out.println("프로그램 종료");
	}
}
