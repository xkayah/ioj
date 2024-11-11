package com.mnus.ioj.judge;

import com.mnus.ioj.model.entity.QuestionSubmit;

/**
 * 判题服务接口
 */
public interface JudgeService {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
