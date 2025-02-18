
class LN {
    int val;
    LN next;

    LN(int x) {
        this.val = x;
        this.next = null;
    }
}
public class linkedlist_cyclic {
    public static void main(String[] args) {
        //apporach floydeds cycle algorothim
        //detet if a cycleis present in linkedlst ,if present remove it
        LN head = new LN(1);
        head.next = new LN(2);
        head.next.next = new LN(3);
        head.next.next.next = new LN(4);
        head.next.next.next.next = new LN(5);
        head.next.next.next.next.next=head.next;
        System.out.println("C D"+detectCycle(head));
        removeCycle(head);
        System.out.println("C B"+detectCycle(head));

}
public static boolean detectCycle(LN head) {
    LN slow = head;
    LN fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;         // move one step
        fast = fast.next.next;    // move two steps
        if (slow == fast) {       // cycle detected
            return true;
        }
    }
    return false;
}
public static void removeCycle(LN head) {
    LN slow = head;
    LN fast = head;
    boolean cycle = false;

    // First, detect the cycle and get the meeting point
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) { // cycle detected
            cycle = true;
            break;
        }
    }

    // If no cycle, return the head as is
    if (!cycle) {
        return;
    }
    slow=head;
    while(slow.next!=fast.next){
        slow = slow.next;
        fast = fast.next;
    }
    fast.next=null;
}

}
