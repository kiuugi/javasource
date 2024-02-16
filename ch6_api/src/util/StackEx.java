package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// java.util.List
// 1. ArrayList
// 2. LinkedList
// 3. Stack : LIFO(Last In First Out) - 수식계산, 수식솰호검사, undo/redo, 웹 브라우저의 뒤로/앞으로 // 처음 들어간 데이터가 마지막으로 나감 LIFO
// 4. Queue : FIFO(First In First Out) - 최근 사용문서, 인쇄작업 대기목록, 버퍼 // 처음 들어간 데이터가 처음으로 나감 FIFO
public class StackEx {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

    // stack : push() / pop()
    stack.push("0");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop()); // 0~4 순서로 넣었지만 가장 마지막에 넣은 4 부터 출력됨
    }

    // offer(), poll()
    queue.offer("사과");
    queue.offer("배");
    queue.offer("딸기");
    queue.offer("바나나");
    queue.offer("수박");

    while (!queue.isEmpty()) {
      System.out.println(queue.poll()); // 넣은 순서 그래도 출력됨
    }
  }
}
