import java.util.*;
// main에서 사용될 프로그램 메소드
public class ProgramMethod {
    //스캐너 생성
    Scanner scanner = new Scanner(System.in);
    //학생 정보를 저장할 배열
    StudentData[] students;
    // 학생수를 저장할 변수
    int studentCnt;
    // 메소드를 호출할떄 사용하는 생성자 studentCnt를 변수로 사용
    public ProgramMethod(int studentCnt){
        this.studentCnt = studentCnt;
        students = new StudentData[studentCnt];
    }
    //학생 등록을 위한 메소드
    public void registerStudent(){
        System.out.println("[학생을 등록합니다]");
        //학생 인원수 만큼 반복
        for(int i = 0; i < studentCnt; i++){
            //학생 정보를 저장할 변수
            int studentNum = 0;
            String name = "";
            String department = "";
            String callNum = "";
            //반복하게 해주는 boolean 변수
            boolean temp = false;
            boolean temp2 = false;
            boolean temp3 = false;
            boolean temp4 = false;
            //temp가 true가 될때까지 반복
            while (!temp) {
                try {
                    System.out.print("학    번 : ");
                    //scanner를 통해 studentNum을 입력받음
                    studentNum = Integer.parseInt(scanner.nextLine());
                    // studentNum 숫자 길이 검사 (출처:https://junghn.tistory.com/)
                    if((int)(Math.log10(studentNum) + 1) != 8) {
                        System.out.println("8자리 숫자를 입력해 주세요");
                        continue;
                    }
                    boolean duplicate = false;
                    //배열에서 학번값을 불러와 중복이 되는지 확인
                    for(StudentData student : students){
                        if(student != null && student.getStudentNum() == studentNum) {
                            duplicate = true;
                            break;
                        }
                    }
                    //만약 studentNum이 중복이면 다시 입력
                    if(duplicate) {
                        System.out.println("[동일한 학번입니다. 다시입력하세요.]");
                    } else {
                        // 중복이 없고 학번이 8자리일 때 루프 탈출
                        temp = true;
                    }
                    //문자열을 정수로 변환할 때 생기는 오류
                } catch (NumberFormatException e) {
                    System.out.println("8자리 숫자를 입력해 주세요.");
                }
            }
            //temp2가 true가 될때까지 반복
            while (!temp2) {
                try {
                    //scanner를 통해 name을 입력받음
                    System.out.print("이    름 : ");
                    name = scanner.nextLine();
                    //name에 길이는 2자이상 30자 미만(이중국적 포함 이름이 제일 긴 사람이 30자)
                    if (name.length() < 2 || name.length() > 31) {
                        System.out.println("2자에서 30자 사이에 이름을 한글로 입력해주세요");
                        //name이 한글로 이루어져야함
                    } else if (!isHangul(name)) {
                        System.out.println("2자에서 30자 사이에 이름을 한글로 입력해주세요");
                    } else {
                        //이름이 한글이고 2자이상 30자 미만이면 true
                        temp2 = true;
                    }
                    //scanner가 꺼져서 입력값을 받을 수 없을때 실행
                } catch (NoSuchElementException e) {
                    System.out.println("입력 중 문제가 발생했습니다. 다시 시도해주세요.");
                }
            }
            //temp3가 true가 될때까지 반복
            while (!temp3) {
                try {
                    //sanner를 통해 department를 입력받음
                    System.out.print("학    과 : ");
                    department = scanner.nextLine();
                    //department 길이는 2자 이상 15자 미만(제일 긴 학과 이름이 15자)
                    if (department.length() < 2 || department.length() > 16) {
                        System.out.println("2자에서 15자 사이에 학과를 한글로 입력해주세요");
                        //department가 한글로 이루어져야함
                    } else if (!isHangul(department)) {
                        System.out.println("2자에서 15자 사이에 학과를 한글로 입력해주세요");
                    } else {
                        //department가 한글이고 2자 이상 15자 미만이면 true
                        temp3 = true;
                    }
                    //scanner가 꺼져서 입력값을 받을 수 없을때 실행
                } catch (NoSuchElementException e) {
                    System.out.println("입력 중 문제가 발생했습니다. 다시 시도해주세요.");
                }
            }
            while(!temp4){
                //sanner를 통해 callNum을 입력받음
                System.out.print("전화번호 : ");
                callNum = scanner.nextLine();
                //전화번호 형식을 확인, 반환값은 boolean 타입 (출처:https://codechacha.com/ko/java-string-matches/)
                temp4 = callNum.matches("^010-\\d{4}-\\d{4}$");
                if(!temp4){
                    System.out.println("전화번호 형식이 다릅니다.형식에 맞게 숫자를 입력하세요 (형식:010-XXXX-XXXX)");
                }
            }
            System.out.println("----------------------");
            //입력받은 값을 학생정보에 추가
            StudentData student = new StudentData(studentNum, name, department, callNum);
            //학생정보를 배열에 추가
            students[i] = student;
        }

    }
    //전체 학생을 보여주는 메소드
    public void allStudent(){
        //i번째 학생 정보를 불러와 보여줌
        for(int i = 0; i<studentCnt; i++){
            students[i].printInformation();
            System.out.println("----------------------");
        }
    }
    //학번을 입력받아 학생정보를 보여주는 메소드
    public void studentInquiry(){
        //입력 받을 학번(문의번호)
        int inquiryNum = 0;
        //일치하는 학번 유무
        boolean matching = false;
        try{
            System.out.print("학번을 입력하십시오. : ");
            inquiryNum = Integer.parseInt(scanner.nextLine());
            //문자열을 정수로 변환할 때 생기는 오류
        } catch (NumberFormatException e) {
        }
        //학생정보에서 문의번호와 학번이 일치하는 정보를 확인 후 보여줌
        for(int i = 0; i<studentCnt; i++){
            if(students[i].getStudentNum() == inquiryNum){
                students[i].printInformation();
                //문의번호와 학번이 일치하면 true로 바꿈
                matching = true;
                break;
            }
            //문의번호와 학번이 일치하지 않으면 경고 문구 출력
        }
        if(!matching){
            System.out.println("[일치하는 학번이 없습니다.]");
        }
    }
    //학생 정보를 수정할 메소드
    public void modifyInformation(){
        //입력 받을 학번(문의번호)
        int inquiryNum = 0;
        //일치하는 학번 유무
        boolean matching2 = false;
        //다시 입력 받을 학과와 전화번호
        String newDepartment = "";
        String newcallNum = "";
        try{
            System.out.print("학번을 입력하십시오. : ");
            inquiryNum = Integer.parseInt(scanner.nextLine());
            //문자열을 정수로 변환할 때 생기는 오류
        } catch (NumberFormatException e) {
        }
        //학생정보에서 문의번호와 학번이 일치하는 정보를 확인 후 입력을 받음
        for(int i = 0; i<studentCnt; i++) {
            if (students[i].getStudentNum() == inquiryNum) {
                //문의번호와 일치하는 학번을 보여줌
                int studentNum = students[i].getStudentNum();
                System.out.println("학    번 : " + studentNum);
                //문의번호와 일치하는 이름을 보여줌
                String name = students[i].getName();
                System.out.println("이   름 : " + name);
                boolean temp5 =false;
                //이 과정은 위에 학생등록 메소드와 동일
                while(!temp5) {
                    try {
                        System.out.print("학    과 입력 : ");
                        newDepartment = scanner.nextLine();
                        if (newDepartment.length() < 2 || newDepartment.length() > 16) {
                            System.out.println("2자에서 15자 사이에 학과를 한글로 입력해주세요");
                        } else if (!isHangul(newDepartment)) {
                            System.out.println("2자에서 15자 사이에 학과를 한글로 입력해주세요");
                        } else {
                            temp5 = true;
                        }
                    } catch (NoSuchElementException e) {
                        System.out.println("입력 중 문제가 발생했습니다. 다시 시도해주세요.");
                    }
                }
                students[i].setDepartment(newDepartment);
                boolean temp6 = false;
                while(!temp6){
                    System.out.print("전화번호 입력 : ");
                    newcallNum = scanner.nextLine();
                    temp6 = newcallNum.matches("^010-\\d{4}-\\d{4}$");
                    if(!temp6){
                        System.out.println("전화번호 형식이 다릅니다. (형식:010-XXXX-XXXX)");
                    }
                }
                students[i].setCallNum(newcallNum);
                matching2 = true;
                break;
            }

        }
        if(!matching2){
            System.out.println("[일치하는 학번이 없습니다.]");
        }
    }
    //한글인지 아닌지 확인하는 함수(chat gpt에 도움을 받음)
    public static boolean isHangul(String text) {
        //문자열을 char변수에 넣어 유니코드값을 비교한 후 문자열 전부 한글이면 true 아니면 false
        for (char c : text.toCharArray()) {
            if (c < '\uAC00' || c > '\uD7A3') {
                return false;
            }
        }
        return true;
    }
}
