import java.util.Scanner;
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
