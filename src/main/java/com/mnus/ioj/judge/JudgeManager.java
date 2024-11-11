package com.mnus.ioj.judge;

import com.mnus.ioj.judge.codesandbox.model.JudgeInfo;
import com.mnus.ioj.judge.strategy.DefaultJudgeStrategy;
import com.mnus.ioj.judge.strategy.JavaLanguageJudgeStrategy;
import com.mnus.ioj.judge.strategy.JudgeContext;
import com.mnus.ioj.judge.strategy.JudgeStrategy;
import com.mnus.ioj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
