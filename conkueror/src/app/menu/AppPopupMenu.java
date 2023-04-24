package app.menu;

import app.App;
import configs.AppCfg;
import util.SystemUtils;

import java.awt.*;

public class AppPopupMenu extends PopupMenu {

    private App app;

    private MenuItem menuAbout;

    public AppPopupMenu(App app) {
        this.app = app;
        setLabel(AppCfg.windowTitle);
        setName(AppCfg.windowTitle);
        initMenuItems();
    }

    private void initMenuItems() {
        {
            menuAbout = new MenuItem("About");
            menuAbout.addActionListener(e -> app.getSystemActions().openAboutDialog());
            add(menuAbout);
        }
    }

}
