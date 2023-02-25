package algorithms.leetcode;

import algorithms.leetcode.RemoveLinkedListElements.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements removeLinkedListElements;

    @BeforeEach
    void setUp() {
        removeLinkedListElements = new RemoveLinkedListElements();
    }

    @Test
    void shouldRemoveElementsWithValValueFromLinkedList() {
        //given
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);
        // when
        removeLinkedListElements.removeElements(listNode, 6);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        // then
        while (listNode.next != null) {
            assertThat(listNode.val).isEqualTo(expected.val);
            listNode = listNode.next;
            expected = expected.next;
        }

    }
}
