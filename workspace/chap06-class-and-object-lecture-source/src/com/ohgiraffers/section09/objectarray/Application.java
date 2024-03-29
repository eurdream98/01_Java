package com.ohgiraffers.section09.objectarray;

public class Application {
    public static void main(String[] args) {
        /*객체 배열에 대해 이해할 수 있다.*/

        /*동일 타입의 인스턴스를 여러 개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용이 가능하다.*/
        Car[] carArr = new Car[5];

        /*carArray의 각 인덱스는 기본 값 null로 초기화 되어 있기 때문에 인덱스별로 인스턴스를 생성해야한다.*/
        carArr[0]=new Car("페라리",300);
        carArr[1]=new Car("람보르기니",300);
        carArr[2]=new Car("롤스로이스",300);
        carArr[3]=new Car("부가티베이론",300);
        carArr[4]=new Car("포터",300);

        /*배열은 반복문을 통해 일괄 처리가 가능하다는 장점이 있다.*/
        for(int i = 0 ; i<carArr.length;i++){
            carArr[i].driveMaxSpeed();
        }

        /*객체 배열도 할당과 동시에 초기화 할 수 있다.*/
        Car[] carArray2 = {
                new Car("페라리",300),
                new Car("람보르기니",300),
                new Car("롤스로이스",300),
                new Car("부가티베이론",300),
                new Car("포터",300)
        };
        /*향상 된 for문,for each문도 사용이 가능하다.*/
        for(Car c : carArray2){
            c.driveMaxSpeed();
        }
    }
}
