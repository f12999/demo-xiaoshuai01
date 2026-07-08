import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字1-7：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("周一是个帅帅的一天");
                break;
            case 2:
                System.out.println("周二也是个帅帅的一天");
                break;
            case 3:
                System.out.println("周三也也是个帅帅的一天");
                break;
            case 4:
                System.out.println("周四也也也是个帅帅的一天");
                break;    
            case 5:
                System.out.println("周五也也是个帅帅的一天");
                break;
            case 6:
                System.out.println("周六是个wow的一天");
                break;
            case 7:
                System.out.println("周日也是wow的一天");
                break;
              default:
                System.out.println("输入有点小错误，及时修改~");
        }
        sc.close();
    }
}