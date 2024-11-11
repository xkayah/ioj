package com.mnus.ioj.judge.codesandbox.impl;

import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeResponse;
import com.mnus.ioj.judge.codesandbox.model.JudgeInfo;
import com.mnus.ioj.model.enums.JudgeInfoMessageEnum;
import com.mnus.ioj.model.enums.QuestionSubmitStatusEnum;
import com.mnus.ioj.judge.codesandbox.CodeSandbox;
import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeRequest;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
