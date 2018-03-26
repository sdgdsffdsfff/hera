package com.dfire.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 17:32 2018/1/11
 * @desc
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ZeusFile {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String owner;
    private String parent;
    private boolean folder;
    private String content;
    private Date gmtCreate=new Date();
    private Date gmtModified=new Date();
    private String hostGroupId;

}
