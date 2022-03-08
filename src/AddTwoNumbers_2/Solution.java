package AddTwoNumbers_2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        ListNode l3 = new ListNode();

        int ss1 = 0;
        int ss2 = 0;


        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }


        while(l2 != null){
            s2.append(l2.val);
            l2 = l2.next;

        }

        ss1 = Integer.parseInt(s1.toString());
        ss2 = Integer.parseInt(s2.toString());

        String sss = String.valueOf(ss1 + ss2);

        for(int i = sss.length()-1; i >= 0; i--){
            l3.val = Character.getNumericValue(sss.charAt(i));
            System.out.println("Link" + (i + 1) + " has value ---> " + l3.val);
            l3.next = new ListNode();
            l3 = l3.next;
        }



            return l3;
    }





}

