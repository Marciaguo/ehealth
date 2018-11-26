package com.zhanglin.networkSlicingBackend.ms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class Slice {

    private String slice_id;
    private String slice_name;
    private String slice_switch;

}
