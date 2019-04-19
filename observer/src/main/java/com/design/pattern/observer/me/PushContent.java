package com.design.pattern.observer.me;

import lombok.Data;

/**
 * @author zhuzhenke
 * @date 2019/4/19
 */
@Data
public class PushContent {
    private String project;
    private String commit;

    public PushContent() {
    }

    public PushContent(String project, String commit) {
        this.project = project;
        this.commit = commit;
    }
}
