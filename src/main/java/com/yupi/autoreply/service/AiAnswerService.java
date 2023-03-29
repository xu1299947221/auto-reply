package com.yupi.autoreply.service;

import com.yupi.autoreply.api.openai.model.CreateCompletionRequest;
import com.yupi.autoreply.api.openai.model.CreateCompletionResponse;

/**
 * @Author: 项目负责人
 * Date: 2023-03-29 15:35
 * @Description:
 **/
public interface AiAnswerService {

    public String doAnswer(String prompt);

    public CreateCompletionResponse createCompletion(CreateCompletionRequest request, String openAiApiKey);
}
