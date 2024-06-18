import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    private static Map<String, GeneralTask> taskMap;
    private static String userName;

    public static void main(String[] args) {
        taskMap = new HashMap<>();
        authenticate();
        taskMap.put("test limited task", new LimitedTimeTask( "taskName1 ", userName, LocalDateTime.now()));
        taskMap.put("test repeatable task", new RepeatableTask( "taskName2", userName, 1));

        edit();
    }

    public static void authenticate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter userName: ");
        userName = scanner.nextLine();
        System.out.print("userName is "+userName+"\n");
    }

    public static void edit() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter task name: ");
        String taskName = scanner.nextLine();


        if (!taskMap.containsKey(taskName)) {
            System.out.printf("task not found \n");
            return;
        }

        GeneralTask generalTask = taskMap.get(taskName);

        generalTask.setName(taskName);
        generalTask.setUserName(userName);



        if (generalTask instanceof LimitedTimeTask) {
            System.out.print("enter end date, format: yyyy-MM-dd HH:mm \n");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime date = LocalDateTime.parse(scanner.nextLine(),formatter);
            ((LimitedTimeTask) generalTask).setEndDate(date);
        }
        if (generalTask instanceof RepeatableTask) {
            System.out.print("enter task count: ");
            Integer count = Integer.valueOf(scanner.nextLine());
            ((RepeatableTask) generalTask).setTaskCount(count);
        }
        taskMap.put(generalTask.getName(), generalTask);

        System.out.printf("task updated\n" );
        generalTask.print();



    }
}