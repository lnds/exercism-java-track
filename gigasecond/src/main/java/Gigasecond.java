import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class Gigasecond {

    static final long GIGA_SECOND = 1000000000L;
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay().plusSeconds(GIGA_SECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(GIGA_SECOND);
    }

    public LocalDateTime getDateTime() {
        return this.moment;
    }
}
