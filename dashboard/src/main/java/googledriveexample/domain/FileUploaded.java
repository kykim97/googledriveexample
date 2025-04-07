package googledriveexample.domain;

import googledriveexample.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date uploadedTime;
    private String type;
    private String userId;
}
