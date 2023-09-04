package com.exagonal.tasks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdditionalTaskInfo {
    private final Long userId;
    private final String userName;
    private final String userEmail;

}
