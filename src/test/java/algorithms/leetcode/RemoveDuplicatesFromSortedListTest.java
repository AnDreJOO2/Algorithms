package algorithms.leetcode;

import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIterable;

class RemoveDuplicatesFromSortedListTest {

    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @BeforeEach
    void setUp(){
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

//    @Test
//    void deleteDuplicatesShouldPassTheTest() {
//
//        //given
//        RemoveDuplicatesFromSortedList.ListNode givenListNode = new RemoveDuplicatesFromSortedList.ListNode(1);
//        givenListNode.next = new RemoveDuplicatesFromSortedList.ListNode(1);
//        givenListNode.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
//
//        //when
//        RemoveDuplicatesFromSortedList.ListNode test = removeDuplicatesFromSortedList.deleteDuplicates(givenListNode);
//
//        //then
//        RemoveDuplicatesFromSortedList.ListNode expectedListNode = new RemoveDuplicatesFromSortedList.ListNode();
//        expectedListNode.next = new RemoveDuplicatesFromSortedList.ListNode(2);
//
//        //ToDo: write the test
//        assertThat();
//    }
}
