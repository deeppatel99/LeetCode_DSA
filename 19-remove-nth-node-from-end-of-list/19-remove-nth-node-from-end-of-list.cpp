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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = new ListNode();
        temp->next = head;
        ListNode* fast = temp;
        ListNode* slow = temp;
        int count = 0;
        
        while(count != n){
            fast = fast->next;
            count++;
            cout<<count<<" ";
        }
        
        while(fast->next != NULL){
            slow = slow->next;
            fast = fast->next;
        }
        
        slow->next = slow->next->next;
        
        
        return temp->next;
        
    }
};