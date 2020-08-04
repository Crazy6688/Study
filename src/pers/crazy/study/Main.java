package pers.crazy.study;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        var main = new Main();

        var root = main.new ListNode(1);
        var p = root;
        for (var i = 2; i <= 5; i++) {
            p = p.next = main.new ListNode(i);
        }

        var ret = main.reverseList(root);

    }

    public ListNode reverseList(ListNode head) {

        ListNode parent = null, cur = head;
        while (cur != null) {
            var old = cur.next;
            cur.next = parent;
            parent = cur;
            cur = old;
        }
        return parent;

        //   return G(head, null);

    }

    public ListNode G(ListNode head, ListNode parent) {
        if (head == null)
            return null;

        var old = head.next;
        head.next = parent;
        if (old == null)
            return head;
        return G(old, head);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" + "val= " + val + '}';
        }
    }
}
