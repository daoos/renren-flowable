package io.renren.modules.flowable.handler;

import org.flowable.engine.HistoryService;
import org.flowable.engine.IdentityService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngines;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 */
public class ManagerTaskHandler implements TaskListener {
  private static Logger logger = LoggerFactory.getLogger(ManagerTaskHandler.class);

  @Override
  public void notify(DelegateTask delegateTask) {

    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    RuntimeService runtimeService = processEngine.getRuntimeService();


    Object nextPerson = runtimeService.getVariable(delegateTask.getExecutionId(),"next_person");
    delegateTask.setAssignee(nextPerson.toString());
//    delegateTask.addCandidateGroup(); 增加候选组
  }

}
