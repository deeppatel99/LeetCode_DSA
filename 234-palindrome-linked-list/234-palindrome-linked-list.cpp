/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    
    ListNode* reverseLinkedList(ListNode* head){
        ListNode* prev = NULL;
        ListNode* next = NULL;
        
        while(head != NULL){    
            next = head->next;  
            head->next = prev;  
            prev = head;        
            head = next;  
        }
        
        return prev;
    }
    
    bool isPalindrome(ListNode* head) {
        if(head == NULL || head->next == NULL) return true;
        
        ListNode* slow = head;
        ListNode* fast = head;
        
        // find middle of linked list
        while(fast->next != NULL && fast->next->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        
        // Reverse the right half of linked list
        slow->next = reverseLinkedList(slow->next);
        
        // move slow to right half
        slow = slow->next;
        
        // check for left half and right half equal or not
        while(slow != NULL){
            if(head->val != slow->val)
                return false;
            head = head->next;
            slow = slow->next;
        }
        
        return true;
    }
};