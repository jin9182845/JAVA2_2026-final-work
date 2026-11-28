import java.util.Scanner;
import java.util.Scanner; // import java.util.*; 프로그래머스는 통합 사용 가능
void main()
{
    scanner sc = new Scanner(System.in);

    System.out.println("부여할 사용자 성함 : ");
    String name = sc.next(); // Todo : 추후 객체 지향으로 처리
    System.out.println("부여할 사원 ID : ");
    String id = sc.nextInt();

    // Todo : 전산상 입력
    // char : 사용자명 입력을 scanner로 받아서 다른 class에다가 저장?
    // int : 동명의 사용자를 고려하여, 입력된 순번을 구분할 것.
    // ** 퇴사시, 해당 값을 삭제해야 함. ==> 동적 리스트로 구현하는 게 나을 듯
}

// main class에서 Scanner로 입력받은 값은, ComputerNetwork class서 기본적으로 열람이 안 되지 않는가?
//  ㄴ 1. main을 부모 class로 둘 수 있는지 확인. or '다른 class'를 만들어서 ComputerNetwork class와 protected로 공유할 수 있는지 확인.