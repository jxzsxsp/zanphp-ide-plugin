package com.youzan.zan.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.ui.Messages;

public class ZanMenu extends AnAction {

    private static final Logger log = Logger.getInstance(ZanMenu.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog("Hello Zan, Zan", "Hello Zan", Messages.getInformationIcon());
    }
}
