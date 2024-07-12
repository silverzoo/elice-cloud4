package practice2;

class NetworkException extends Exception {
    public NetworkException(String message) {
        super(message);
    }
}

class AccountInfoException extends Exception {
    public AccountInfoException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            checkBalance(Math.random());
        } catch(NetworkException ne) {
            ne.getMessage();
        } catch(AccountInfoException ae) {
            ae.getMessage();
        }
        //getMessage()는 Throwable 클래스에 정의된 메서드로, 예외객체에 설정된 메시지를 반환한다.
        //출력하려면 반환값을 출력문에 넣어주면 된다.
    }

    static void checkBalance(double randomValue) throws NetworkException, AccountInfoException {

        if(randomValue > 0.5) throw new NetworkException("네트워크 연결 오류가 발생했습니다.");
        else throw new AccountInfoException("계좌 정보를 찾을 수 없습니다.");

        //실제로는 에러코드를 객체화 시켜서 에러코드와 에러메시지를 매핑 후 사용한다.
        //ex> new NetworkException(ElliceError(223));
    }
}
