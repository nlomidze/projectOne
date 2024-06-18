import java.time.LocalDateTime;

public class LimitedTimeTask extends GeneralTask {

    private LocalDateTime endDate;

    public LimitedTimeTask( String name, String userName, LocalDateTime endDate) {
        super(name, userName);
        this.endDate = endDate;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("endDate: "+getEndDate());
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
