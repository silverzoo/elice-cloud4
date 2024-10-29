class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }

    // 지시사항 1. append 메소드 작성
    static Node append(Node head, int value) {
        if (head == null) {
            return new Node(value);
        }
        Node current = head;

        // 아래의 None 부분에 코드를 채워 넣으세요.
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
        return head;
    }

    // 지시사항 2. insert 메소드 작성
    static Node insert(Node head, int value, int position) {
        if (head == null && position != 0) {
            return null;
        }
        if (position == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }
        Node current = head;

        // 아래의 None 부분에 코드를 채워 넣으세요.
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    // 지시사항 3. remove 메소드 작성
    static Node remove(Node head, int value) {
        if (head == null) {
            return null;
        }

        // value 값을 가진 노드를 발견 후, 해당 노드를 삭제합니다.
        // 아래의 None 부분에 코드를 채워 넣으세요.
        if (head.data == value) {
            head = head.next;
            return head;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            return head;
        }
//        Node temp = current.next;  // update 가 아니어서 temp 쓰지 않아도 됨
        current.next = current.next.next;
//        temp = null;
        return head;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Node head = null;
        head = Node.append(head, 3);
        head = Node.append(head, 5);
        head = Node.insert(head, 4, 1);
        head = Node.remove(head, 5);

        // 지시사항 4. 리스트 순회
        // 아래의 None 부분에 코드를 채워 넣으세요.
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
