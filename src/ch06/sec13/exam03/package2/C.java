package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1; 다른 패키지이기에 안됨.

        a.method1();
    }
}
