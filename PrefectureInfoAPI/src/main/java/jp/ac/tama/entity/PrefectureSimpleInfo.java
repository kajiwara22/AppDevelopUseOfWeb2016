package jp.ac.tama.entity;

import org.springframework.data.annotation.Id;

import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@Data
@Table(name="PrefectureInfo")
@AllArgsConstructor
public class PrefectureSimpleInfo {
    @Column(name = "id")
    @Id
    @PrimaryKey(generationType = PrimaryKey.GenerationType.APPLICATION)
    private int id;

    @Column(name = "name")
    private String name;

}
