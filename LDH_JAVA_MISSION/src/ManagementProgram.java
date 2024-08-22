import java.util.Scanner;

public class ManagementProgram {
    //프로그램 실행하는 메인 메소드
    public static void main(String[] args) {
        //스캐너 생성
        Scanner scanner = new Scanner(System.in);
        //학생수와 프로그램 번호를 변수로 만듬
        int managementNum =0;
        int studentCnt = 0;
        String exit;
        boolean temp = false;
        //학생 등록을 위한 boolean 변수
        boolean studentRegistered = false;
        //temp가 true가 될때까지 반복
        while(!temp){
            try{
                //scanner를 통해 studentCnt를 입력받음
                System.out.print("학생 수 입력 : ");
                studentCnt = Integer.parseInt(scanner.nextLine());
                //입력받은 수가 0보다 작으면 다시 입력하게함
                if(studentCnt <= 0){
                    System.out.println("0보다 큰 적당한 자연수를 입력해 주세요");
                }else {
                    //studentCnt
                    temp = true;
                }
            }
            //문자열을 정수로 변환할 때 생기는 오류
            catch (NumberFormatException e){
                System.out.println("0보다 큰 적당한 자연수를 입력해 주세요");
            }
        }
        //ProgramMethod를 생성
        ProgramMethod pm = new ProgramMethod(studentCnt);
        //프로그램 종료할때까지 무한 반복
        while(true) {
            boolean temp2 = false;
            //temp2가 true가 될때까지 반복
            while(!temp2) {
                System.out.println("**** 학생 관리 프로그램 ****");
                System.out.println("1. 학생 등록");
                System.out.println("2. 전체 출력");
                System.out.println("3. 학생 조회");
                System.out.println("4. 정보 수정");
                System.out.println("5. 프로그램 종료");
                System.out.print("관리 번호를 입력하세요. : ");
                try {
                    //스캐너를 통해 managementNum을 입력받음
                    managementNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("----------------------");
                    //1~5 사이에 숫자가 아니면 경고 문구 출력후 다시 입력 받음
                    if(managementNum <1 || managementNum >5){
                        System.out.println("1 ~5까지 중에서 숫자를 다시 입력해주세요");
                    }else{
                        temp2 = true;
                    }
                    //문자열을 정수로 변환할 때 생기는 오류
                } catch (NumberFormatException e) {
                    System.out.println("1 ~5까지 중에서 숫자를 다시 입력해주세요");
                }
            }
            if(managementNum == 1 && studentRegistered == true){
                System.out.println("이미 학생 등록을 완료 하셨습니다");
                continue;
            }else{
                //입력받은 managementNum를 통해 프로그램 실행
                switch (managementNum) {
                    case 1:
                        pm.registerStudent();
                        //학생 등록이 완료되면 studentRegistered를 true로 반환
                        studentRegistered = true;
                        break;
                    case 2:
                        //학생 등록이 되어있지 않으면 실행되지 않음
                        if (!studentRegistered) {
                            System.out.println("학생 등록을 먼저 해주세요.");
                        } else{
                            System.out.println("===== 전체 학생 출력 =====");
                            pm.allStudent();
                        }
                        break;
                    case 3:
                        //학생 등록이 되어있지 않으면 실행되지 않음
                        if (!studentRegistered) {
                            System.out.println("학생 등록을 먼저 해주세요.");
                        } else{
                            System.out.println("[학생을 조회 합니다.]");
                            pm.studentInquiry();
                            System.out.println("----------------------");
                        }
                        break;
                    case 4:
                        //학생 등록이 되어있지 않으면 실행되지 않음
                        if (!studentRegistered) {
                            System.out.println("학생 등록을 먼저 해주세요.");
                        } else{
                            System.out.println("[학생 정보를 수정합니다.]");
                            pm.modifyInformation();
                            System.out.println("----------------------");
                        }
                        break;
                    case 5:
                        //y 또는 n만 입력 받게함
                        while(true){
                            System.out.print("프로그램을 종료하시겠습니까?(y/n) ");
                            exit = scanner.nextLine().toLowerCase();
                            //y를 입력받으면 프로그램 종료
                            if (exit.equals("y")) {
                                System.exit(0);
                                // n을 입력받으면 다시 프로그램 실행
                            } else if(exit.equals("n")){
                                break;
                                //다른 값을 입력받으면 경고문구 출력 후 다시 프로그램 실행
                            } else{
                                System.out.println("y 또는 n만 입력해 주세요");
                            }
                        }
                }
            }
        }

    }
}


