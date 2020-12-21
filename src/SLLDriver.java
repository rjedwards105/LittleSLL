public class SLLDriver
{
    public static void main(String[] args)
    {
        LittleSLL mySLL = new LittleSLL();
        mySLL.addNodeToStart(25);
        mySLL.addNodeToStart(38);
        mySLL.addNodeToStart(-45);

        mySLL.showList();
        System.out.println("The list length is: " + mySLL.length());

        mySLL.deleteNodeFromStart();
        mySLL.showList();
        System.out.println("The list length is now: " + mySLL.length());
    }
}