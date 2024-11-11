package com.mnus.ioj.judge.codesandbox.impl;

import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeResponse;
import com.mnus.ioj.judge.codesandbox.CodeSandbox;
import com.mnus.ioj.judge.codesandbox.model.ExecuteCodeRequest;

/**
 * 第三方代码沙箱
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
