public class RepeatableTask extends GeneralTask {
    private Integer taskCount;

    public RepeatableTask( String name, String userName, Integer taskCount) {
        super(name, userName);
        this.taskCount = taskCount;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("taskCount: "+getTaskCount());
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }
}
