package com.mnus.ioj.judge.codesandbox;

import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeRequest;
import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
