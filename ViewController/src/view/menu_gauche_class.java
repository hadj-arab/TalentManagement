package view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.event.ItemEvent;

public class menu_gauche_class implements Serializable {
    private String taskFlowId = "/WEB-INF/menu-gauche-task-flow-definition.xml#menu-gauche-task-flow-definition";

    public menu_gauche_class() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String competencestaskflowdefinition() {
        setDynamicTaskFlowId("/WEB-INF/competences-task-flow-definition.xml#competences-task-flow-definition");
        return null;
    }

    public void show_formations(ItemEvent itemEvent) {
        // Add event code here...
    }
}
