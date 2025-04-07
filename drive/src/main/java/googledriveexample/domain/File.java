package googledriveexample.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import googledriveexample.DriveApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
//<<< DDD / Aggregate Root
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long size;

    private Date uploadedTime;

    private String type;

    private String userId;

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
//>>> DDD / Aggregate Root
