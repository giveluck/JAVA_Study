//학생 정보를 저장하는 클래스
public class StudentData {
    //학생 정보 필드
    String name; //학생이름(한글)
    int studentNum; //학번(양수)
    String department; //학과(한글)
    String callNum; //전화번호(010-XXXX-XXXX 형식)

    //학생 정보 생성자
    public StudentData(int studentNum, String name, String department, String callNum){
        this.studentNum = studentNum;
        this.name = name;
        this.department = department;
        this.callNum = callNum;
    }

    //학생 정보를 가져오거나 세팅할 수있는 getter,setter 메소드
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCallNum() {
        return callNum;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }
    //학생 정보를 보여주는 메소드
    public void printInformation(){
        System.out.println("학 번 : "+ studentNum);
        System.out.println("이 름 : "+ name);
        System.out.println("학 과 : "+ department);
        System.out.println("연락처 : "+ callNum);
    }
}
