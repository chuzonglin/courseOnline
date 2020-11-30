package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * chapter
 * @author 
 */
@Data
public class Chapter implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 课程ID
     */
    private String courseId;

    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}