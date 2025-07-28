package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        //data.defaultField = 2; 다른 패키지라서 안돼!!!
        //data.defaultMethod();

        //data.privateField = 3; 다른 패키지에 클래스라서 안돼!!
        //data.privateMethod();

        data.innerAccess(); // 메서드 안에 넣어둔 값이 public 이었어서 나온다.
    }

}
