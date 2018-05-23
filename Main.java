public class Main
{



    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();


        linkedIntList.add(1);
        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(4);
        linkedIntList.add(5);

        System.out.println(linkedIntList.size());

        set(linkedIntList, 3, 5);
        System.out.println(linkedIntList.size());

        System.out.println(linkedIntList);


    }

    public static void set (LinkedIntList linkedIntList, int index, int value)
    {
        ListNode current = linkedIntList.getFront();
        for (int i = 0; i < linkedIntList.size() ; i++)
        {
            if (i == index -1 )
            {
                int newValue = value;
                current.data = newValue;
            }

            current = current.next;
        }
    }

}
