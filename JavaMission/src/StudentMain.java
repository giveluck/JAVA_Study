//import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        
        //키보드로 부터 입력받기 위한 scanner 객체 생성함.
        Scanner scanner = new Scanner(System.in);

        //정수의 숫자를 입력받음.
        int num1 = 0;
        try {
            //num1 = scanner.nextInt();

            System.out.print("점수 입력: ");
            num1 = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) { //정수가 아닌 실수나 문자열을 입력했을 때
            //e.printStackTrace();
            System.out.println("정수만 입력 가능합니다.");
        } catch (NumberFormatException e){ //int의 범위를 벗어났을때
            System.out.println("int형의 범의를 벗어났습니다.");
        } catch (Exception e){
            e.printStackTrace();
        }

        //범위를 지정하기 위함(0 ~ 100)
        if(!(num1 >= 0 && num1 <= 100)){
            System.out.println("o~100사이 정수만 입력 가능합니다");
            //메인 메소드의 종료
            return;
            // 프로그램 정상 종료
            //System.exit(0);
        }

        //입력된 정수를 출력함.
        System.out.println("num1: " + num1);

        

    }

}
