package com.Ljava.design.pattem.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:06
 * @Des 负责视频开关的  工作人员
 **/
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
