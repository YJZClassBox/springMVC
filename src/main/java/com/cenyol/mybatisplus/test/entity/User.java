package com.cenyol.mybatisplus.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 鐢ㄦ埛淇℃伅
 * </p>
 *
 * @author Cenyol
 * @since 2022-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 涓婚敭ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 濮撳悕
     */
    private String name;

    /**
     * 骞撮緞
     */
    private Integer age;

    /**
     * 閭??
     */
    private String email;


}


