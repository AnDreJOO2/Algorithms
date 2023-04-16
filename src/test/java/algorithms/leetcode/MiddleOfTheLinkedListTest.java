package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.MiddleOfTheLinkedList.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class MiddleOfTheLinkedListTest {

    private MiddleOfTheLinkedList middleOfTheLinkedList;

    @BeforeEach
    void setUp() {
        middleOfTheLinkedList = new MiddleOfTheLinkedList();
    }

    @Test
    void shouldFindMiddleOfTheLinkedList() {
        //given
        ListNode givenList = new ListNode(1);
        givenList.next = new ListNode(2);
        givenList.next.next = new ListNode(3);
        givenList.next.next.next = new ListNode(4);
        givenList.next.next.next.next = new ListNode(5);

        // when
        ListNode result = middleOfTheLinkedList.middleNode(givenList);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(5);
        // then
        while (result != null) {
            assertThat(result.val).isEqualTo(expected.val);
            result = result.next;
            expected = expected.next;
        }

    }
}