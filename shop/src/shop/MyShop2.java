package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {

  // 배열 데이터 저장
  private Customer customers[] = new Customer[5];
  private Product products[] = new Product[5];

  private String title;
  private int customerNo;

  // 장바구니
  private Product carts[] = new Product[5]; // CellPhone과 SmartTV둘다 담아야 하기 때문에

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    customers[0] = customer;

    customer = new Customer();
    customer.setName("이춘향");
    customer.setPayType(PayType.CARD);
    customers[1] = customer;

    customer = new Customer();
    customer.setName("이순신");
    customer.setPayType(PayType.CARD);
    customers[2] = customer;

    customer = new Customer();
    customer.setName("정신우");
    customer.setPayType(PayType.CARD);
    customers[3] = customer;

    customer = new Customer();
    customer.setName("이정제");
    customer.setPayType(PayType.CARD);
    customers[4] = customer;
  }

  @Override
  public void genProduct() {
    // 제품 생성 // 제품을 생산하는거니까 제품 Product를 부모로 자식인 CellPhone 이랑, SmartTV를 가져옴
    Product phone = new CellPhone("갤럭시노트", 500000, "U+");
    products[0] = phone;

    phone = new CellPhone("에이폰", 1000000, "SKTT1");
    products[1] = phone;

    phone = new CellPhone("다른거뭐있는데", 30000, "KT");
    products[2] = phone;

    SmartTV tv = new SmartTV("쒐쏭 KQ75", 1899900, "4K");
    products[3] = tv;

    tv = new SmartTV("LG OLED", 2314500, "Ultra");
    products[4] = tv;
  }

  @Override
  public void start() {
    System.out.println(title + " : 메인화면 - 계정선택");
    System.out.println("===============================");

    for (int i = 0; i < customers.length; i++) {
      System.out.printf(
        "[%d] %s(%s)\n",
        i,
        customers[i].getName(),
        customers[i].getPayType()
      );
    }
    System.out.println("[x] 종료");
    // 사용자에게 고객번호 입력받기
    System.out.print("고객 번호 >>> ");
    String cNo = sc.nextLine();
    System.out.println("\n### " + cNo + "고객 선택 ###");

    customerNo = Integer.parseInt(cNo); // 나~중에 체크아웃에서 쓸려고 받아둠

    if (cNo.equals("x")) {
      System.exit(0);
    } else { // 0~4
      productList();
    }
  }

  public void productList() {
    // 상품 목록 출력
    System.out.println("\n");
    System.out.println(title + " : 상품목록 - 상품선택");
    System.out.println("===============================");
    for (int i = 0; i < products.length; i++) {
      System.out.printf("[%d]", i);
      products[i].printDetail();
    }
    System.out.println("[h] 메인 화면");
    System.out.println("[c] 체크 아웃");

    System.out.print("상품 번호 >>> ");
    String menu = sc.nextLine(); // 0~4, c,h

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: // 0~4 에 해당하는 제품을 장바구니에 추가
        for (int i = 0; i < carts.length; i++) {
          if (carts[i] == null) {
            carts[i] = products[Integer.parseInt(menu)];
            break;
          }
        }
        productList();
    }
  }

  public void checkOut() {
    //구매
    int sum = 0;
    System.out.println("\n");
    System.out.println(title + " : 체크아웃");
    System.out.println("====================");
    for (int i = 0; i < carts.length; i++) {
      if (carts[i] != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i,
          carts[i].getPname(),
          carts[i].getPrice()
        );
        sum += carts[i].getPrice();
      }
    }
    System.out.println("\n=============");
    System.out.println("합계 : " + sum);
    System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("[p] 이전 화면");
    System.out.println("[q] 결제");
    String last = sc.nextLine();
    switch (last) {
      case "q":
        System.out.println("결제 완료.");
        System.exit(sum);
        break;
      case "p":
        productList();
        break;
    }
  }
}
//선생님이 짜신 코드
// int i = 0, total = 0;
// for (Product product : carts) {
//   if (product != null) {
//     System.out.printf(
//       "[%d] %s %d\n",
//       i,
//       product.getPname(),
//       product.getPrice()
//     );
//     total += product.getPrice();
//   }
// }
// System.out.println("===============");
// System.out.println("합계 : " + total);
// System.out.println("결제방법 : " + customers[customerNo].getPayType());
// System.out.println("[p] 이전 화면");
// System.out.println("[q] 결제");
// String meun = sc.nextLine();
// switch (meun) {
//   case "p":
//     productList();
//     break;
//   case "q":
//     System.out.println("결제가 완료 되었습니다.");
//     System.exit(total);
//     break;
// for (Product product : carts) {
// } == for (int i = 0; i < carts.length; i++) {
//   prouct = carts[i];
// }
