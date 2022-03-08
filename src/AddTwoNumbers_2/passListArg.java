package AddTwoNumbers_2;

public class passListArg {


     void takeList(ListNode l1) {

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public static String reverse(String s){
        if(s.length() == 0)
            return "";
        else
            return  reverse(s.substring(1) + s.charAt(0)) ;
    }
}
